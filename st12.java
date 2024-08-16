//Java Program to remove all white spaces from a String
public class st12 {
    public static void main(String args[]){
        String s ="India  I s M y  Country";
        String  st="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                st=st+ch;

            }

        }
        System.out.println(st);

    }
    
}
