import java.util.Scanner;

public class ArrayOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = new int[15];

        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) original[i] = sc.nextInt();

        System.out.println("You entered:");
        for (int i : original) System.out.print(i + " ");

        System.out.print("\n\nEnter number to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < original.length; i++) {
            if (original[i] == key) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Number not found in this array");

        int[] reversed = new int[15];
        for (int i = 0; i < 15; i++) reversed[i] = original[14 - i];
        System.out.println("Reversed array:");
        for (int i : reversed) System.out.print(i + " ");

        int sum = 0;
        long product = 1;
        for (int i : original) {
            sum += i;
            product *= i;
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Product: " + product);
    }
}
