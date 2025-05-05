import java.util.ArrayList;
import java.util.HashSet;

public class UniqueSum {
    public static void main(String[] args) {
        // Original ArrayList with duplicates
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);

        // Convert to HashSet to remove duplicates
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

       
        int sum = 0;
        for (int num : uniqueNumbers) {
            sum += num;
        }

        
        System.out.println("Original List: " + numbers);
        System.out.println("Unique Values: " + uniqueNumbers);
        System.out.println("Sum of Unique Values: " + sum);
    }
}

