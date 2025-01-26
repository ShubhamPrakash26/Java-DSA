public class MultipleInheritance {
    public static void main(String[] args) {
        Beer b = new Beer();
        b.eat();
        b.teeth();
    }
}

interface Herbivore{
    void eat();
}

interface Carnivore{
    void teeth();
}

class Beer implements Herbivore, Carnivore{
    public void eat() {
        System.out.println("Beer eats both plants and animals");
    }
    public void teeth() {
        System.out.println("Beer has sharp teeth");
    }
}
