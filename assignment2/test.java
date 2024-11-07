package assignment2;

public class test {
    public static void main(String[] args) {
        Hostel hostel = new Hostel();
        hostel.displayVacantRooms();
        
        hostel.addTenant("John", "R1");
        hostel.addTenant("Jane", "R2");
        hostel.addTenant("Jack", "R3");
        
        hostel.displayAllTenants();
        hostel.displayVacantRooms();
    }
}
