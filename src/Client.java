import Geometry.Line;

public class Client {

    public static void main(String[] args) {

        Line l1 = new Line(2, 3,4,5 );
        Line l2 = new Line(2, 3,4,5 );

        if(l1.compareTo(l2))
            System.out.println("Lines are equal");
        else
            System.out.println("Lines are not equal");

    }
}
