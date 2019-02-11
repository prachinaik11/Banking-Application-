package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class DepositTransaction extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) 
            throws IOException,ServletException
    {                
        PrintWriter out = response.getWriter();
        
        response.setContentType("Text/html;charset=UTF-8");
        
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/userTransactions.jsp");
        
        try
        {
              
            HttpSession ses = request.getSession();
        
            int amt = Integer.parseInt(request.getParameter("amt"));
        
            String id = (String) ses.getAttribute("id");
            
            int uId = Integer.parseInt(id);
                 
            SessionFactory factory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();
            
            pkg1.CustomersPOJO c1 = (pkg1.CustomersPOJO) session.get(pkg1.CustomersPOJO.class,uId);
            
            c1.setBalance(c1.getBalance()+amt);
            
            session.update(c1);
            
            tx.commit();
            
            out.println("Deposit Successful\n");
                               
            rd.forward(request, response);
        }
        
        catch(HibernateException he)
        {
            out.write("Error : "+he.getMessage());
        }
        
        catch(Exception e)
        {
            out.println("Error : "+e.getCause());
        }
    }
}
