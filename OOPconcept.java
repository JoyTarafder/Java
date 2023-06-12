class Pen {
    String color;
    String type;// ballpoint, gel

    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    Integer age;

    // public void printInfo() {
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    // Student() { // non perametter Constructor 
    //     System.out.println("Constructor called");
    // }

    // Student(String name, int age) { // perametter Constructor 
    //     this.name = name;
    //     this.age = age;
    // }
    // Student(Student s2) { // copy Constructor 
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }

    // Student() {

    // }

    // polymorphism
    // Overloading
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

// Inheritance
 
class Shape { // Parent Class
    String color;

    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape { // Sub class -- single
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}
// multi level
// class EquilateralTriangle extends Triangle {
//     public void area(int l, int h) {
//         System.out.println(1 / 2 * l * h);
//     }
// }

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
    
}


public class OOPconcept {
    public static void main (String args[]) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // pen1.write();
        // pen1.printColor(); 

        // Student s1 = new Student("Joy",24); // use perametter constructor 
        // Student s1 = new Student();
        // s1.name = "Joy Tarafder";
        // s1.age = 24;

        // // Student s2= new Student(s1);
        // s1.printInfo(s1.name);

        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
