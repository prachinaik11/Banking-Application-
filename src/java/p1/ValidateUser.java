package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ValidateUser extends HttpServlet {
    
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException
    {
        PrintWriter out = response.getWriter();
        
        HttpSession ses = request.getSession();
                
        SessionFactory factory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        String id = request.getParameter("id");
        int uId = Integer.parseInt(id);
        
        String uname = request.getParameter("username");
        String passw = request.getParameter("password");
        
        pkg1.CustomersPOJO checkUser = (pkg1.CustomersPOJO) session.get(pkg1.CustomersPOJO.class, uId);
        
        String un = checkUser.getUsername();
        String pw = checkUser.getPassword();
        
        if(uname.equals(un)&&passw.equals(pw))
        {
            ses.setAttribute("id", id);
            response.sendRedirect("userTransactions.jsp");
            
        }
        else
        {
          out.println("Invalid User ...Username or Password is wrong !!");
        }
        
        
    }
       
}


