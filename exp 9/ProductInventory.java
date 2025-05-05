import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    public static void main(String[] args) {
        // Create a HashMap to store productId and quantity
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Add three products
        inventory.put(101, 50); // Product ID: 101, Quantity: 50
        inventory.put(102, 30);
        inventory.put(103, 75);

        // Update quantity of product with ID 102
        inventory.put(102, 45); // New quantity

        // Remove product with ID 101
        inventory.remove(101);

        // Display final inventory
        System.out.println("Final Inventory:");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
