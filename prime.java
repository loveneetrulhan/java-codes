
public class PrimeCounter {
    
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Prime numbers between 1 and 1000 are:");

        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }System.out.println();

        System.out.println("Total number of prime numbers between 1 and 1000: " + count);
    }
    

    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2;  i * i <= number; i++) {
            
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
