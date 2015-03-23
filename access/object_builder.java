class potato{
	public static void main(String[] args){
		
		cod codObject = new cod();
		cod codObject2 = new cod(5);
		cod codObject3 = new cod(5,13);
		cod codObject4 = new cod(5,13,43);
		
		System.out.printf("%s\n", codObject.toMilitary());
		System.out.printf("%s\n", codObject2.toMilitary());
		System.out.printf("%s\n", codObject3.toMilitary());
		System.out.printf("%s\n", codObject4.toMilitary());
	}
}