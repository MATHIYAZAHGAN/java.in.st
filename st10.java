//Java Program to find duplicate characters in a String.

public class st10 {
    public static void main (String args[]){
        String s ="happy people";
        int b=1;
        int bb[]= new int [s.length()];

        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                char chh = s.charAt(j);
                if(ch==chh){
                    b++;
                    bb[j]=-1;
        

                }
               
            }
            if(bb[i] != -1){
                bb[i]=b;

            }
            b=0;
        }
        for(int i=1;i<bb.length-1;i++){
                if(bb[i]>0){
                    System.out.print(s.charAt(i)+" ");
                
            }
        }
    }
}

       
        

    
   
    

