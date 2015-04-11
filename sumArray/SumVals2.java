public class SumVals2 {

public static void main(String args[]) { 

double result;

/* Add code here to instantiate an array of String that can hold 8 elements */ 

String aryVals[] = new String[8];

/* Next add code like the line below to add 4 elements to the array */ 
aryVals[0] = "5.25";
aryVals[1] = "2.1";
aryVals[2] = "3.3";
aryVals[3] = "4.7";

result = sumStrAry(aryVals, 2); 
System.out.println("Result 1: " + result);

/* Add code here to instantiate 2 more String objects and add them to the array */ 

result = sumStrAry(aryVals, 4);

System.out.println("Result 2: " + result);

}

public static double sumStrAry(String aryVals[], int addThese){
	double result = 0;
	for(int counter=0; counter<addThese; counter+=1){
		double asDouble = Double.parseDouble(aryVals[counter]);
		result+=asDouble;
	}
	return result;
}


}
