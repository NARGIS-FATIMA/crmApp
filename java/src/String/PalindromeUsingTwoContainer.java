package String;

public class PalindromeUsingTwoContainer {

	public static void main(String[] args) {
		String s="madam";
		boolean flag=false;
		int temp=0,temp1=s.length()-1;
		if(s.charAt(temp)==s.charAt(temp1)) {
			flag=true;
			temp++;
			temp--;
		}
		else {
			flag=false;
		}
		if(flag==true) {
			System.out.println("Palindrome");
		}
		else {

             System.out.println("Not Palindrome");
		}
		

	}

}
