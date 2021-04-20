package training;
import java.sql.*;  
class DemoJdbc{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/dxc","root","Radha@590");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
//PreparedStatement ps=con.prepareStatement("insert into cohorts values(?,?,?)");
	//ps.setInt(1, 123);
	//ps.setString(2, "Manasa");
	//ps.setString(3, "Cp");
	//ps.executeUpdate();
ResultSet rs=stmt.executeQuery("select * from cohorts");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  

con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}

