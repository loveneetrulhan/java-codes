class InvalidOrderAmountException extends Exception { //Custom Exception
    private static final long serialVersionUID = 1L;

    public InvalidOrderAmountException(String message) {
        super(message);
    }
}

class OrderProcessor {
    public void processOrder(double amount) throws InvalidOrderAmountException {
        if (amount <= 0) {
            throw new InvalidOrderAmountException("Order amount must be positive.");
        }
        System.out.println("Order processed successfully for amount: Rupees" + amount);
    }

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        
        try {
            orderProcessor.processOrder(50.0); // Valid order
            orderProcessor.processOrder(-10.0); // Invalid order
        } catch (InvalidOrderAmountException e) {
            System.out.println("Order Failed: " + e.getMessage());
        }
    }
}
