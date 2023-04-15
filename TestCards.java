import java.util.LinkedList;

public class TestCards {
    public static void main(String[] args) {
        // Card aceSpades = new Card();
        // Card threeDiamonds = new Card(3, Card.DIAMONDS);
        // Card sixHearts = new Card(6, Card.HEARTS);
        // Card sixSpades = new Card(6, Card.SPADES);

        // System.out.println(aceSpades + " : " + threeDiamonds);

        // Card newAceSpades = new Card(aceSpades);

        // System.out.println(aceSpades.equals(newAceSpades));

        // System.out.println(aceSpades.getSuit());

        // System.out.println(newAceSpades.getValue());

        // System.out.println(sixHearts.equals(sixSpades));

        Deck deck = new Deck();

        System.out.println(deck);

        Card card = new Card(1, 1);

        System.out.println(card);

        System.out.println(deck.size());

        Dealer dealer = new Dealer();

        LinkedList<Card> hand = dealer.deals(6);

        System.out.println(hand);
    }
}