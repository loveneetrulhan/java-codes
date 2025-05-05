public class FindMissingNumber {

    public static void main(String[] args) {
        int[] array = {1, 5, 6, 2, 4};
        int n = array.length + 1; 
        int missingNumber = findMissingNumber(array, n);

        System.out.println("Missing number: " + missingNumber);
    }

    
    public static int findMissingNumber(int[] array, int n) {
        
        int totalSum = n * (n + 1) / 2; 
        
        int arraySum = 0;

        for (int i = 0; i < array.length; i++) {
    arraySum += array[i];
            }

        return totalSum - arraySum; 
    }
}
