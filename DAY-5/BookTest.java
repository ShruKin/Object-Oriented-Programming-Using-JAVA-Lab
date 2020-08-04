import java.util.Scanner;

class Book {

    private String author, title, publisher;
    private double price;
    private int stock_pos;

    public Book(String author, String title, String publisher, double price, int stock_pos) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.stock_pos = stock_pos;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maxPrice = 0.0;

        Book book[] = new Book[10];

        for (int i = 0; i < book.length; i++) {
            System.out.println("Enter author, title, publisher, price, stock position for book " + (i + 1));
            String author = sc.nextLine();
            // sc.nextLine();
            String title = sc.nextLine();
            // sc.nextLine();
            String publisher = sc.nextLine();
            // sc.nextLine();
            double price = sc.nextDouble();
            int stock_pos = sc.nextInt();

            System.out.println(author + ", " + title + ", " + publisher + ", " + price + ", " + stock_pos);

            book[i] = new Book(author, title, publisher, price, stock_pos);
            sc.nextLine();
        }

        Book maxPriceBook = null;
        for (Book b : book) {
            if (b.getPrice() > maxPrice) {
                maxPrice = b.getPrice();
                maxPriceBook = b;
            }
        }

        System.out.println("Max Price: " + maxPriceBook.getTitle());
        sc.close();
    }
}