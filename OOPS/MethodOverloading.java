public class MethodOverloading {
    
    static class Animal{
        void eat(){
            System.out.println("Eats anything");
        }
    }
    static class deer extends Animal{
        void eat(){
            System.out.println("Deer eats grass");
        }
    }
    public static void main(String[] args) {
        deer d1 = new deer();
        d1.eat();
    }
}
