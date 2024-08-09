//Write a java program to tOGGLE each word in string?

class st5{
	public static void main (String args[]) {
		String s ="my name is mathiyazahgan";
		s=s+" ";
		String word = "";
		String  abc="";
		String ac="";
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(ch != ' ') {
				word=word+ch;
			}else {
				abc=word;
				
				abc=abc.charAt(0)+abc.substring(1).toUpperCase();
				ac=ac+" "+abc;
				
				word="";
			 
		
			}
		}
		System.out.println(ac);
	}
}
