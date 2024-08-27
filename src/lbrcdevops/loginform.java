package lbrcdevops;

public class loginform {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Please enter your name: ");
	    String userName = scanner.nextLine();
	    System.out.println("Welcome to the app , " + userName + "!");
	    scanner.close();
	}
}
