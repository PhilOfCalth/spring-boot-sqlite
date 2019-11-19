package phil.poc.springbootsqlite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import phil.poc.springbootsqlite.models.Product;

@RepositoryRestResource(excerptProjection = Product.class)
// pagenation or other types
public interface ProductRepository extends CrudRepository<Product, Long> {
}
