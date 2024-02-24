// Write a program to demonstrate static variables, methods, and blocks
public class StaticDemo {

    static int staticVariable = 10;

    
    static {
        System.out.println("This is a static block. Static variable value: " + staticVariable);//10
    }

    
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        System.out.println("Accessing static variable: " + staticVariable);//10

        staticMethod();
    }
}




