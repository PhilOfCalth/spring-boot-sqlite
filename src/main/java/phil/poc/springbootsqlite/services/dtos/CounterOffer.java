package phil.poc.springbootsqlite.services.dtos;

public class CounterOffer {

    public CounterOffer(long productId){
        this.productId = productId;
    }

    long productId;
    boolean accepted;
    int counterOfferPrice;

    public long getProductId() { return productId; }
    public void setProductId(long productId) { this.productId = productId; }
    public boolean isAccepted() { return accepted; }
    public void setAccepted(boolean accepted) { this.accepted = accepted; }
    public int getCounterOfferPrice() { return counterOfferPrice; }
    public void setCounterOfferPrice(int counterOfferPrice) {
        this.counterOfferPrice = counterOfferPrice;
    }
}
