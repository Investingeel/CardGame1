package DesignAnalys;



/**
 *
 * @author Amar
 */
public class Player {
    //private ArrayList<Card> dealerHand = new ArrayList<>();
    //private ArrayList<Card> playerHand = new ArrayList<>();

    private PileOfCards Hand;
    private int nrOfCards;




    public Player(){
        Hand = new PileOfCards();
    }

    public Card getCardPlayer(int position){
        return Hand.getCard(position);
    }

    public int getNoOfCards(){
        return nrOfCards = (Hand.getNoOfCards());
    }

    public int HandCalculater(){

        int points = 0;

        for(int i = 0; i < nrOfCards;i++ ){
            Card c = getCardPlayer(i);
            points += c.getRankValue();

        }
        return points;
    }

    public String toString(){
        String info;


        info =  "Hand contains: " + Hand;

        return info;
    }

    public void addCard(Card c){
        Hand.addCard(c);
        nrOfCards++;
    }



}









