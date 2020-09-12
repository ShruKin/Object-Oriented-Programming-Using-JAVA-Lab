interface Mango {
    void print();
}

class Summer implements Mango {
    public void print() {
        System.out.println("Mango in Summer");
    }
}

class Winter implements Mango {
    public void print() {
        System.out.println("Mango in Winter");
    }
}

public class MangoTest {
    public static void main(String[] args) {
        Mango s = new Summer();
        Mango w = new Winter();

        s.print();
        w.print();
    }
}
