package P23;

class Base {
    public void print() {
        System.out.println("Base : Print");
    } 
}

abstract class test extends Base {
    public static void main(String[] args) {
        Base obj = new Base();
        obj.print();
    }
}
