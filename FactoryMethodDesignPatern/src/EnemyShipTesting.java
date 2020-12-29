import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of enemy ship do u want? R is for Rocket, U is for UFO");
        String s = scanner.nextLine();
        EnemyShip ship = EnemyShipFactory.makeEnemyShip(s);
        doStuffEnemy(ship);

    }


    public static void doStuffEnemy(EnemyShip anEnemyShip){

        anEnemyShip.enemyShipShoots();
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
    }
}

