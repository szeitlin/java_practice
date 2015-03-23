class somenums{
	public static void main(String[] args){
		System.out.println(average(3,4,5,43,56,76,8));
	}
	
	public static int average(int... numbers){
		int total=0;
		for(int x:numbers)
			total+=x;
		
		return total/numbers.length;
	}
	
}

//question on this: how to do it with a double? 