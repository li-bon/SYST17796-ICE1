/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;
/*cloned by Bonita on Feb 1 2022
*Student number: 991358694
*/
/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)  
    {
        Card bonita = new Card("Spds", 2);
        bonita.setSuit("Spades");
        
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("Diamonds");
        
        System.out.println("The card suit is " + bonita.getSuit() + " and the value is " + bonita.getValue());
    }
}
