package datadriventesting;

import java.util.Random;

public class RandomNumberTest {

	public static void main(String[] args) {
		Random random = new Random();
		//set upper limit for random number
		int randomInt = random.nextInt(1000);
		System.out.println(randomInt);

	}

}
