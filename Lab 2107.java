1.

import java.util.*;

public class A{
   public static void main(String args[]) {
      
      HashMap hm = new HashMap();
      
      hm.put("Bag", new Integer(1100));
      hm.put("Sunglasses", new Integer(2000));
      hm.put("Frames", new Integer(800));
      hm.put("Wallet", new Integer(700));
      hm.put("Belt", new Integer(600));
     
      Set set = hm.entrySet();
      System.out.println("Elements in HashMap...");
     
      Iterator i = set.iterator();
      
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      System.out.println("The value for key Frames in the HashMap = "+hm.get("Frames"));
   }
}

2.


import java.sql.*;
 
public class B
{
    public static void main(String args[])
    {
        String id = "id1";
        String pwd = "pwd1";
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("
                    jdbc:oracle:thin:@localhost:1521:orcl", "login1", "pwd1");
            Statement stmt = con.createStatement();
             
            String q1 = "select * from userid WHERE id = '" + id +
                                    "' AND pwd = '" + pwd + "'";
            ResultSet rs = stmt.executeQuery(q1);
            if (rs.next())
            {
                System.out.println("User-Id : " + rs.getString(1));
                System.out.println("Full Name :" + rs.getString(3));
                System.out.println("E-mail :" + rs.getString(4));
            }
            else
            {
                System.out.println("No such user id is already registered");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}