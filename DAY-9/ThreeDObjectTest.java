abstract class ThreeDObject {
    protected double d1, d2, d3;

    public ThreeDObject(double d1, double d2, double d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    abstract public void wholeSurfaceArea();
    abstract public void volume();
}

class Cube extends ThreeDObject {
    private double l;

    public Cube(double l) {
        super(l, l, l);
        this.l = l;
    }

    public void wholeSurfaceArea() {
        System.out.println("Surface area: " + (6 * l * l));
    }

    public void volume() {
        System.out.println("Volume: " + (l * l * l));

    }

}

class Cylinder extends ThreeDObject {
    private double r, h;

    public Cylinder(double r, double h) {
        super(r, r, h);
        this.r = r;
        this.h = h;
    }

    public void wholeSurfaceArea() {
        System.out.println("Surface area: " + ((2 * Math.PI * r * h) + (2 * Math.PI * r * r)));
    }

    public void volume() {
        System.out.println("Volume: " + (Math.PI * r * r * h));

    }
}

class Cone extends ThreeDObject {
    private double r, h;

    public Cone(double r, double h) {
        super(r, r, h);
        this.r = r;
        this.h = h;
    }

    public void wholeSurfaceArea() {
        System.out.println("Surface area: " + (Math.PI * r * (r + (Math.sqrt((h * h) + (r * r))))));
    }

    public void volume() {
        System.out.println("Volume: " + ((Math.PI * r * r * h) / 3.0));
    }

}

public class ThreeDObjectTest {
    public static void main(String[] args) {
        ThreeDObject object = null;

        object = new Cube(5.0);
        System.out.println("\nCube:");
        object.wholeSurfaceArea();
        object.volume();
        
        object = new Cylinder(5, 4);
        System.out.println("\nCylinder:");
        object.wholeSurfaceArea();
        object.volume();
        
        object = new Cone(6, 10);
        System.out.println("\nCone:");
        object.wholeSurfaceArea();
        object.volume();
    }
}