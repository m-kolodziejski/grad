package servlet;

import com.gft.grad.dao.HelloDao;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Mateusz on 2015-07-26.
 */
public class BasicServlet extends HttpServlet {


    HelloDao helloDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Hello world and " + helloDao.getHello());
    }

    @Inject
    public void setHelloDao(HelloDao helloDao) {
        this.helloDao = helloDao;
    }
}
