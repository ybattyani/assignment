public class Card{
    public enum Rank
    {ACE, TWO, THREE, FOUR, FIVE, SIX,
     SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
    public enum Suit
    {
        CLUBS, DIAMONDS, SPADES, HEARTS
    }
    public enum Special
    {
        JOKER,CARD
    }

    private Rank aRank;
    private Suit aSuit;
    private Special aSpec;

    public Card(Rank pRank, Suit pSuit){
        assert pRank!=null && pSuit!=null;
        aRank=pRank;
        aSuit=pSuit;
    }
    public Card(Special pSpec){
        aSpec=pSpec;
    }
    public Rank GetRank(){
        return aRank;
    }
    public Suit GetSuit(){
        return aSuit;
    }
    public Special GetSpec()
    {
        return aSpec;
    }
    public void SetSpec(Special pSpec)
    {
        aSpec=pSpec;
    }
    public void SetRank(Rank pRank)
    {
        aRank=pRank;
    }
    public void SetSuit(Suit pSuit)
    {
        aSuit=pSuit;
    }
    @Override
    public String toString()
    {
        if(aSpec!=CARD){
            return aSpec;
        }
        return aRank + " of " + aSuit;
    }
}
