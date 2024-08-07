//check palindrom or not 
import java.util.*;
public class st2 {
   
    public static void main(String args[]){
        String s ="alabybala";
        String reverse ="";
        boolean a= false;

        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            reverse=ch+reverse;
            if(s.equals(reverse)){
                a=true;
            }else{
                a=false;
            }

        }          

        if(a==true){
            System.out.print(" TRUE ");
        }else{
            System.out.print("FALSE");
        }

   
        

    }
    
}
