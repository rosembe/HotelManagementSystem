package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

  Connection c;
  Statement s;
     Conn(){
            try {

                c= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root","koray");
                s=c.createStatement();
            }catch (Exception e){
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }

