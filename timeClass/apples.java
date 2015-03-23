class apples{
	public static void main(String[] args){
		timing timingObject = new timing();
		System.out.println(timingObject.toMilitary());
		timingObject.setTime(1, 05, 27);
		System.out.println(timingObject.toMilitary());
		System.out.println(timingObject.toCivilian());
		timing timingObject2 = new timing();
		timingObject2.setTime(14,8,34);
		System.out.println(timingObject2.toMilitary());
		System.out.println(timingObject2.toCivilian());
	}
}