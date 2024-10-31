
import java.util.Random;

public class Zombie extends Enemy {

    private boolean respawn = false;
    private Random random = new Random();

    public Zombie() {
        health = 100;
        damage = 10;
    }

    public void respawn(Zombie zombie) {
        if (!respawn && !isAlive(zombie)) {
            if (random.nextInt(100) <= 30) {
                this.health = 30;
                System.err.println("Зомби возродился c 30 хп");
            }
            respawn = true;
        }
    }
}