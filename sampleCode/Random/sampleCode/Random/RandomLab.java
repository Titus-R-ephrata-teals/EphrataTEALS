package sampleCode.Random;

import java.util.Random;
import java.util.Scanner;
/** 
 * Lab from 01/27: Using the Random class in Java to simulate spells.
 */
public class RandomLab {
    
    public static void main(String[] args) {
        // 1. Choose a spell from the list provided. Spell chosen: _Burning Hands_

        // 2. For your spell, calculate the damage range. For example, for a spell
        // that does 1d6 fire damage, the damage range is 1 to 6
        // Damage range: _3_ to _24_

        // 3. Use Random to calculate the damage for one casting of the spell.
        // Print out the damage dealt.

        // 4. Player's choice! Expand your program - be as creative as you'd like
        // and/or choose one of the following:
        //      a. Implement the "Advanced" feature for your chosen spell
        //      b. Add print statements to tell a story featuring your spell
        //      c. In D&D, you roll a d20 to see if your spell hits its target.
        //         If you roll a 10 or higher, your spell hits! If not, it
        //         misses and no damage is dealt.
        //      d. Cast your spell multiple times (loop)
        //      e. Incorporate user interaction

        Random rand = new Random();
        rand.nextInt(6);
        for (int i = 0; i < 10; i++) {
            int randomValueOne = rand.nextInt(6) + 1;
            int randomValueTwo = rand.nextInt(6) + 1;
            int randomValueThree = rand.nextInt(6) + 1;
            System.out.println((randomValueOne) + (randomValueTwo) + (randomValueThree));
        }
        
        
       
          
        //System.out.println(
        //rand.nextInt((0-1)*18+1);

    }
}
