package Telusko.Enumaration;

enum Status{
    Pending,Running,Failed,Success; // by default these are public static final
    // 0    , 1     , 2    , 3
    //ordinal() gives the index of the enum
    //index starts from 0
}

public class demo {
    public static void main(String[] args) {
        Status status = Status.Success;
        System.out.println(status);
        System.out.println(status.ordinal()); // gives the index of the enum

        Status[] arr = Status.values(); // returns an array of all the enum values

        System.out.println(arr[0]);

        for(Status s: arr){
            System.out.println(s.ordinal() + " : " + s);
        }
        System.out.println();

        if(status == Status.Running)
            System.out.println("All good");
        else if(status == Status.Pending)
            System.out.println("Wait");
        else if(status == Status.Failed)
            System.out.println("Try Again");
        else
            System.out.println("Done");
        
        System.out.println();

        // switch case
        switch(status){
            case Running:
                System.out.println("All good");
                break;
            case Pending:
                System.out.println("Wait");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Success:
                System.out.println("Done");
                break;
        }
    }
}
