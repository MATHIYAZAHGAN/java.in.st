//Write a java program to reverse each word in string
public class st4{
    public static void main(String[] args) {
        String s="my name is mathiyazahgan";
        s=s+" ";

        String word="";
        String reverse="";
   for(int i=0;i<s.length();i++){
    char ch = s.charAt(i);
    if(ch != ' '){
        word=ch+word;

    }else{
        reverse=reverse+" "+word;
        word="";
    }



   }
   System.out.print(reverse);



    
        
      

        
    }
}