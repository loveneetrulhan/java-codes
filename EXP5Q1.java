
class Parent {
    private int privateNumber = 677; // Private member

    // Public method to access private member
    public int getPrivateNumber() {
        return privateNumber;
    }
}


class Child extends Parent {
    public void display() {
       
        // Accessing privateNumber through a public method
        System.out.println("Private Number (via method): " + getPrivateNumber());
    }
}


public class EXP5Q1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
