package datadriventesting;

public class GenerateAlphanumericRandomNumber {

	public static void main(String[] args) {
		int n=20;
		//Choose a character random from this String
		String AlphanumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		
		//create stringBuffer size of Alphanumeric string
		StringBuilder sb = new StringBuilder(n);
		for(int i=0;i<n;i++) {
			//generate a random number b/w 0 to alphanumeric string variable length
			int index=(int)(AlphanumericString.length()*Math.random());
			//add Character one by one in end of sb
			sb.append(AlphanumericString.charAt(index));
			
		}
		System.out.println(sb);

	}

}
