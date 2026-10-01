public class Enemy {
    private String name;
    private int health;
    private int power;
    private int defense;

    public Enemy(String name, int health, int power, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }

    public String getName() { return this.name; }
    public int getHealth() { return this.health; }
    public int getPower() { return this.power; }
    public int getDefense() { return this.defense; }
    public void setHealth(int health) { this.health = health; }
    public void setPower(int power) { this.power = power; }
    public void setDefense(int defense) { this.defense = defense; }

    public void attack(Player player) {
        System.out.println(this.name + " attacks " + player.getName() + "!");
        player.takeDamage(this.power);
    }

    // Damage dealt is capped at 0 so defense can never heal the target.
    public void takeDamage(int incomingDamage) {
        int damageTaken = Math.max(0, incomingDamage - this.defense);
        this.health -= damageTaken;
        System.out.println(this.name + " takes " + damageTaken + " damage. Health is now " + this.health);
        if (this.health <= 0) {
            System.out.println(this.name + " died!");
        }
    }
}
