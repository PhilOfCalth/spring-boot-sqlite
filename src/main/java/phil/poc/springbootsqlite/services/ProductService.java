package phil.poc.springbootsqlite.services;

import phil.poc.springbootsqlite.services.dtos.CounterOffer;

public interface ProductService {

    public CounterOffer makeOffer(final long productId, final int offerPrice);

}
