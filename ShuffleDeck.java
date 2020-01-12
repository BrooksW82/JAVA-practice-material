/**
 * This practice code shuffles a deck of cards numbered from 1-52 contained in an original array.
 */
package framework;

import java.util.Random;

public class ShuffleDeck {

    public static void main(String args[]){

        int[] originalDeck = new int[52];

        for(int i = 0 ; i < 52 ; i++){
            originalDeck[i] = i+1;
        }

        for(int i = 0 ; i < 52 ; i++){
           System.out.print(originalDeck[i] + " ");
        }

        System.out.println();

        originalDeck = shuffleTheDeck(originalDeck);

        for(int i = 0 ; i < 52 ; i++){
            System.out.print(originalDeck[i] + " ");
        }
    }

    public static int[] shuffleTheDeck(int[] deck){

        Random rand = new Random();
        int[] changedDeck = new int[52];
        int randomCard;

        for (int u = 52 ; u > 0 ; u--){
            randomCard = rand.nextInt(u);
            changedDeck[u-1] = deck[randomCard];
            deck[randomCard] = deck[u-1];
        }
        return changedDeck;
    }
}
