//How to convert String to Integer and Integer to String in Java
public class st9 {
    public static void main (String args[]){
        String s ="1541";
        int b =Integer.parseInt(s); //Using --> Integer.parseInt();
        System.out.println(b);

        String av = "154";
        int c=Integer.valueOf(av); // using --> Integer.valueOf();
        System.out.println(c);

        int x =5884;
        String n =String.valueOf(x); // using -- > String.valueOf();
        System.out.println(n);

        int ss=78945;
        String man =Integer.toString(ss);  // using --> Interger.toString();
        System.out.println(man);

    }
    
}
