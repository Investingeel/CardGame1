package DesignAnalys;



import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Amar
 */
public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();

    int nrOfCards;

    public Deck(){
        deck = new ArrayList<Card>();
        //fill();
        //shuffleCards();
        //getNoOfCards();
    }

    public int getNoOfCards(){

        return nrOfCards;
    }

    public Card dealCard(){

        Card hitMe;


        hitMe = deck.get(0);

        deck.remove(0);
        nrOfCards--;




        return hitMe;
    }

    public void shuffleCards(){

        Collections.shuffle(deck);

    }

    public void fill(){
        for(Rank rank: Rank.values()){
            for(Suit suit: Suit.values()){

                deck.add(new Card(rank, suit));
                nrOfCards++;
            }

        }
    }

    public String toString(){
        String info;

        info = "\n";
        info = info + ("\n")+ "Cards dealt: "  + (52 - nrOfCards) + ("\n") + "Cards left in deck: " + nrOfCards;


        return info;
    }

}

