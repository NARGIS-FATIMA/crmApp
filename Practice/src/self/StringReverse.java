package self;

public class StringReverse {

	public static void main(String[] args) {
		String s = "abcdef";
		String revString=" ";
		char []a=s.toCharArray();
		for(int i=a.length;i>=0;i--) {
			revString=a+revString;
			
		}
		

	}

}
