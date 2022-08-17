import java.sql.*;
import java.util.*;
class Cw1{

public static void main(String args[])throws Exception{
          TD ob=new TD();
             ob.getCon();
           Thread t1=new Thread(ob);
               t1.start();
  
             
       }

}
class TD extends Thread 
{
    Connection con=null;
    PreparedStatement  ps=null;

   public void run(){

                for(int i=1;i<=5;i++){
                      try{
                    int check=insert();
                       if(check!=0){
                             System.out.println("Time inserted");
                        }else System.out.println("Something went wrong");
                     
                             Thread.sleep(2000);
 
                        }catch(Exception e){ System.out.println(e);}
 
               }

 
        
             }

    public void getCon() throws Exception{

                Class.forName("oracle.jdbc.driver.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Ranjeet","123456");
               
                  }
  
    public int insert() throws Exception{

                     Calendar col=Calendar.getInstance();
                        java.util.Date currentTime=col.getTime();
                         long t=currentTime.getTime();

                   ps=con.prepareStatement("insert into Time values(?)");
                    ps.setTimestamp(1,new Timestamp(t));

                      int update=ps.executeUpdate();
                          return update;
  
               }

  
 
   }