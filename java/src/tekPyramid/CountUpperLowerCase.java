package tekPyramid;

public class CountUpperLowerCase {

	public static void main(String[] args) {
		String s="jdhdFESFL";
		int c=0,l=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				c++;
			}
			else if(ch>='a'&& ch<='z'){
				l++;
			}
//			else {
//				break;
//			}
		}
		System.out.println(c);
		System.out.println(l);
		
	}

}
