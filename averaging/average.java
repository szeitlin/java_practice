//input ten numbers, return average

import java.util.Scanner;

class broccoli{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int total = 0;
			int grade;
			int average;
			int counter = 0;
			
			while (counter < 6){
				grade = input.nextInt();
				total += grade;
				counter++;		
			}
			average = total/6;
			System.out.println("your average is " + average);
	}
}