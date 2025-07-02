package Pyramid;

public class ReverseString {

	public static void main(String[] args) {
		String s="abcba";
		String revString="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			revString=revString+ch;
		}
		if(revString.equals(s)) {
		System.out.println(revString);
	}
		else {
			System.out.println("No");
		}

	}
}
