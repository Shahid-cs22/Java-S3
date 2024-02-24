// Write a program to give the example for ‘super’ keyword
class Animal2 {
    String sound = "Animal Sound";

    void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animal {
    String sound = "Bark";

    void makeDogSound() {
        System.out.println(sound);
    }

    void displayAnimalSound() {
        super.makeSound(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeDogSound(); 
        myDog.displayAnimalSound(); 
    }
}
