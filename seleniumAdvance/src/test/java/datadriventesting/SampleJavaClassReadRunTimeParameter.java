package datadriventesting;

public class SampleJavaClassReadRunTimeParameter {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		//display the content
		
		for(String var:args) {
			System.out.println(var);
		}

	}

}
