
package Doctor.online.appointment;

import java.sql.*;
public class Hospitalconn {
    Connection hc;
    Statement s;
    public Hospitalconn(){
        try{
           hc = DriverManager.getConnection("jdbc:mysql:/// Hospitalmanagement", "root", "Furkan@2344");
           
           s = hc.createStatement();
       }catch(Exception e){
           System.out.println(e);
    }

    }
   // public static void main(String args[]) {
        
    }
//}
