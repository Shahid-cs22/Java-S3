//Write a program to create a class named shape. In this class we have three sub
 //classes circle, triangle and square each class has two member function named  
 //draw () and erase (). Create these using polymorphism conpts.


class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

    void erase() {
        System.out.println("Erasing a shape");
    }
}

class Circle extends Shape {
   
    void draw() {
        System.out.println("Drawing a circle");
    }

    
    void erase() {
        System.out.println("Erasing a circle");
    }
}

class Triangle extends Shape {
   
    void draw() {
        System.out.println("Drawing a triangle");
    }

  
    void erase() {
        System.out.println("Erasing a triangle");
    }
}

class Square extends Shape {
    
    void draw() {
        System.out.println("Drawing a square");
    }

    
    void erase() {
        System.out.println("Erasing a square");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape triangle = new Triangle();
        Shape square = new Square();

       
        displayShapeDetails(circle);
        displayShapeDetails(triangle);
        displayShapeDetails(square);
    }

    private static void displayShapeDetails(Shape shape) {
        shape.draw();
        shape.erase();
        System.out.println();
    }
}
