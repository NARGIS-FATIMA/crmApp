package String;

public class CountVvowelsConsonantNumber {

	public static void main(String[] args) {
		String string="nargis@123";
		string.toLowerCase();
		int v=0,c=0,sc=0,n=0;
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					v++;
				}
				else {
					c++;
				}
			}
			else if(ch>='0' && ch<='9') {
				n++;
				
			}
			else {
				sc++;
			}
			
			
		}
		System.out.println("v="+v);
		System.out.println("c="+c);
		System.out.println("n="+n);
		System.out.println("sc="+sc);
		

	}

}
