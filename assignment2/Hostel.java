package assignment2;

import java.util.ArrayList;

public class Hostel {
    Room[] rooms = new Room[50];
    ArrayList<Tenant> tenants = new ArrayList<Tenant>();

    public Hostel() {
        for (int i = 0; i < 50; i++) {
            rooms[i] = new Room("R" + (i + 1));
        }
    }

    public void displayVacantRooms() {
        for (int i = 0; i < 50; i++) {
            if (!rooms[i].getIsOccupied()) {
                System.out.print(rooms[i].getRoomID() + " ");
            }
        }
        System.out.println();
    }

    public boolean addTenant(String name, String roomID) {
        for (int i = 0; i < 50; i++) {
            if (rooms[i].getRoomID().equals(roomID)) {
                if(rooms[i].getIsOccupied()==false){
                    rooms[i].setIsOccupied(true);
                    Tenant tenant = new Tenant(name, roomID);
                    tenants.add(tenant);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean removeTenant(String name) {
        for (int i = 0; i < tenants.size(); i++) {
            if (tenants.get(i).getName().equals(name)) {
                for (int j = 0; j < 50; j++) {
                    if (rooms[j].getRoomID().equals(tenants.get(i).getRoomID())) {
                        rooms[j].setIsOccupied(false);
                        break;
                    }
                }
                tenants.remove(i);
                return true;
            }
        }
        return false;
    }

    public void displayAllTenants() {
        for (int i = 0; i < tenants.size(); i++) {
            System.out.println(tenants.get(i).getName() + " , " + tenants.get(i).getRoomID());
        }
    }

    public boolean isRoomAvailable(String roomID){
        for (int i = 0; i < 50; i++) {
            if (rooms[i].getRoomID().equals(roomID)) {
                if(rooms[i].getIsOccupied()==false){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean makePayment(String name, int month, double amount) {
        for (int i = 0; i < tenants.size(); i++) {
            if (tenants.get(i).getName().equals(name)) {
                if (tenants.get(i).makePayment(amount, month)){
                    return true;
                }
            }
        }
        return false;
    }

    public double getTotalRentForRoom(String roomID) {
        double total = 0;
        for (int i = 0; i < tenants.size(); i++) {
            if (tenants.get(i).getRoomID().equals(roomID)) {
                total += tenants.get(i).getTotalPayments();
            }
        }
        return total;
    }
    
    public boolean tenantHasPaidForMonth(String name, int month) {
        for (int i = 0; i < tenants.size(); i++) {
            if (tenants.get(i).getName().equals(name)) {
                if (tenants.get(i).hasPaidForMonth(month)) {
                    System.out.println("Tenant has paid for month " + month);
                    return true;
                } else {
                    System.out.println("Tenant has not paid for month " + month);
                    return false;
                }
            }
        }
        return false;
    }

    public void notPaidForMonth(int month) {
        for (int i = 0; i < tenants.size(); i++) {
            if (!tenants.get(i).hasPaidForMonth(month)) {
                System.out.println(tenants.get(i).getName());
            }
        }
    }

    public boolean paymentHistoryOfTenant(String name){
        for (int i = 0; i < tenants.size(); i++) {
            if (tenants.get(i).getName().equals(name)) {
                tenants.get(i).paymentHistory();
                return true;
            }
        }
        return false;
    }
}
