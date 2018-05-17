

public class Wallet {
    private double cash;

    Wallet(double cash) {
        this.cash = cash;
    }

    public void credit(int amount) {
        cash += amount;
    }

    public void debit(int amount) {
        if(cash == 0) {
            System.out.println("No Cash Left");
        }
        else if(cash < amount) {
            System.out.println("Amount Insufficient");
        }
        else {
            cash -= amount;
            System.out.println("Bought! :)");
        }
    }
}
