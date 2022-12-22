package DesignAnalys;



/**
 *
 * @author Amar
 */
public class Game {

    int dealerpoints = 0;
    int playerPoints = 0;

    private Player player;
    private Player dealer;
    private Deck deckCards;

    public Game(){
        player = new Player();
        dealer = new Player();
        deckCards = new Deck();
    }
    public void GameStart(){
        deckCards.fill();
        deckCards.shuffleCards();

        System.out.println(deckCards.getNoOfCards());
        System.out.println(deckCards.toString());

        player.addCard(deckCards.dealCard());
        player.addCard(deckCards.dealCard());
        dealer.addCard(deckCards.dealCard());
        dealer.addCard(deckCards.dealCard());

        System.out.println(deckCards.toString());

        System.out.println(player.toString());

        System.out.println("Playerpoints: " + player.HandCalculater());

        System.out.println(dealer.toString());
        System.out.println("Dealerpoints: "+ dealer.HandCalculater());

        System.out.println(toString());



        boolean goPlayer = true;
        boolean goDealer = true;

        while(goPlayer == true){
            if(player.HandCalculater() < 15){

                //System.out.println(toString());
                player.addCard(deckCards.dealCard());

                System.out.println(player.toString());
                System.out.println("Playerpoints: " + player.HandCalculater());
                System.out.println(deckCards.toString());

            }
            else if(player.HandCalculater() == 21){

                System.out.println(toString());
                System.out.println(deckCards.toString());
                System.out.println("You got BlackJack! You Won!");
                goPlayer = false;
                goDealer = false;
            }
            else if(player.HandCalculater() > 21){

                System.out.println(toString());
                System.out.println(deckCards.toString());
                System.out.println("You got Busted! and lost");
                System.out.println("DEALER WON");
                goPlayer = false;
                goDealer = false;

            }
            else{
                System.out.println("Player chose to stay!");
                break;
            }
        }



        while(goDealer == true){

            if(dealer.HandCalculater() < 21){
                System.out.println(toString());
                dealer.addCard(deckCards.dealCard());
                System.out.println(deckCards.toString());
                System.out.println(dealer.toString());
                System.out.println("Dealerpoints: " + dealer.HandCalculater());
            }
            else if(dealer.HandCalculater() == 21){
                System.out.println(toString());
                System.out.println("Dealer got BlackJack! Dealer Won!");

                goDealer = false;
            }
            else if(dealer.HandCalculater() > 21){
                System.out.println(toString());
                System.out.println("Dealer got Busted and lost!");
                System.out.println("PLAYER WON!");
                goDealer = false;
            }
            else if(dealer.HandCalculater() > player.HandCalculater()){
                System.out.println("Dealer WON!!");
                break;
            }
            else{
                System.out.println("Player WON!!!!!");
            }

        }

    }

//    public void HitmePlayer(){
//
//        playerPoints = playerPoints +  player.HandCalculater();
//
//
//     }

//     public void HitmeDealer(){
//
//        //dealerpoints = dealerpoints +  dealer.HandCalculater(deckCards.dealCard());
//
//
//     }

    public String toString(){
        String info;

        info = "\n" + "Players " + player + "\n" + "Dealers " +dealer;


        return info;
    }
}

