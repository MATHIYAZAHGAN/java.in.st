//Write a java program reverse tOGGLE each word in string
public class st6 {
    public static void main (String args[]){
        String s ="my name is mathiyazahgan";
        String word ="";
        String ab="";
        s=s+" ";
        String ac ="";
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch != ' '){
                word=ch+word;
                

            }else{
                ab=word;
                ab=word.charAt(0)+word.substring(1).toUpperCase();
                
                ac=ac+" "+ab;
                
                word="";

            }

        }
        System.out.println(ac);
        


    }
    
}
