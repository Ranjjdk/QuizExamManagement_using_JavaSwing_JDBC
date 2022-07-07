class PalindromeString{

   public static void main(String args[]){

         String s="kayak";
          boolean c=true;
           for(int i=0;i<s.length()/2;i++){

                      if(s.charAt(i)!=s.charAt(s.length()-1-i)){

                        c=false;
                        break;
                     }
           }
             if(c==true){
                 System.out.print("P");
            }else{System.out.print("N P");}
  }

}