public class count_six_seven{
	
	public static void main (String [] args){
		
		int [] testarray = {6,7,2,6};
		System.out.println(array667(testarray));
	}
	
	public static int array667(int[] nums) {
		  
		  int counter = 0;
		  
		  if(nums.length==0){
		     return 0;
		  }
		  
		  for(int i=0; i <(nums.length-1); i+=1){
		     int a = nums[i];
		     int b = nums[i+1];
		     
		     if(a==6 & (b==6|b==7)) {
		        counter+=1;
		        } else {
		        counter+=0;
		        }
		}
		   return counter;
		}
}