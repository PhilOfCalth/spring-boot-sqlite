package phil.poc.springbootsqlite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phil.poc.springbootsqlite.models.Product;
import phil.poc.springbootsqlite.repositories.ProductRepository;
import phil.poc.springbootsqlite.services.dtos.CounterOffer;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public CounterOffer makeOffer(final long productId, final int offerPrice)
    {
        Product productUnderOffer = productRepository.findById(productId).get();
        //Deal with NoSuchElementException

        CounterOffer counterOffer = new CounterOffer(productId);

        if(offerPrice < productUnderOffer.getMinPrice()){
            counterOffer.setAccepted(false);
            counterOffer.setCounterOfferPrice(
                    productUnderOffer.getWantedPrice()
            );
            return counterOffer;
        }
        else if(offerPrice > productUnderOffer.getWantedPrice()){
            counterOffer.setAccepted(true);
            counterOffer.setCounterOfferPrice(offerPrice);
            return counterOffer;
        }
        else{
            calculateCounterOffer(counterOffer, offerPrice, productUnderOffer.getWantedPrice());
            return counterOffer;
        }
    }

    private void calculateCounterOffer(
            CounterOffer counterOffer, int offerPrice, int wantedPrice)
    {
        // Elaborate logic about the current market.
        // Also I'd need a history of the customer's offer history to ever come to a deal...
        int priceDiff = wantedPrice - offerPrice;
        int counterOfferPrice = offerPrice + (priceDiff/2);
        counterOffer.setAccepted(false);
        counterOffer.setCounterOfferPrice(counterOfferPrice);
    }
}
