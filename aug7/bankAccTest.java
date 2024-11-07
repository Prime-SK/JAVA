package aug7;

import java.util.ArrayList;

public class bankAccTest {
    public static void main(String[] args) {
        bankAcc ac1 = new bankAcc("THATHSRSA", "123567");
        ac1.deposit(4500);
        // ac1.getAccountInfo();

        if (ac1.withdraw(5000)) {
            System.out.println("Withdarw Successful");
        }else{
            System.out.println("Withdraw Unsuccessful");
        }

        bankAcc ac2 = new bankAcc("Shakila", "34567890");
        // bankAcc ac3 = new bankAcc("GasBalla", "5678976543");
        System.out.println( ac2.getAccountNo());
        System.out.println( ac2.getName());
        System.out.println( ac2.getBalance());
        ac2.setName("Thathsara");
        System.out.println( ac2.getName());
        ac2.getAccountInfo();

        int[] arr = new int[10];
        System.out.println(arr.length);
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr.length);

        ArrayList<Integer> array = new ArrayList<>();
        System.out.println(array.size());
        array.add(10);
        array.add(20);
        System.out.println(array.size());
        System.out.println(array.get(1));

        // bankAcc[] accounts = new bankAcc[10];

        // accounts[0] = ac1;
        // accounts[1] = ac2;

        // accounts[1].deposit(10000);
        // // accounts[1].getAccountInfo();


        // //ARRAY LIST

        // ArrayList<bankAcc> acs = new ArrayList<>();

        // acs.add(ac1);
        // acs.add(ac2);

        // acs.get(0).deposit(2000);
        // acs.get(1).deposit(4000);
        // acs.get(1).withdraw(6500);


        // System.out.println(acs.size());
        // acs.add(2, ac3);
        // // for (bankAcc bankAcc : acs) {
        // //     bankAcc.getAccountInfo();
        // // }

        // bank bank = new bank();
        // bank.addBankAccount("", "12345");
        // bank.addBankAccount("def", "45678");
        // bank.addBankAccount("ghi", "45678");
        // bank.addBankAccount("jkl", "17868");
        // bank.addBankAccount("mno", "12345");
        // bank.addBankAccount("pqr", "09764");

        // bank.removeBankAccount("12345");

        // for (bankAcc bankAcc : bank.getAccounts()) {
        //     bankAcc.getAccountInfo();
        // }
    }
}
