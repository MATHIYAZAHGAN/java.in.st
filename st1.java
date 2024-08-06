import java.util.*;
// reverse a String 
class st1 {
    public static void main(String[] args) {
        String s ="my name is mathiyazahgan";
        String reverse="";
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            reverse=ch+reverse;



        }
        System.out.println(reverse);
        
    }
}