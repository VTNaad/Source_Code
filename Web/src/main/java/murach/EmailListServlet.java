package murach;

import java.io.*;
//import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import murach.business.User;
//import murach.data.UserDB;

public class EmailListServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {
    	response.setContentType("text/html");
    	request.setCharacterEncoding("UTF-8");
    	response.setCharacterEncoding("UTF-8");
        String url = "/index.html";

        // Get the action parameter
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }

        // Process the action
        if (action.equals("join")) {
            // Set the URL to the join page
            url = "/index.html";
        } else if (action.equals("add")) {
            // Get the parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String birth = request.getParameter("birth");
            String ans = request.getParameter("ans");
            String op1 = request.getParameter("op1");
            String op2 = request.getParameter("op2");
            String contact = request.getParameter("contact");
            // Create a new User object
            User user = new User(firstName, lastName, email, birth, ans, op1, op2, contact);

            // Save the User object in the database
            //UserDB.insert(user);

            // Set the User object in the request object
            request.setAttribute("user", user);

            // Set the URL to the thanks page
            url = "/thanks.jsp";
        }

        // Forward the request and response to the appropriate URL
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                         throws ServletException, IOException {
        doPost(request, response);
    }
}
