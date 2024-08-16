//Java Program to prove that strings are immutable in java
public class st11 {
    public static void check(String s, String s1){
        if(s == s1){
            System.out.println(" BOTH ARE SAME ");
        }else{
            System.out.println("BOTH ARE NOT SAME");
        }

    }
    public static void main (String args[]){
        String s ="python";
        String s1="python";
        check( s,  s1);
        s=s+" "+"game";
        check(s, s1);

    }
    
}
