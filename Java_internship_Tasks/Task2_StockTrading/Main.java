//package Task2_StockTrading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock tcs = new Stock("TCS", 3500);
        Stock infosys = new Stock("INFOSYS", 1500);

        User user = new User("Sonu", 50000);

        while (true) {            System.out.println("\n1. Market Data");
            System.out.println("2. Buy TCS");
            System.out.println("3. Sell TCS");
            System.out.println("4. View Portfolio");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("TCS Price: " + tcs.getPrice());
                    System.out.println("INFOSYS Price: " + infosys.getPrice());
                    break;

                case 2:
                    System.out.print("Quantity: ");
                    int buyQty = sc.nextInt();
                    user.buyStock(tcs, buyQty);
                    break;

                case 3:
                    System.out.print("Quantity: ");
                    int sellQty = sc.nextInt();
                    user.sellStock(tcs, sellQty);
                    break;

                case 4:
                    user.showPortfolio();
                    break;

                case 5:
                    user.showHistory();
                    break;

                case 6:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
