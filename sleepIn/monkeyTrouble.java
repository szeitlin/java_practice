import java.util.Scanner;

class sumDouble{
	public static int main(String args[]){
		
		
		
		Scanner monkey = new Scanner(System.in);
		int a = monkey.nextInt();
		int b = monkey.nextInt();
		
		if (a==b){
			return (a+b)*2;
		}
		else 
			return a+b;
	}
}