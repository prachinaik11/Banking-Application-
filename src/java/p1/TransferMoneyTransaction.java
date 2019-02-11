package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author vrusha
 */
public class TransferMoneyTransaction extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException,HibernateException{
        
        PrintWriter out = response.getWriter();
        
        HttpSession ses = request.getSession();
                
        SessionFactory factory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        String pId = request.getParameter("pId");
        int payeeId = Integer.parseInt(pId);
        
        int amt = Integer.parseInt((String)request.getParameter("amt"));
  
        String pName = request.getParameter("pName");       
        
        pkg1.CustomersPOJO checkPayee = (pkg1.CustomersPOJO) session.get(pkg1.CustomersPOJO.class, payeeId);
        
        String pn = checkPayee.getUsername();
                
        if(pName.equals(pn))
        {
            int uId = Integer.parseInt((String)ses.getAttribute("id"));
        
            pkg1.CustomersPOJO payer = (pkg1.CustomersPOJO) session.get(pkg1.CustomersPOJO.class, uId);
   
            int payerBalance = payer.getBalance();
            
            int payeeBalance = checkPayee.getBalance();
            
            payerBalance = payerBalance-amt;
            
            payeeBalance = payeeBalance+amt;
            
            checkPayee.setBalance(payeeBalance);
            
            payer.setBalance(payerBalance);
            
            tx.commit();
            
            response.sendRedirect("userTransactions.jsp");
            
        }
        else
        {
          out.println("Invalid User ...UserId or UserName is wrong !!");
        }
    }
}
