public class Archer extends Hero {
    private String name;
    private static final int damage = 25;

    public Archer(String name) {
        super(name);
        health = 50;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
    }

}
