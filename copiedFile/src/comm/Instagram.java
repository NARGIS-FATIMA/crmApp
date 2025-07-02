package comm;

public class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instagram.login("user@123", "abc12");

	}
	public static void login(String uname,String pass) {
		if(uname.equals("user@123")) {
			if(pass.equals("abc12")) {
				System.out.println("Login Successfull");
			}
			else {
				System.out.println("Password Incorrect");
			}
		}
		else {
			System.out.println("Username Incorrect");
		}
	}

}
