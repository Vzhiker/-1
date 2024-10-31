public interface Mortal {
    public default boolean isAlive(Hero hero) {
        if (hero.getHealth() > 0)
            return true;
        else
            System.out.println(hero.getName() + " умер");
        return false;
    }

    public default boolean isAlive(Enemy enemy) {
        if (enemy.getHealth() > 0)
            return true;
        else

            return false;
    }
}
