//Java Program to check whether one String is a rotation of another
public class st13{
    public static boolean check(String s,String ss){
        if(s.length() != ss.length()){
            return false;
        }
        String s3 =s+s;
        if(ss.contains(ss))
return true;
        else
            return false;
        


    }
    public static void main(String args[]){
      String s ="javascript";
      String ss ="scriptjava";
      if(check(s, ss)){
        System.out.println("yes "+ss+" is rotation of "+s);
      }else{
        System.out.println("No "+ss+" is not  rotation of "+s);
      }
      
    }
}