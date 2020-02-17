import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a few numbers and enter 'q' to quit:");
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[0];

        while (!scan.hasNext("q") || scan.hasNext("Q")) {
            int newValue = scan.nextInt();
            int[] newArray = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }
            newArray[numbers.length] = newValue;
            numbers = newArray;
        }

        //calculate maximum
        int checkMax = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (checkMax < numbers[i]) {
                checkMax = numbers[i];
            }

        }

        System.out.println(checkMax);

    }
}
