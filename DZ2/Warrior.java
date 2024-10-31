public class Warrior extends Hero {
    private String name;
    private static final int damage = 75;

    public Warrior(String name) {
        super(name);
        health = 100;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
    }

}
