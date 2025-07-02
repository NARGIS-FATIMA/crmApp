package tekPyramid;

public class Sp {

	public static void main(String[] args) {
		String string="sdh@#$$>:";
		int count=0;
		for(int i=0;i<=string.length()-1;i++) {
			char ch=string.charAt(i);
			if(ch>='a' && ch<='z'||ch>='A' && ch<='Z'||ch>='0' && ch<='9') {
				continue;
			}
			else {
				count++;
				System.out.println(ch);
			}
		}
		System.out.println(count);

	}

}
