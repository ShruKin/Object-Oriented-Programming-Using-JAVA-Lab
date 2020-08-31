abstract class AbstractProduct {
    private int product_id;
    protected String name, description;

    public AbstractProduct(int product_id, String name, String description) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
    }

    abstract public void displayDetails();
}

class Product extends AbstractProduct {
    double price;

    public Product(int product_id, String name, String description, double price) {
        super(product_id, name, description);
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Description: " + description);
        System.out.println("Product Price: " + price);
    }
}

class Book extends Product {
    long isbn;
    String author, title;

    public Book(int product_id, String name, String description, double price, long isbn, String author, String title) {
        super(product_id, name, description, price);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Book ISBN: " + isbn);
        System.out.println("Book Author: " + author);
        System.out.println("Book Title: " + title);
    }
}

class CompactDisk extends Product {
    String artist, title;

    public CompactDisk(int product_id, String name, String description, double price, String artist, String title) {
        super(product_id, name, description, price);
        this.artist = artist;
        this.title = title;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Compact Disk Artist: " + artist);
        System.out.println("Compact Disk Title: " + title);
    }
}

class TravelGuide extends Book {
    String country;

    public TravelGuide(int product_id, String name, String description, double price, long isbn, String author,
            String title, String country) {
        super(product_id, name, description, price, isbn, author, title);
        this.country = country;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Travel Guide Country: " + country);
    }
}

public class ProductTest {
    public static void main(String[] args) {
        TravelGuide tg = new TravelGuide(215, "Travel Guide Books",
                "A travel guide for people who are enthusiastic about exploring the beauty of India", 1999.00,
                978204123, "Sarina Singh", "Lonely Planet India", "India");

        tg.displayDetails();

        System.out.println("---------------------------------");

        CompactDisk cd = new CompactDisk(564, "Music CDs", "Railroaders' Lament", 699, "Hedy West", "500 Miles");
        cd.displayDetails();
    }
}