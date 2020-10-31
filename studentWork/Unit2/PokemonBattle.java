package studentWork.Unit2;

import java.util.Scanner; 

public class PokemonBattle {
    public static void main(String [] args) {
    
        Scanner console = new Scanner(System.in);
        String Pokemon = battleStart();
        int HP2 = damage(Pokemon);
        statsTable(Pokemon, HP2);

        
    }

    public static String battleStart() {

        Scanner console = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Another trainer is issuing a challenge!");
        System.out.println();
        System.out.println("Zebstrika appeared.");
        System.out.println();
        System.out.println("Which Pokemon do you choose?");
        String Pokemon = console.nextLine();
        return Pokemon;
       
    }

    public static int damage(String Pokemon) {

        Scanner console = new Scanner(System.in);
        System.out.println();
        System.out.println("Zebstrika used Thunderbolt!");
        System.out.println();
        System.out.println("Trainer, what are your " + Pokemon + "'s' stats?");
        System.out.println();
        System.out.println("Level: ");  //User Inputs
        int Level = console.nextInt();
        System.out.println("Attack: ");
        int Attack = console.nextInt();
        System.out.println("Defence: ");
        int Defence = console.nextInt();
        System.out.println("Base: ");
        int Base = console.nextInt();
        System.out.println("HP: ");
        int HP1 = console.nextInt();   

        double Modifier = (0.5) + (double)(Math.random()* (0.5 - 1.0 + 1));
        int Experience = (2*Level+10)/2;
        int Power =(Attack/Defence)*Base+2;
        double Damage =(Experience + Power)*Modifier;
        int HP2 = HP1-(int)Damage;
        System.out.println();
        System.out.println(Pokemon + " sutained " + (int)Damage + " points damage.");
        System.out.println();
        System.out.println("HP, after damage, are now " + (HP2) + ("."));
        System.out.println();
        return HP2;
    }

    public static void statsTable(String Pokemon, int HP2) {

        System.out.println("Name        " +Pokemon);
        System.out.println("Level       " + 41);
        System.out.println("------------------------------ ");
        System.out.println("HP          " + HP2);
        System.out.println("Attack      " + 55);
        System.out.println("Defence     " + 53);
        System.out.println("------------------------------ ");
        System.out.println("Moves Learned: Thunder Wave, Hidden Power, Psycho Cut, Recover");
        System.out.println();
    }

    
}