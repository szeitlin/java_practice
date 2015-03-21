import java.util.Scanner;


class apples{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		
		System.out.println("enter your name here: ");
		String name = input.nextLine();
		
		tunaObject.simpleMessage(name);
	}
}