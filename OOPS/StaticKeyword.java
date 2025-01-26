public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.College = "KIIT University";
        Student s2 = new Student();
        System.out.println(s2.College);
        s2.College = "IIT Madras";
        System.out.println(s1.College);
        System.out.println(s2.College);
    } 
}

class Student{
    String name;
    int rollNo;

    static String College;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
