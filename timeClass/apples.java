class apples{
	public static void main(String[] args){
		timing timingObject = new timing();
		System.out.println(timingObject.toMilitary());
		timingObject.setTime(1, 05, 27);
		System.out.println(timingObject.toMilitary());
	}
}