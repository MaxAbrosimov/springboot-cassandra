package backend.product.repositories;

import backend.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, UUID> {
}
