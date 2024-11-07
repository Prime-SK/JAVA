package assignment2;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Hostel hostel = new Hostel();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1. Display vacant rooms");
            System.out.println("2. Add tenant");
            System.out.println("3. Remove tenant");
            System.out.println("4. Display all tenants");
            System.out.println("5. Check room Availability");
            System.out.println("6. Make payment");
            System.out.println("7. Total payment for room");
            System.out.println("8. Payment Status of a tenant for month");
            System.out.println("9. Tenants with missing payment for month");
            System.out.println("10. Payment history of a tenant");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    hostel.displayVacantRooms();
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine().toLowerCase();
                    System.out.print("Enter room ID (R1 - R50): ");
                    String roomID = sc.nextLine().toUpperCase();
                    if(hostel.addTenant(name, roomID)){
                        System.out.println("Tenant Added");
                    }else{
                        System.out.println("Error!");
                    }
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    name = sc.nextLine().toLowerCase();
                    if(hostel.removeTenant(name)){
                        System.out.println("Tenant Removed");
                    }else{
                        System.out.println("Error!");
                    }
                    break;
                case 4:
                    hostel.displayAllTenants();
                    break;
                case 5:
                    System.out.print("Enter room ID: ");
                    roomID = sc.nextLine().toUpperCase();
                    if(hostel.isRoomAvailable(roomID)){
                        System.out.println("Available");
                    }else{
                        System.out.println("Not Available");
                    }
                    break;
                case 6:
                    System.out.print("Enter tenant name: ");
                    name = sc.nextLine().toLowerCase();
                    System.out.print("Enter month: ");
                    int month = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    if(hostel.makePayment(name, month, amount)){
                        System.out.println("Payment made");
                    }else{
                        System.out.println("Error!");
                    }
                    break;
                case 7:
                    System.out.print("Enter room ID: ");
                    roomID = sc.nextLine().toUpperCase();
                    System.out.println("Total rent for room " + roomID + " is " + hostel.getTotalRentForRoom(roomID));
                    break;
                case 8:
                    System.out.print("Enter tenant name: ");
                    name = sc.nextLine().toLowerCase();
                    System.out.print("Enter month: ");
                    month = sc.nextInt();
                    sc.nextLine();
                    hostel.tenantHasPaidForMonth(name, month);
                    break;
                case 9:
                    System.out.print("Enter month: ");
                    month = sc.nextInt();
                    sc.nextLine();
                    hostel.notPaidForMonth(month);
                    break;
                case 10:
                    System.out.print("Enter tenant name : ");
                    name = sc.nextLine().toLowerCase();
                    hostel.paymentHistoryOfTenant(name);
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
