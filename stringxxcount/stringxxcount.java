public class stringxxcount{
	public static void main(String [] args){
		String str = "xxo";
		
		System.out.println("xx_count");
	}

	public static int countXX (String str) {

		//String str = "xxo";
		

		  String target = "xx";
		  
		  int xx_count = 0;
		  
		  if (str.equals("")){
		     return 0;
		  }
		  
		  for (int counter=0; counter<(str.length()-1); counter+=1){
		  
		      if(str.substring(counter,counter+2).equals(target)){
		           xx_count++;
		           }else{
		           xx_count+=0;}
		  }
		  
		  return xx_count;
		      
		}
		      
}		
