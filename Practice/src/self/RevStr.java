package self;



public class RevStr {

	public static void main(String[] args) {
		String s="nargis";
		String revString=" ";
		char ch;
		for(int i=0;i<=s.length()-1;i++) {
			ch=s.charAt(i);
			revString=ch+revString;
		}
		System.out.println(revString);
	}

}
