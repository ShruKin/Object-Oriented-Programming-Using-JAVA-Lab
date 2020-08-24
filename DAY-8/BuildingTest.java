class House extends Building {
    private int numBedrooms, numBathrooms;

    public House(int numFloors, int numRooms, float floorArea, int numBedrooms, int numBathrooms) {
        super(numFloors, numRooms, floorArea);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }

    public void showData(){
        super.showData();
        System.out.println("Number of Floors: " + numFloors);
        System.out.println("Number of rooms: " + numRooms);
        System.out.println("Floor Area: " + floorArea);
        System.out.println("Number of Bedrooms: " + numBedrooms);
        System.out.println("Number of Bathrooms: " + numBathrooms);
    }
}

public class BuildingTest {
    public static void main(String[] args) {
        House h = new House(3, 8, 1500, 3, 4);
        h.showData();
    }
}