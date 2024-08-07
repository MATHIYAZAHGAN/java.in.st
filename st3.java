//Write a java program to capitalize each word in string..
public class st3 {
    public static void main (String args[]){
        String s= "i am the student  i want learn more things";
        String word ="";
        s=s+" ";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch !=' '){
                word=word+ch;


            }else{
                if(!word.isEmpty()){
                    char ac=word.charAt(0);
                    int ca=(int)ac;
                    ca= ca-32;
                    char ba=(char)ca;
                    word=ba+word.substring(1);
                }
                System.out.print(word+" ");
                word="";
            }

        }
    }
}