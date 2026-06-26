//package Task2_StockTrading;

import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private String name;
    private double balance;
    private HashMap<String, Integer> portfolio;
    private ArrayList<Transaction> history;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
        portfolio = new HashMap<>();
        history = new ArrayList<>();
    }

    public void buyStock(Stock stock, int quantity) {
        double cost = stock.getPrice() * quantity;

        if (balance >= cost) {
            balance -= cost;

            portfolio.put(
                stock.getName(),
                portfolio.getOrDefault(stock.getName(), 0) + quantity
            );

            history.add(new Transaction("BUY", stock.getName(), quantity));
            System.out.println("Stock bought successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void sellStock(Stock stock, int quantity) {
        int owned = portfolio.getOrDefault(stock.getName(), 0);

        if (owned >= quantity) {
            portfolio.put(stock.getName(), owned - quantity);
            balance += stock.getPrice() * quantity;

            history.add(new Transaction("SELL", stock.getName(), quantity));
            System.out.println("Stock sold successfully.");
        } else {
            System.out.println("Not enough stock to sell.");
        }
    }

    public void showPortfolio() {
        System.out.println("Balance: " + balance);

        System.out.println("Portfolio:");
        for (String stock : portfolio.keySet()) {
            System.out.println(stock + " : " + portfolio.get(stock));
        }
    }

    public void showHistory() {
        for (Transaction t : history) {
            t.showTransaction();
        }
    }
}
