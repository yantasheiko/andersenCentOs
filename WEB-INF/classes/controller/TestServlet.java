package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;

public class TestServlet extends HttpServlet {

public void init(ServletConfig config) throws ServletException {
	super.init(config);
}

protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html; charset = utf-8");
    resp.setCharacterEncoding("UTF-8");

    String str = new String("Hello from CentOs");

    req.setAttribute("hello", str);
    getServletContext().getRequestDispatcher("/jsp/hello.jsp").forward(req, resp);
}

}
