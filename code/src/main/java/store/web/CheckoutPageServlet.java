package store.web;

import store.cart.Cart;
import store.cart.CartService;
import store.cart.HttpSessionCartService;
import store.order.OrderService;
import store.order.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CheckoutPageServlet extends HttpServlet {

    private CartService cartService;
    private OrderService orderService;

    @Override
    public void init() {
        cartService = HttpSessionCartService.getInstance();
        orderService = OrderServiceImpl.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cart cart = cartService.getCart(request);
        if (cart.getCartItems().size() == 0) {
            response.sendRedirect(request.getContextPath() + "/cart?errorMessage=You have no products in cart");
            return;
        }
        request.setAttribute("cart", cart);
        request.setAttribute("deliveryModes", orderService.getDeliveryModes());
        request.setAttribute("paymentMethods", orderService.getPaymentMethods());
        request.getRequestDispatcher("/WEB-INF/pages/checkout.jsp").forward(request, response);
    }


}