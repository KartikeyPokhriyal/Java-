package Maths;

import java.util.ArrayList;

public class MathStudent {
    public static void main(String[] args) {

        Inch inch = new Inch(20);
        Yard yard = new Yard(30);

        ArrayList<Inch> inches =  new ArrayList<>();

        inches.add(inch);

        if(inch.compare(yard)) {
            System.out.println("Equal");
        }

        else {
            System.out.println("Not Equal");
        }

        System.out.println(inch.addUnitsToInch(yard));
    }

}
