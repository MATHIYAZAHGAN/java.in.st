//Java Program to count the number of words in a String
public class st14 {
    public static void main(String args[]){
        String s ="my name is mathiyazahgan";
        String word="";
        s=s+" ";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch != ' '){
                word=word+ch;
            }else{
                count++;
                
            }

        }
        System.out.println("THE TOTAL NUMBER OF WORD  IS "+count);

    }
    
}
