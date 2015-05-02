public class arrayCount9{
	
	public static void main(String[] args){
		
		System.out.println("array count");
		System.out.println(arrayCount9());
	}
	
	public static int arrayCount9() {
		  int counter = 0;
		  
		  int [] arr = {1,3,9};
		  
		     
		  for (int i=0; i<arr.length; i+=1){
		      if (arr[i]==9){
		          counter+=1;
		      } else {
		          counter+=0;
		      }
		  
		  
		}
		  return counter;
	}
}	
