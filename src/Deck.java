import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {

    ArrayList<Card> deck = new ArrayList<>();

    List<String> suits = Arrays.asList("Club", "Diamond", "Heart", "Spade");
    List<String> faceCards = Arrays.asList("Jack", "Queen", "King", "Ace");
    List<String> ranks = Arrays.asList("2","3","4","5","6","7","8","9","10");

    public Deck(ArrayList<Card> deck) {

        this.deck = populateDeck(deck);
    }

    public void addCard(Card card){
        this.deck.add(card);
    }

    public void showContents(){
        for (Card card: deck){
            System.out.println(card.toString());
        }
    }

    private ArrayList<Card> populateDeck(ArrayList<Card> deck){
        for (String suit: suits){
            for (String faceCard: faceCards){
                deck.add(new Card(faceCard, suit));
            }
            for (String rank: ranks){
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    public int customSize(){
        int count = 0;

        for (Card c: this.deck){
            count ++;
        }
        return count;
    }
}
