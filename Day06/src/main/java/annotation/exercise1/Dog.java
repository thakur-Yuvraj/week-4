package annotation.exercise1;

class Dog extends Animal {
    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}