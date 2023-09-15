package javaessentials.repetitionstructure;

import java.util.Random;

public class RollTheDie_Challenge {
    public static void main(String[] args) {
        int maxRolls = 5;

        int spaces = 0;
        boolean won = false;

        for (int i=0; i<maxRolls; i++){
            Random random = new Random();
            int die = random.nextInt (6) + 1;
            spaces = spaces + die;
            System.out.printf("You've rolled a %d. You are now on space %d and have %d to go\n", die, spaces, (20 - spaces));
            if (spaces >= 20) {
                won = true;
                break;
            }
        }
        if (spaces >= 20) {
            System.out.print("Congratulation! You've won!");
        } else {
            System.out.printf("You lost missing %d spaces", (20 - spaces));
        }
    }
}
