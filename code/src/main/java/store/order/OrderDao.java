package store.order;

public interface OrderDao {

    void save(Order order);

    Order getBySecureId(String secureId) throws OrderNotFoundException;

}
