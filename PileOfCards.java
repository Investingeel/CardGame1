package DesignAnalys;


import java.util.ArrayList;

/**
 *
 * @author Amar
 */
public class PileOfCards {

    private ArrayList<Card> hand =  new ArrayList<>();

    /*en tom hand av typen Card för en spelare*/
    public PileOfCards(){
        this.hand = new ArrayList<Card>();
    }
    /*en metod som returnerar antalet kort i handen*/
    public int getNoOfCards(){
        return (hand.size());
    }
    /*en metod som adderar ett kort i handen*/
    public void addCard(Card c){
        hand.add(c);
    }
    /*en metod som tar bort ett kort i handen och returnerar vilket kort det var som tagits bort*/
    public Card removeCardAndShow(int position){
        Card c = hand.remove(position);
        return c;
    }
    /*en metod som tar bort ett kort i handen*/
    public boolean removeCard(Card c){
        return hand.remove(c);
    }
    /*en metod som returnerar tillbaka din hand  */
    public ArrayList<Card> getCards(){
        return (ArrayList<Card>) hand.clone();
    }
    /*en metod som skriver ut korten i handen*/
    public String toString(){
        String info;
        return info = ":"+ hand;
    }
    /*en metod som returnerar tillbaka ditt kort i den positionen man valt*/
    public Card getCard(int position){
        return hand.get(position);
    }

}

