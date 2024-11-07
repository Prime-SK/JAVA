package aug7;

import java.util.Scanner;

class bankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank bank = new bank();

        while (true) {
            System.out.println("+------------BANK-----------+");
            System.out.println("| 1 - Add Bank Account      |");
            System.out.println("| 2 - Remove Bank Account   |");
            System.out.println("| 3 - Deposit Money         |");
            System.out.println("| 4 - Withdraw Money        |");
            System.out.println("| 5 - Get Account Info      |");
            System.out.println("| 6 - Exit                  |");
            System.out.println("+---------------------------+");
            System.out.print("Select an option from the above menu: ");

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 6) {
                System.out.println("Exitting Bank...");
                break;
            }

            String hNumber;
            String hName;
            int acType;
            double odLimit;
            double amount;

            switch (op) {
                case 1:
                    System.out.println("- Add Bank Account -");
                    System.out.print("    General Account(0) / Gold Account(1) : ");
                    acType = sc.nextInt();
                    sc.nextLine();
                    if (acType == 0) {
                        System.out.print("    Enter The Account Holder Name : ");
                        hName = sc.nextLine();
                        System.out.print("    Enter The Account Number : ");
                        hNumber = sc.nextLine();
                        if (bank.addBankAccount(hName, hNumber)) {
                            System.out.println("    Account Added Successfully");
                        } else {
                            System.out.println("    ! Account Number Already Exists");
                        }
                    }else if (acType == 1) {
                        System.out.print("    Enter The Account Holder Name : ");
                        hName = sc.nextLine();
                        System.out.print("    Enter The Account Number : ");
                        hNumber = sc.nextLine();
                        System.out.print("    Enter The Overdraft limit : ");
                        odLimit = sc.nextDouble();
                        sc.nextLine();
                        if (bank.addGoldAccount(hName, hNumber, odLimit)) {
                            System.out.println("    Account Added Successfully");
                        } else {
                            System.out.println("    ! Account Number Already Exists");
                        }                        
                    }else{
                        System.out.println("    Invalid Account Type");
                    }                   
                    break;
                case 2:
                    System.out.println("- Remove Bank Account -");
                    System.out.print("    Enter The Account Number : ");
                    hNumber = sc.nextLine();
                    if (bank.removeBankAccount(hNumber)) {
                        System.out.println("    Account Removed Successfully");
                    } else {
                        System.out.println("    ! Account Not Found");
                    }
                    break;
                case 3:
                    System.out.println("- Deposit -");
                    System.out.print("    Enter The Account Number : ");
                    hNumber = sc.nextLine();
                    System.out.print("    Enter The Amount To Deposit : ");
                    amount = sc.nextDouble();
                    sc.nextLine();
                    if (bank.depositAmount(hNumber, amount)) {
                        System.out.println("    Deposit Successful");
                    } else {
                        System.out.println("    ! Deposit Unsuccessful");
                    }
                    break;
                case 4:
                    System.out.println("- Withdraw -");
                    System.out.print("    Enter The Account Number : ");
                    hNumber = sc.nextLine();
                    System.out.print("    Enter The Amount To Withdraw : ");
                    amount = sc.nextDouble();
                    sc.nextLine();
                    if (bank.withdrawAmount(hNumber, amount)) {
                        System.out.println("    Withdraw Successful");
                    } else {
                        System.out.println("    ! Withdraw Unsuccessful");
                    }
                    break;
                case 5:
                    System.out.print("    Enter The Account Number : ");
                    hNumber = sc.nextLine();
                    bank.getInfo(hNumber);
                    break;
                default:
                    System.out.println("! Invalid option. Please try again.");
            }
        }
        sc.close(); // Close the Scanner here, after the while loop
    }
}