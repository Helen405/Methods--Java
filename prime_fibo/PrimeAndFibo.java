public class PrimeAndFibo {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Primes between 1 to 500:");
        for (int i = 1; i <= 500; i++)
            if (isPrime(i)) System.out.print(i + " ");

        System.out.println("\n\nSum of even Fibonacci terms (<= 4 million):");
        long a = 1, b = 2, sum = 0;
        while (b <= 4_000_000) {
            if (b % 2 == 0) sum += b;
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Sum: " + sum);
    }
}
