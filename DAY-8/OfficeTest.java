class Building {
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

class House extends Building {
    private int numBedrooms, numBathrooms;

    public House(int numFloors, int numRooms, float floorArea, int numBedrooms, int numBathrooms) {
        super(numFloors, numRooms, floorArea);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }

    public void showData() {
        super.showData();
        System.out.println("Number of Floors: " + numFloors);
        System.out.println("Number of rooms: " + numRooms);
        System.out.println("Floor Area: " + floorArea);
        System.out.println("Number of Bedrooms: " + numBedrooms);
        System.out.println("Number of Bathrooms: " + numBathrooms);
    }
}

class Office extends Building {
    private int numTelephones, numTables;

    public Office(int numFloors, int numRooms, float floorArea, int numTelephones, int numTables) {
        super(numFloors, numRooms, floorArea);
        this.numTelephones = numTelephones;
        this.numTables = numTables;
    }

    public void showData() {
        super.showData();
        System.out.println("Number of Floors: " + numFloors);
        System.out.println("Number of rooms: " + numRooms);
        System.out.println("Floor Area: " + floorArea);
        System.out.println("Number of Telephones: " + numTelephones);
        System.out.println("Number of Tables: " + numTables);
    }
}

public class OfficeTest {
    public static void main(String[] args) {
        House h = new House(3, 8, 1500, 3, 4);
        Office o = new Office(10, 12, 2000, 1270, 1200);
        h.showData();
        System.out.println("--------------------------------");
        o.showData();
    }
}