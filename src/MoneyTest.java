import sun.jvm.hotspot.utilities.IntArray;

import java.util.ArrayList;

public class MoneyTest {
    public static void main(String[] args) {

        Money rupee = new Money(1, "Rupee");
        Money rupee1 = new Money(1, "Rupee");

        Money rupee3 = new Money();

        System.out.println(rupee3.getCurrency().length());
        //rupee3.getValue();
        System.out.println(rupee.equals(rupee1));

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            list1.add(i);
            list2.add(i);
        }
        System.out.println(rupee.hashCode(rupee1));

        System.out.println((list1.equals(list2)));


    }
}