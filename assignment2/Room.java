package assignment2;

public class Room {
    private String roomID;
    private boolean isOccupied;

    public Room(String roomID) {
        this.roomID = roomID;
        this.isOccupied = false;
    }

    public String getRoomID() {
        return roomID;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
}
