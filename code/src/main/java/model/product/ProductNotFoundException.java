package model.product;

public class ProductNotFoundException extends RuntimeException {
    ProductNotFoundException(String message) {
        super(message);
    }
}
