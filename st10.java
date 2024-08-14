//Java Program to find duplicate characters in a String.

public class st10 {
    public static void main (String args[]){
        String s ="mathiyazahgan";
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
        }
        for(int i=0;i<bb.length;i++){
            // if(!(bb[i]>=1)){
            //     System.out.print(s.charAt(i)+" ");
            // }
            System.out.println(bb[i]);

           

        }
    }
}

       
        

    
   
    

