import java.util.Scanner;

public class ZombieLand {

    int enemyHealth;
    int heroHealth;
    int attackPoints;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do want to play ZombieLand? [yes/no]");
        String userAnswer = scanner.nextLine();


        if (userAnswer.equalsIgnoreCase("yes")) {
            System.out.println("Lets start the adventure");
            System.out.println("Choose your character: ");
            String userName = scanner.nextLine();
            System.out.println(userName + ", you are entering the amusement park and you see a lone wandering zombie. What would you like to do? (Enter a number) [(1) Attack/ (2) Run]");
            int firstResponse = Integer.parseInt(scanner.nextLine());
            System.out.println(firstResponse);


        } else {
            System.out.println("Alright, we'll play next time then!");
        }


    }

    private static void buildColumbus() {
        charName = "Columbus";
        maxhp = 20;
        playerhp = 20;
        playermeleedmg = 4;
        xp = 0;
        Level = 1;
    }

    private static void buildTallahassee() {
        charclass = "archer";
        maxhp = 14;
        playerhp = 14;
        playermeleedmg = 6;
        xp = 0;
        Level = 1;
    }
    private static void buildWichita() {
        charclass = "mage";
        maxhp = 10;
        playerhp = 10;
        mana = 20;
        maxmana = 20;
        playermeleedmg = 2;
        xp = 0;
        Level = 1; // initializes globals according to class
    }






}
