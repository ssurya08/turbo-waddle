# turbo-waddle
import java.util.Scanner;

public class ZigZagTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int num = 1; // Start number
        for (int i = 1, length = 1; i <= rows; i++, length += 2) {
            int[] row = new int[length];

            // Fill the row with numbers
            for (int j = 0; j < length; j++) {
                row[j] = num++;
            }

            // Print row in correct order
            if (i % 2 == 1) { // Odd rows: left-to-right
                for (int j = 0; j < length; j++) {
                    System.out.print(row[j] + " ");
                }
            } else { // Even rows: right-to-left
                for (int j = length - 1; j >= 0; j--) {
                    System.out.print(row[j] + " ");
                }
            }

            System.out.println(); // Move to next line
        }

        scanner.close();
    }
}
