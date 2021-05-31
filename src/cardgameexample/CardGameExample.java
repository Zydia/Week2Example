/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameexample;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CardGameExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Card[] deck = new Card[4]; // array of Card object- suit and value
        Scanner input= new Scanner(System.in);
        System.out.println(" enter your card details :");
        for(int i=0;i<deck.length;i++)
        {
//            Card c1 = new Card();
//            deck[0]=c1; // object of the card is saved in array
            deck[i]= new Card(input.next(),input.nextInt());
            
        }
    for(int i=0;i<deck.length;i++)
        {
         System.out.println(deck[i].getSuit() + " "+ deck[i].getValue());
         }
    
}
}

    
    

