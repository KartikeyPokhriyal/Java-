import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Money implements Comparable{
    private double value;
    private String currency;

    public Money(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public Money() {

    }

    public double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
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
