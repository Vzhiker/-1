public abstract class Hero implements Mortal {
    private String name;
    protected int health;

    public Hero(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }


    public void takeDamage(int damage) {
        this.health = this.health - damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public int getHealth() {
        return health;
    }

}
