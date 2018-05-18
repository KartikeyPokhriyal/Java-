import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Money implements Comparable {
    private int value;
    private String currency;

    public Money(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public Money() {

    }

    public int getLength() throws MoneyException {
        value = 10;
        try {
            System.out.println(value / 0);
            return currency.length();
        } catch (NullPointerException e) {
            //System.out.println(e.fillInStackTrace());
            throw new MoneyException();
        } catch (ArithmeticException e) {
            //System.out.println(e.fillInStackTrace());
            throw new MoneyException();
        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return Double.compare(money.value, value) == 0 &&
                Objects.equals(currency, money.currency);
    }


    @Override
    public int compareTo(Object o) {
        Money money = (Money) o;
        return Double.compare(money.value, value);

        }


    public boolean hashCode(Money rupee1) {
        return false;
    }
}
