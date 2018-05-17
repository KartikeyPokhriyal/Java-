public class WalletOwner {
    private Wallet wallet;

    public WalletOwner(double amount) {
        wallet = new Wallet(amount);
    }

    public void addMoney(int amount) {
        wallet.credit(amount);
    }

    public void purchase(int price) {
        wallet.debit(price);
    }
}
