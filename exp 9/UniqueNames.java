import java.util.HashSet;

public class UniqueNames {
    public static void main(String[] args) {
        
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};

        
        HashSet<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }

        
        String searchName = "Sourabh";
        if (uniqueNames.contains(searchName)) {
            System.out.println(searchName + " exists in the set.");
        } else {
            System.out.println(searchName + " does NOT exist in the set.");
        }

        
        System.out.println("Unique Names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
