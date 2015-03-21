import java.util.Scanner;

class postal{
	public static void main(String args[]){
	Scanner bucky = new Scanner(System.in);
	double weight, costperpound, total, taxrate, taxed;
	int taxflag;
	System.out.println("What is the weight(in pounds)?");
	weight = bucky.nextDouble();
	System.out.println("What is the cost per pound?");
	costperpound = bucky.nextDouble();
	System.out.println("Apply sales tax (enter 1) or not (enter 0)?");
	taxflag = bucky.nextInt();
	
	if (taxflag == 1){
		taxrate = 0.05;
	}else{
		taxrate = 0;
	}
	
	total = weight*costperpound;
	taxed = total + (total*taxrate);
			
	System.out.println("Without tax that comes to" + total);
	System.out.println("With tax that comes to" + taxed);
	}
}