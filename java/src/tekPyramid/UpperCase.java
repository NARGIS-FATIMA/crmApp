package tekPyramid;



public class UpperCase {
	
	public static void main(String[] args) {
		
	 
	
    String string = "java is fun";
    String []w = string.split(" ");
    String revString="";
    for (int i =w.length-1; i>=0;i--) {
        //char ch = string.charAt(i);
          revString=revString+w[i]+" ";
    }
    revString=revString.trim();

    System.out.println(string); 
    System.out.println(revString);// Output: 123
}
}

	
	
	
	
	

//	public static void main(String[] args) {
//		String string="fngefe123";
//		String sumString="";
//		for(int i=0;i<=string.length()-1;i++) {
//			char ch=string.charAt(i);
//			if(ch>=0 && ch<=9) {
//				sumString=sumString+ch;
//				
//			}	
//		}
//		System.out.println(sumString);
//
//	}

