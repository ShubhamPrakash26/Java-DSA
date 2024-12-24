public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen();     //created a pen object as p1
        p1.setColor("blue");    //initialization of color
        System.out.println(p1.getColor());
        p1.setTip(5);           //initialization of tip
        System.out.println(p1.getTip());
        p1.setColor("Yellow"); //reassigning color

        //p1.setColor("Yellow");
        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();      //new banck account object
        myAcc.username = "ShubhamPrakash";
        myAcc.changePassword("password123");
    }
}

class BankAccount{
    public String username;       //public variable
    private String password;     //private variable

    void changePassword(String newPass){    //method to change password
        password = newPass;
    }
}
class Pen{
    private String color;
    private int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}

class Student{
    String name;
    int age;
    float percentage;
    
    void calcPercnetage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
    }
}