package store.web;

import model.product.Product;
import model.product.ProductDao;
import model.product.ProductDaoImpl;
import model.product.ProductNotFoundException;
import recentlyViewed.RecentlyViewedService;
import utility.RequestUtility;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

public class ProductDetailsPageServlet extends HttpServlet {


    private ProductDao productDao;
    private RequestUtility requestUtility;


    @Override
    public void init() {
        requestUtility = RequestUtility.getInstance();
        productDao = ProductDaoImpl.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            long productId = requestUtility.getProductId(request);

            request.setAttribute("products", productDao.getProduct(productId));
            request.getRequestDispatcher("/WEB-INF/pages/productDetails.jsp").forward(request, response);
        } catch (ProductNotFoundException | NumberFormatException exception) {
            response.sendError(404, exception.getMessage());
        }
    }


}