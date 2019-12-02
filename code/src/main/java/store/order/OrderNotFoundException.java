package store.order;

public class OrderNotFoundException extends Exception {
    OrderNotFoundException(String message) {
        super(message);
    }
}
