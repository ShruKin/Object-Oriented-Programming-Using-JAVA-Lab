class Complex {
    private int real, img; // instance variables

    public Complex() { // no parameterized constructor
        real = 10;
        img = 20;
    }

    public Complex(int r) {
        real = r;
        img = 20;
    }

    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    public Complex(Complex c) { // copy constructor
        real = c.real;
        img = c.img;
    }

    public void display() {
        System.out.println(real + " + " + img + "i");
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(-30, -40);
        Complex c2 = new Complex();
        Complex c3 = new Complex(c1);
        Complex c4 = new Complex(50);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }
}