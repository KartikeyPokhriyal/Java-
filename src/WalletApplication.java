import java.util.ArrayList;
import java.util.Comparator;

public class WalletApplication {

    public static void main(String[] args) {

       WalletOwner katy = new WalletOwner(2000);
       katy.addMoney(200);
       katy.purchase(1700);

      /* Wallet naman = new Wallet(30);
       Wallet jaya = new Wallet(20);
       Wallet srujan = new Wallet(110);
       Wallet archana = new Wallet(170);

       ArrayList<Wallet> listMoney = new ArrayList<>();

       listMoney.add(naman);
       listMoney.add(jaya);
       listMoney.add(srujan);
       listMoney.add(archana);

       listMoney.sort(Comparator.naturalOrder()); */

    }
}
