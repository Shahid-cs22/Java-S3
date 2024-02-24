// Write a program to give the example for method overriding concepts
class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
   
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();

        genericAnimal.makeSound();

       
        dog.makeSound();
    }
}
