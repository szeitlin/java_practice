import java.util.Arrays;

public class ConvertStrAry {

	public static void main(String args[]) { 

/* Add code here to instantiate an array of String that can hold 5 elements */ 

String strVals[] = new String[5];
int intVals[] = new int[5];

/* Add code here to instantiate 5 String objects and add them to the array */ 
strVals[0] = "1";
strVals[1] = "2";
strVals[2] = "37";
strVals[3] = "42";
strVals[4] = "77";


intVals = convertToIntAry (strVals);

/* Add code here to print the contents of the integer array that was returned */

System.out.println(Arrays.toString(intVals));

}

/* Complete the function below – it returns an array of integers */
public static int[] convertToIntAry(String strVals[]) {

// Instantiate an array of integers the same size as the String array 

int intAry[] = new int[5];

// Convert each String to an integer and store the result in the integer array 
for(int counter=0; counter<strVals.length; counter+=1){
	int asInt = Integer.parseInt(strVals[counter]);
	intAry[counter] = asInt;
}
// return the integer array 
	return intAry;

}
}

