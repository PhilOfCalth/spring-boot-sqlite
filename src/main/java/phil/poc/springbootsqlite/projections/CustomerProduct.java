package phil.poc.springbootsqlite.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import phil.poc.springbootsqlite.models.Product;

@Projection(name = "productLite", types = { Product.class })
public interface CustomerProduct {
    @Value("#{target.id}")
    long getId();

    String getName();
    String getDescription();

    int getRrp();

}
