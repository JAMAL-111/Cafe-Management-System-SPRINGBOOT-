package inn.cmss.dao;

import inn.cmss.POJO.Product;
import inn.cmss.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {
    List<ProductWrapper> getAllProduct();
}
