package store.web;


import model.product.Product;
import model.product.ProductDao;
import model.product.ProductDaoImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ProductListPageServlet extends HttpServlet {

    private ProductDao productDao;
   // private RecentlyViewedService recentlyViewedService;

    @Override
    public void init(ServletConfig config) {

        productDao = ProductDaoImpl.getInstance();
       // recentlyViewedService = RecentlyViewedService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");
        String sort = request.getParameter("sort");
        String order = request.getParameter("order");
        request.setAttribute("products", productDao.findProducts(query, order, sort));
       // request.setAttribute("recentlyViewed", recentlyViewedService.getRecentlyViewedProductList(request));
        request.getRequestDispatcher("/WEB-INF/pages/productList.jsp").forward(request, response);
    }
}
