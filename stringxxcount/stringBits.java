public class stringBits{
	
	public static void main(String[] args){
		
		String str = "Hello";
		
		System.out.println(stringBiter(str));
	}
	
	public static String stringBiter(String str) {
		  
		  String bitty = "";
		     
		  for (int i=0; i < str.length() ; i+=2){
		     bitty = bitty + str.substring(i,i+1);   
		}

		  return bitty;
		}
}