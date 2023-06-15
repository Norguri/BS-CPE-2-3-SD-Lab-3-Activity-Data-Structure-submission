import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            try {
                System.out.print("Enter the number of binary numbers to convert: ");
                int n = input.nextInt(); // This will read the number of binary numbers to convert
                String[] binaryNumbers = new String[n]; // This is the array to store the binary numbers
                int[] decimalNumbers = new int[n]; // Array to store the decimal equivalents

                // This will ask the user to input binary numbers
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter binary number " + (i + 1) + ": ");
                    binaryNumbers[i] = input.next(); // Read the binary number from user input
                }

                // This will Convert binary numbers to decimal numbers
                for (int i = 0; i < n; i++) {
                    int decimal = 0;
                    int base = 1;
                    String binary = binaryNumbers[i];

                    // Iterate through the binary digits from right to left
                    for (int j = binary.length() - 1; j >= 0; j--) {
                        if (binary.charAt(j) == '1') {
                            decimal += base; // This will add the corresponding power of 2 if the digit is '1'
                        }
                        base *= 2; // This will multiply the base by 2 for each subsequent digit
                    }
                    decimalNumbers[i] = decimal; // This will store the decimal equivalent in the array
                }

                // This will print the decimal numbers
                System.out.println("Decimal numbers:");
                for (int i = 0; i < n; i++) {
                    System.out.println(decimalNumbers[i]);
                }

            
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. It must be an integer.");
                input.nextLine(); // Clear input buffer
            }
        }

    }
}