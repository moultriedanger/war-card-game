import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Card c1 = new Card("Ace", "spades");
//        Card c2 = new Card("5", "clubs");
//        Card c3 = new Card("9", "dimonds");
//        Card c4 = new Card("Jack", "hearts");

//        Deck d = new Deck();
//        d.addCard(c1);
//        d.addCard(c2);
//        d.addCard(c3);
//        d.addCard(c4);
          ArrayList<Card> d = new ArrayList<>();
          Deck mainDeck = new Deck(d);

        System.out.println(mainDeck.customSize());
        mainDeck.showContents();
    }
}