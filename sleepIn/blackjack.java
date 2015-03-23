import java.util.Scanner;

class blackjack{
	public static int main(String args[]){
		
		Scanner card = new Scanner(System.in);
		int n = card.nextInt();
		
		if (n>21){
			return (n-21)*2;
		}
		else if (n<21){
			return (21-n);
		}
		else return 0;
	}
}