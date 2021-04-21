import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class DatabaServ extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String pid1 = req.getParameter("prodata_pid");
        String pname = req.getParameter("prodata_pname");
        String price1 = req.getParameter("prodata_price");
        int pid = Integer.parseInt(pid1);
        float price = Float.parseFloat(price1);
        try {

            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc","root","Radha@590"));
            PreparedStatement ps = con.prepareStatement("insert into Product values (?,?,?)");
            ps.setInt(1, pid);
            ps.setString(2, pname);
            ps.setFloat(3, price);
            int i = ps.executeUpdate();
            pw.println("<h4>" + i + " ROWS INSERTED...");
            con.close();
        } catch (Exception e) {
            res.sendError(503, "PROBLEM IN DATABASE...");
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}

