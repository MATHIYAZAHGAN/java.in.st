public class st15 {
    public static void main(String args[]){
        int arr[]={10,12,45,66,8594,2,5,5,5202};
       int brr[]=new int[arr.length];
      int peak=arr[0];
        if(arr.length==1){
            System.out.println(arr[0]+" is peak element");
        }
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]<arr[i+1]){
                    brr[i]=arr[i+1];
                }
            }else if(i==arr.length-1){
                if(arr[i]>arr[i-1]){
                    brr[i]=arr[i];
                }
            }else{
                if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                    brr[i]=arr[i];
                }
            }
        }
        System.out.println(" peak elements ");
for(int i=0;i<brr.length;i++){
    if(brr[i]>0){
        System.out.println(brr[i]);
    }

}
        
      
    }

       

        }
       
        

    
    

