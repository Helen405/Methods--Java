package java_methods;

import java.util.Scanner;

public class Methods {
    public void analyzeNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Enter three numbers:");
        for (int i = 0; i < 3; i++) nums[i] = scanner.nextInt();

        int smallest = nums[0], largest = nums[0];
        for (int n : nums) {
            if (n < smallest) smallest = n;
            if (n > largest) largest = n;
        }

        System.out.printf("The smallest number: %d%n", smallest);
        System.out.printf("The largest number: %d%n", largest);
        System.out.printf("%d is your largest and %d smallest number.%n", largest, smallest);
    }
}
