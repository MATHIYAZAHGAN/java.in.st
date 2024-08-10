
import java.util.Arrays;
import java.util.Scanner;

//Java Program to check whether two Strings are anagram or not
class mrg{
	public static void main (String args[]) {
        Scanner scan =new Scanner(System.in);
		String s=scan.nextLine();
        String s1=scan.nextLine();
    s=s.toUpperCase();
    s1=s1.toUpperCase();
	int ab[]=new int[s1.length()];//74,79,66,77
	int aa[]=new int[s.length()];
	int az=0;
	for(int i=0;i<s1.length();i++) {
		char db =s1.charAt(i);
		ab[i]=(int)db;

	}	
	for(int i=0;i<s.length();i++) {
		char ch =s.charAt(i);
		aa[i] =(int)ch;


		}
	
	
	for(int i=0;i<ab.length;i++) {
		for(int j=0;j<ab.length-i-1;j++) {
			if(ab[j]>ab[j+1]) {
				int temp=ab[j];
				ab[j]=ab[j+1];
				ab[j+1]=temp;
			}
			
			
		}
	}
	for(int i=0;i<aa.length;i++) {
		for(int j=0;j<aa.length-i-1;j++) {
			if(aa[j]>aa[j+1]) {
				int temp=aa[j];
				aa[j]=aa[j+1];
				aa[j+1]=temp;
			}
			
			
		}
	}
	boolean am=true;
	for(int i=0;i<s.length();i++) {
		if(ab[i]==aa[i]) {
			am=true;
		}else {
			am=false;
		}
	}
	if(am==true) {
		System.out.println("It is a anagram program ");
		
	}else {
		System.out.println("Its not a anagram program");
	}
	

	

		
}
}