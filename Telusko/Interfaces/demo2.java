package Telusko.Interfaces;

interface computer{
    void code();
}

class laptop implements computer{
    public void code(){
        System.out.println("Coding in Laptop");
    }
}

class desktop implements computer{
    public void code(){
        System.out.println("Coding in Desktop");
    }
}

class developer{
    public void code(computer c){
        c.code();
    }
}

public class demo2 {
    public static void main(String[] args) {
        
        developer d = new developer();
        d.code(new laptop());
        d.code(new desktop());
    }    
}
