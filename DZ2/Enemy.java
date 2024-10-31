public class Enemy implements Mortal {
    protected int health;
    protected int damage;

    public Enemy() {
        this.damage = damage;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health = health - damage;
    }

    public void attackHero (Hero hero){
        hero.takeDamage(damage);
    }
}
