class PlayerDefeatedException extends Exception {
    private static final long serialVersionUID = 1L;

    public PlayerDefeatedException(String message) {
        super(message);
    }
}

class Player {
    private int health;

    public Player(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) throws PlayerDefeatedException {
        if (damage < 0) {
            throw new IllegalArgumentException("Damage cannot be negative.");
        }
        
        health -= damage;
        
        if (health <= 0) { 
        	//Checks if health is zero or negative: If true, it throws PlayerDefeatedException, meaning the player is defeated.
            throw new PlayerDefeatedException("Player has been defeated!");
        } 
        
        System.out.println("Player's remaining health: " + health);
    }

    public static void main(String[] args) {
        Player player = new Player(50);
        
        try {
            player.takeDamage(40); // Valid damage //10
            player.takeDamage(15); // This will trigger exception 10-15
            //The exception is caught, and "Game Over: Player has been defeated!" is printed.

        } catch (PlayerDefeatedException e) {
            System.out.println("Game Over: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
