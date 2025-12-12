public class OOPS {
    public static void main(String args[]) {
            Pen p1 = new Pen();
            p1.setColor("red");
            System.out.println(p1.getColor());
            p1.setTip(9);
            System.out.println(p1.getTip());
            // p1.color = "orange";
            p1.setColor("YELLOW");
            System.out.println(p1.getColor());

            // BankAccount myAcc = new BankAccount();
            // myAcc.username = "Bahubali";
            // myAcc.setPassword("lasdjfeioklerjoi");
    }
}

// class BankAccount{
//     public String username;
//     private String password;
//     default void setPassword(String pwd) {
//         password = pwd;
//     }
// }

class Pen{
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}

// class student {
//     String name;
//     int age; 
//     float percentage; //CGPA

//     void calPercentage(int phy, int chem, int math) {
//         percentage = (phy + chem + math) / 3;
//     }
// }