import java.util.function.*;

public class Cw1{
    
    

   public static void main(String args[]){
        User user=new User("Ranjeet","ranjeet1234");
           
   
          
           Predicate<User> p=user1->user1.username.equals("Ranjeet") && user1.pwd.equals("ranjeet123");
           
      if(p.test(user)){

              System.out.println("Valid user");
        }else System.out.println("Invalid user");
   
}


}
 class User{
    
    String username,pwd;

   User(String username,String pwd){

         this.username=username;
         this.pwd=pwd;
       }


}