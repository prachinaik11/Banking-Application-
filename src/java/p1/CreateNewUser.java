package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateNewUser extends HttpServlet {


    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
       PrintWriter out = response.getWriter();
       response.setContentType("Text/html;charset=UTF-8");
       
       int id = Integer.parseInt(request.getParameter("id"));
       String name = request.getParameter("name");
       String uname = request.getParameter("username");
       String dob = request.getParameter("dob");
       String passw = request.getParameter("password");
       String email = request.getParameter("email");
       
       try
       {
           SessionFactory factory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
           Session session = factory.openSession();
           Transaction tx = session.beginTransaction();
           
           pkg1.CustomersPOJO c1 = new pkg1.CustomersPOJO(name, uname, dob, email, passw, id);
           
           session.save(c1);
           
           tx.commit();
           
           out.println("Data Saved");
           
           response.sendRedirect("homePage.jsp");
           //out.print("<a href='/userTransactions.jsp'>Go Back to user Transactions</a>");
       }
       catch(HibernateException he)
       {
           out.write("Error : "+he.getCause());
       }
    }
}
