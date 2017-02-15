import java.util.Scanner;
/**
 * Tells you what card you told it.
 * 
 * @author (Harold) 
 * @version (2/13/2017)
 */
public class Cards
{ 
    public static void main() 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Tell me your card: "); 
        String card = input.next(); 
        input.close(); 
        String value = card.substring(0, card.length() - 1); 
        String suit = card.substring(card.length() - 1); 
        String cardName = ""; 
 
        if (value.compareTo("A") == 0) 
            cardName = "Ace"; 
        else if (value.compareTo("J") == 0) 
            cardName = "Jack"; 
        else if (value.compareTo("Q") == 0) 
            cardName = "Queen"; 
        else if (value.compareTo("K") == 0) 
            cardName = "King"; 
        else 
            cardName = value; 
 
        if (suit.compareTo("D") == 0) 
            cardName += " of Diamonds"; 
        else if (suit.compareTo("H") == 0) 
            cardName += " of Hearts"; 
        else if (suit.compareTo("S") == 0) 
            cardName += " of Spades"; 
        else if (suit.compareTo("C") == 0) 
            cardName += " of Clubs";
          
        System.out.println("Your card is a " + cardName); 
  } 
}