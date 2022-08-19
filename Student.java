class Student implements Comparable<Student>{


protected int id;
 protected String name;
 protected String course;
 
  Student(int id,String name,String course){

     this.id=id;
     this.name=name;
     this.course=course;

   
       } 
  
     public int compareTo(Student s){
   
             return this.name.compareTo(s.name);
 
          } 



}
