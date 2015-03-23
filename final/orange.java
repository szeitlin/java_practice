class orange{
	public static void main (String[] args) {
		shrimp shrimpObject = new shrimp(10);
		
		for (int i = 0; i<5; i++){
			shrimpObject.add();
			System.out.printf("%s", shrimpObject);
		}
	}
}