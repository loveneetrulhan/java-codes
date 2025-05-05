import java.util.ArrayList;

public class PrimeChecker {
    public static void main(String[] args) {
        // 1. Create ArrayList and autobox integers into it
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i); // autoboxing from int to Integer
        }

        // 2. Iterate and check for prime
        for (Integer num : numbers) {
            int value = num; // unboxing (can also use num.intValue())
            if (isPrime(value)) {
                System.out.println(value + " is a prime number.");
            } else {
                System.out.println(value + " is not a prime number.");
            }
        }
    }

    // Helper method to check for prime numbers
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
