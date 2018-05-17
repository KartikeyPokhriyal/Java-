package Maths;

public class MathStudent {
    public static void main(String[] args) {

        Inch inch = new Inch(20);
        Yard yard = new Yard(30);

        if(inch.compare(yard)) {
            System.out.println("Equal");
        }

        else {
            System.out.println("Not Equal");
        }

        System.out.println(inch.addUnitsToInch(yard));
    }

}
