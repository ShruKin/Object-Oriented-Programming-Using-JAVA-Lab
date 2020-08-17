import java.util.Scanner;

class Tender {
    private double cost;
    private String companyName;

    public Tender(double cost, String companyName) {
        this.cost = cost;
        this.companyName = companyName;
    }

    public double getCost() {
        return cost;
    }

    public String getCompanyName() {
        return companyName;
    }
}

public class TenderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender tenders[] = new Tender[5];

        System.out.println("Enter details of 5 Tenders");
        for (int i = 0; i < tenders.length; i++) {
            System.out.print("Enter Cost: ");
            double cost = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Company name: ");
            String companyName = sc.nextLine();

            tenders[i] = new Tender(cost, companyName);
        }

        Tender minTnder = null;
        double minCost = tenders[0].getCost();
        for (Tender t : tenders) {
            if (t.getCost() <= minCost) {
                minCost = t.getCost();
                minTnder = t;
            }
        }

        System.out.println(
                "The minimum cost is " + minTnder.getCost() + " given by company: " + minTnder.getCompanyName());
        sc.close();
    }
}