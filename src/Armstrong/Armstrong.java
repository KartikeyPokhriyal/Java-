public class Armstrong {
    public static void main(String[] args) {
        final int BASE_10 = 10;
        int calculate_sum = 0, digit, input_copy;
        int input =153;
        input_copy = input;
        while(input > 0) {
            digit = input % BASE_10;
            input = input / BASE_10;
            calculate_sum = calculate_sum + (digit * digit * digit);
        }
        if(input_copy == calculate_sum)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}