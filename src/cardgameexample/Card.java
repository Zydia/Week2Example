package cardgameexample;


public class Card {


   //card hase 2 information suit and value
    private String suit;
    private int value;

    public Card(String s, int v)
    {
        this.suit=s;
        this.value=v;
    }
    
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
}

    

