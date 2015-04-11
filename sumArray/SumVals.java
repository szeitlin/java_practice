public class SumVals {

public static void main(String args[]) { double aryVals[] = {4.2, 6.5, 10.25, 8.75}; 
     double result;

result = sumAry(aryVals, 2); System.out.println("Result 1: " + result);

result = sumAry(aryVals, 4); System.out.println("Result 2: " + result);
}


public static double sumAry(double aryVals[], int addThese){
	double result = 0;
	for(int counter=0; counter<addThese; counter+=1){
		result+=aryVals[counter];
	}
	return result;
}

}
