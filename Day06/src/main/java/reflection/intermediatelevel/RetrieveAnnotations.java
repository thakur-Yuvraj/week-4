package reflection.intermediatelevel;

import java.lang.reflect.Method;


import java.lang.annotation.*;

// Define Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author {
    String name();
}


class Book {
    @Author(name = "Shiva")
    public void myMethod() {
        System.out.println("Executing myMethod()");
    }
}

public class RetrieveAnnotations {
    public static void main(String[] args) throws Exception{
        Book book = new Book();
        Class<?> cls = book.getClass();

        Method method = cls.getMethod("myMethod");

        if(method.isAnnotationPresent(Author.class)){
            Author author = method.getAnnotation(Author.class);
            System.out.println(author.name());
        }
        method.invoke(book);
    }

}
