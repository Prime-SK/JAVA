package aug7;

import java.util.ArrayList;

public class bank {
    private ArrayList<bankAcc> accounts = new ArrayList<>();

    // Getter
    public ArrayList<bankAcc> getAccounts() {
        return accounts;
    }

    // Search account
    private int search(String a) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNo().equals(a)) {
                return i;
            }
        }
        return -999; // -1 is considered as the last value of array in some languages
    }

    public boolean addBankAccount(String n, String a) {
        if (search(a) == -999) {
            bankAcc acc = new bankAcc(n, a);
            accounts.add(acc);
            return true;
        }
        return false;
    }
    public boolean addGoldAccount(String n, String a, double overdraftLimit) {
        if (search(a) == -999) {
            bankAcc acc = new goldAcc(n, a, overdraftLimit);
            accounts.add(acc);
            return true;
        }
        return false;
    }

    public boolean removeBankAccount(String a) {
        if (search(a) == -999) {
            return false;
        }
        accounts.remove(search(a));
        return true;
    }

    public boolean depositAmount(String a, double amount) {
        if (search(a) != -999) {
            (accounts.get(search(a))).deposit(amount);
            return true;
        }
        return false;
    }

    public boolean withdrawAmount(String a, double amount) {
        if (search(a) != -999) {
            if ((accounts.get(search(a))).withdraw(amount)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void getInfo(String a) {
        if (search(a) != -999) {
            (accounts.get(search(a))).getAccountInfo();
        } else {
            System.out.println("    ! Account Not Found");
        }
    }
}
