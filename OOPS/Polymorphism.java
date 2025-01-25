class Polymorphism{
    public static void main(String[] args) {
        Animal d = new Dog();
        d.eat();
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(2, 3));
        // System.out.println(calc.sum(2, 3, 4));
        // System.out.println(calc.sum(2.5f, 3.5f));
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating");
    }
}

class Calculator{
    int sum(int a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
    float sum(float a, float b){
        return a + b;
    }
}