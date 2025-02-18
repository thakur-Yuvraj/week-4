package reflection.advancedlevel.dependencyinjection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {
    private Map<Class<?>, Object> instances = new HashMap<>();

    public void register(Class<?> clazz) {
        try {
            Object instance = clazz.getDeclaredConstructor().newInstance();
            instances.put(clazz, instance);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + clazz.getName(), e);
        }
    }

    public <T> T getInstance(Class<T> clazz) {
        return clazz.cast(instances.get(clazz));
    }

    public void injectDependencies() {
        for (Object instance : instances.values()) {
            for (Field field : instance.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    Class<?> fieldType = field.getType();
                    Object dependency = instances.get(fieldType);
                    if (dependency != null) {
                        field.setAccessible(true);
                        try {
                            field.set(instance, dependency);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException("Failed to inject dependency into " + instance.getClass().getName(), e);
                        }
                    } else {
                        throw new RuntimeException("No dependency found for " + fieldType.getName());
                    }
                }
            }
        }
    }
}