public class Mage extends Hero {
    private static final int damage = 50;

    public Mage(String name) {
        super(name);
        health = 75;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}
