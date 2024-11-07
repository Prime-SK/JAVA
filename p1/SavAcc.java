package p1;

class SavAcc extends FDacc{
    public SavAcc(String acNo, String name, double bal) {
        super(acNo, name, bal);
    }

    public void witdraw(double amt) {
        if (bal >= amt) {
            bal -= amt;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double calInterest() {
        return bal * rate / 100 / 12;
    }
}
