package DesignAnalys;




public enum Rank {
    ACE(1/11), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);


    public int getValue() {
        return value;
    }

    private final int value;

    /*jag vill ha den privat för att jag inte behöver skapa objekt med den
      jag är endast ute efter värdet på kortet vilket jag får från getValue()*/
    private Rank(int value) {
        this.value = value;
    }
}
