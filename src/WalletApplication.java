public class OwnerOfWallet {

    public static void main(String[] args) {

        Wallet katy = new Wallet(20);
        Wallet taylor = new Wallet(100);

        System.out.println(taylor.returnLeftAmount());
        System.out.println(katy.returnLeftAmount());

        katy.buyThings(10);
        taylor.buyThings(89);

        System.out.println(taylor.returnLeftAmount());
        System.out.println(katy.returnLeftAmount());

    }
}
