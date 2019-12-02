package model.product;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private static volatile ProductDaoImpl instance = null;



    private ProductDaoImpl() {
    }

    public static ProductDaoImpl getInstance() {

        ProductDaoImpl localInstance = instance;

        if (instance == null) {
            synchronized (ProductDaoImpl.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new ProductDaoImpl();
                }

            }

        }
        return instance;

    }

    @Override
    public Product getProduct(Long id) {
        return null;
    }

    @Override
    public List<Product> findProducts(String query, String order, String sort) {
        return new ArrayList<Product>();
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void delete(Long id) {

    }
}
