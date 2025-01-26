public class Abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.skinColor);
        // h.changeColor();
        // System.out.println(h.skinColor);

        // Chicken c = new Chicken();
        // c.eat();   
        // c.walk();

        // Animal a = new Animal();     We cannot create an object of an abstract class

        Mustang m = new Mustang();
    }
}

abstract class Animal{
    String skinColor;
    Animal() {
        skinColor = "Brown";
        System.out.println("Animal is created");
    }
    void eat() {
        System.out.println("Animal is eating");
    }

    abstract void walk();       // Abstract method as we have not menttioned the implementation
}

class Horse extends Animal{
    Horse() {
        System.out.println("Horse is created");
    }
    void changeColor() {
        skinColor = "Dark Brown";
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang is created");
    }
}

class Chicken extends Animal {
    void changeColor() {
        skinColor = "White";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
