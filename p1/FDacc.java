package p1;

class FDacc extends Acc {
    double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public FDacc(String acNo, String name, double bal) {
        super(acNo, name, bal);
    }

    public double calInterest() {
        return bal * rate / 100;
    }
}
