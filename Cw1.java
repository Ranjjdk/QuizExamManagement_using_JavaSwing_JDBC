import java.util.*;

public class Cw1{

   public static void main(String args[]){

              HashMap<Integer,Student> hm=new HashMap<>();

 
               hm.put(222,new Student(101,"Shubahm","BSCIT"));
                hm.put(333,new Student(102,"Ranjeet","MSCIT"));
                 

             
      
               for(Map.Entry<Integer,Student> m:hm.entrySet()){
                             Student s=(Student)m.getValue();
                         System.out.print(m.getKey()+" ");
                           System.out.println(s.id+" "+s.name+" "+s.course);
 
                      }    




  }


}