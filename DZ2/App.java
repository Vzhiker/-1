import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        boolean game = true;
        Random random = new Random();

        ArrayList<Hero> heroes = new ArrayList<>();

        heroes.add(new Archer("Glaz"));
        heroes.add(new Mage("Potter"));
        heroes.add(new Warrior("Rocky"));

        ArrayList<Enemy> badBoys = new ArrayList<>();
        badBoys.add(new Zombie());
        badBoys.add(new Zombie());
        badBoys.add(new Zombie());
        badBoys.add(new Zombie());
        badBoys.add(new Zombie());
        badBoys.add(new Zombie());

        while (game) {
            for (Hero hero : heroes) {

                if (hero.isAlive(hero) && badBoys.size() != 0) {
                    int indexAttackedEnemy = random.nextInt(badBoys.size());
                    hero.attackEnemy(badBoys.get(indexAttackedEnemy));
                    System.out.println("Герой " + hero.getName() + " " + hero.getHealth() + " " + hero.isAlive(hero)
                            + " атаковал врага " + indexAttackedEnemy);
                    System.out.println("Здоровье зомби - " + badBoys.get(indexAttackedEnemy).getHealth());
                    if (!badBoys.get(indexAttackedEnemy).isAlive(badBoys.get(indexAttackedEnemy))) {
                        Zombie zombie = (Zombie) badBoys.get(indexAttackedEnemy);
                        zombie.respawn(zombie);

                        if (!badBoys.get(indexAttackedEnemy).isAlive(badBoys.get(indexAttackedEnemy))) {
                            badBoys.remove(indexAttackedEnemy);
                            System.out.println("Враг " + indexAttackedEnemy + " повержен");
                        }
                        ;
                    }
                    ;

                }
            }
            System.out.println("--------------------------------------------------");
            for (Enemy badBoy : badBoys) {

                if (badBoy.isAlive(badBoy) && heroes.size() != 0) {
                    int indexAttackedHeroes = random.nextInt(heroes.size());
                    badBoy.attackHero(heroes.get(indexAttackedHeroes));
                    System.out.println("Зомби атаковал героя " +
                            heroes.get(indexAttackedHeroes).getName() + " осталось хп - " +
                            heroes.get(indexAttackedHeroes).getHealth());
                    if (!heroes.get(indexAttackedHeroes).isAlive(heroes.get(indexAttackedHeroes))) {
                        heroes.remove(indexAttackedHeroes);
                    }
                    ;
                }
                
            }
            System.out.println("--------------------------------------------------");
            if (badBoys.size() == 0 ){
            game = false;
            System.out.println("Герои победили");
            System.out.println("Героев осталось " + heroes.size());
            }
            if (heroes.size() == 0 ){
                game = false;
                System.out.println("Зомби победили");
                System.out.println("Зомби осталось " + badBoys.size());
                }
        }

    }
}
