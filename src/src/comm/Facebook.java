package comm;

import java.util.Scanner;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Choice");
		System.out.println("Press 1 for Login with user name");
		System.out.println("Press 2 for Login with phone name");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter user name");
			String uname=s.next();
			System.out.println("Enter Password");
			String pass=s.next();
			login("user@123","abc1");
			break;
		case 2:
			System.out.println("Enter Mobile number");
			long phno=s.nextLong();
			System.out.println("Enter Password");
			String password=s.next();
			login(7872603454l,"abc1");
			break;
			default:
				System.out.println("Invalid choice");
		}

	}
	public static void login(String uname,String pass) {
		if(uname.equals("user@123")) {
			if(pass.equals("abc1")) {
				System.out.println("Login Succesfull");
			}
			else
				System.out.println("Wrong Password");
		}
		else
			System.out.println("Wrong Email");
	}
	public static void login(long phno,String pass) {
		if(phno==7872603454l) {
			if(pass.equals("abc1")) {
				System.out.println("Login Succesfull");
			}
			else
				System.out.println("Wrong Password");
		}
		else
			System.out.println("Wrong Mobile number");
	}

}
