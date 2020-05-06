import java.util.Random;
import java.util.Scanner;

public class ZombieLand {

    public static void main(String[] args) {

        // ENEMIES

        String[] enemies = { "Clown Zombie", "Zombie", "Carney Zombie", "Huge Zombie"};

        // ENEMY VARIABLES
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        // HERO VARIABLES
        int heroHealth = 100;
        int attackDamage = 50;
        int healthBoosts = 2;
        int healthBoostAmount = 10;

        boolean gameRunning = true;


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Do want to play ZombieLand? [yes/no]");
        String userAnswer = scanner.nextLine();


        if (userAnswer.equalsIgnoreCase("yes")) {
            System.out.println("Lets start the adventure");
            System.out.println("Choose your character: ");
            System.out.println("'c' for Columbus");
            System.out.println("'t' for Tallahassee");
            System.out.println("'w' for Wichita");
            String character = scanner.nextLine();
            while(character.toLowerCase().charAt(0) != 'c' && character.toLowerCase().charAt(0) != 't' && character.toLowerCase().charAt(0) != 'w') {
                System.out.println("'c' for Columbus");
                System.out.println("'t' for Tallahassee");
                System.out.println("'w' for Wichita");
                character = scanner.nextLine();
            }
            if(character.toLowerCase().charAt(0) == 'c'){
                System.out.println("Columbus, you are entering Pacific Playland with " + heroHealth + " health points");
            }
            if(character.toLowerCase().charAt(0) == 't'){
                System.out.println("Tallahassee, you are entering Pacific Playland with " + heroHealth + " health points");
            }
            if(character.toLowerCase().charAt(0) == 'w'){
                System.out.println("Wichita, you are entering Pacific Playland with " + heroHealth + " health points");
            }

//             GAME
            while(gameRunning){
                System.out.println("");
                int enemyHealth = random.nextInt(maxEnemyHealth);


            }


        } else {
            System.out.println("Alright, we'll play next time then!");
        }


    }
}
