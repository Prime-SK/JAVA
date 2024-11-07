package p1;

abstract class Acc {
   String acNo;
   String name;
   double bal;
   
   public void deposit(double amt) {
      this.bal += amt;
   }

   public Acc(String acNo, String name, double bal) {
      this.acNo = acNo;
      this.name = name;
      this.bal = bal;
   }

   public abstract double calInterest();

   public void display() {
      System.out.println("Account No: " + acNo);
      System.out.println("Name: " + name);
      System.out.println("Balance: " + bal);
   }
}
