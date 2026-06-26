//package Task2_StockTrading;

public class Transaction {
    private String type;
    private String stockName;
    private int quantity;

    public Transaction(String type, String stockName, int quantity) {
        this.type = type;
        this.stockName = stockName;
        this.quantity = quantity;
    }

    public void showTransaction() {
        System.out.println(type + " | Stock: " + stockName + " | Qty: " + quantity);
    }
}
