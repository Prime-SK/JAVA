package Telusko;

class AB{ // = public AB extends Object{}
    public AB(){  
        super();    //THIS HAS NO PARENT CLASS
                    //EVERY SUPERCLASS EXTENDS TO " Object.class "
        System.out.println("in AB");
    }
    public AB(int n){
        super();
        System.out.println("in AB int");
    }
}

class CD extends AB{
    public CD(){
        super(); 
        System.out.println("in CD");
    }
    public CD(int n){
        //super(n);   
        //BY GIVING A PARAMETER TO super(); 
        //WE ACCESS THE PARAMETERIZED CONSTRUCTOR OF AB CLASS

        this(); //TO CALL THE CONSTUCTOR OF THE SAME CLASS
        System.out.println("in CD int");
    }
}

public class Demo4 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // CD obj1 = new CD();
        CD obj2 = new CD(5);
        /*
            When this line is executed,
             - goes to the parameterized constructor of CD class
             - because of " this(); " next goes to the default constructor of CD class
             - by default everyconstructor has " super(); "
             - from " super(); " goes to the constructor of AB class
             - there prints "in AB int"
             - then "in CD"
             - finally "in CD int"

            public CD(int n){
                this(); ------->public CD(){
                                    ------->public AB(){  
                                                01. System.out.println("in AB");
                                            }
                                    02. System.out.println("in CD");
                                }
                03. System.out.println("in CD int");
            }
         */
    }
}

/*
 * BY DEFAULT IN EVERY CONSTRUCTOR THE FIRST STATEMENT
 * IS A METHOD CALLED " super(); " EVEN IF WE DON'T MENTION IT
 * THIS METHOD REFERS TO THE CONSTRUCTOR OF THE PARENT CLASS
 */