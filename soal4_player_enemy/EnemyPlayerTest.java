import java.util.Scanner;

public class EnemyPlayerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- Data Hero --");
        System.out.print("Nama: ");
        String heroName = scanner.nextLine();
        System.out.print("Health: ");
        int heroHealth = scanner.nextInt();
        System.out.print("Power: ");
        int heroPower = scanner.nextInt();
        System.out.print("Defense: ");
        int heroDefense = scanner.nextInt();
        scanner.nextLine();

        System.out.println("-- Data Musuh --");
        System.out.print("Nama: ");
        String bossName = scanner.nextLine();
        System.out.print("Health: ");
        int bossHealth = scanner.nextInt();
        System.out.print("Power: ");
        int bossPower = scanner.nextInt();
        System.out.print("Defense: ");
        int bossDefense = scanner.nextInt();

        Player hero = new Player(heroName, heroHealth, heroPower, heroDefense);
        Enemy boss = new Enemy(bossName, bossHealth, bossPower, bossDefense);

        hero.attack(boss);
        boss.attack(hero);

        scanner.close();
    }
}
