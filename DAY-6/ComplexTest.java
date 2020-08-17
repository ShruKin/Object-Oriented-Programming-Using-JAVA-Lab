class Complex {
    private double real, img;

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public void display() {
        System.out.print(real);
        if (img > 0) {
            System.out.print(" + i");
        } else if (img < 0) {
            System.out.print(" - i");
        } else if (img == 0) {
            return;
        }
        System.out.println(Math.abs(img));
    }

    public Complex add(Complex c) {
        Complex ans = new Complex(0, 0);
        ans.real = c.real + this.real;
        ans.img = c.img + this.img;
        return ans;
    }

    public Complex sub(Complex c) {
        Complex ans = new Complex(0, 0);
        ans.real = c.real - this.real;
        ans.img = c.img - this.img;
        return ans;
    }

    public Complex mult(Complex c) {
        Complex ans = new Complex(0, 0);
        ans.real = (c.real * this.real) - (c.img * this.img);
        ans.img = (c.real * this.img) + (c.img * this.real);
        return ans;
    }

    public Complex div(Complex c) {
        Complex ans = new Complex(0, 0);
        double denominator = Math.sqrt((Math.pow(c.real, 2) + Math.pow(c.img, 2)));
        ans.real = ((c.real * this.real) + (c.img * this.img)) / denominator;
        ans.img = ((this.real * c.img) - (this.img * c.real)) / denominator;

        return ans;
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 5);
        Complex c2 = new Complex(4, -1);

        Complex ansAdd = c1.add(c2);
        ansAdd.display();

        Complex ansSub = c1.sub(c2);
        ansSub.display();

        Complex ansMult = c1.mult(c2);
        ansMult.display();

        Complex ansDiv = c1.div(c2);
        ansDiv.display();
    }
}