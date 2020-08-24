public class Building {
    protected int numFloors, numRooms;
    protected float floorArea;

    public Building(int numFloors, int numRooms, float floorArea) {
        this.numFloors = numFloors;
        this.numRooms = numRooms;
        this.floorArea = floorArea;
    }

    public void showData() {
        System.out.println("This is Building class");
    }
}