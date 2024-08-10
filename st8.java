//Java program to find the percentage of uppercase, lowercase, digits and special characters in a String
public class st8 {
    public static void main (String args[]){
        int uppercase=0;
        int lowercase=0;
        int digits=0;
        int others=0;
        int space=0;
        int totcount=0;
        String s ="In 'India is my country 100%' : ";
        for(int i=0;i<s.length();i++){
            totcount++;
            char ch =s.charAt(i);
           int ab=(int)ch;
           if(ab>=65 && ab<=90){
            uppercase++;


           }else if(ab>=97 && ab<=122){
            lowercase++;

           }else if(ab>=48 && ab<=57){
            digits++;

           }else if(ab==32){
            space++;

           }
           

        }
        totcount=totcount-space;

        int total=uppercase+lowercase+digits;
         others=totcount-total;

        
        int arr[]={uppercase,lowercase,digits,others};
        int an []=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            an[i] =arr[i]*100/totcount;
           
          


        }
        System.out.println("Uppecase percentage is :"+an[0]);
        System.out.println("Lowercase percentage is :"+an[1]);
        System.out.println("digits percentage is :"+an[2]);
        System.out.println("others percentage is :"+an[3]);
        


    }
    
}
