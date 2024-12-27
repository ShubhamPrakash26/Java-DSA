public class Inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.bark();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eating");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
    void breathe(){
        System.out.println("Breathing");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Fish is Swimming");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}

class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("Walking");
    }
}

class Dog extends Mammals{
    String breed;
    void bark(){
        System.out.println("Barking");
    }
}
