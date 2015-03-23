public enum salmon {
	bucky("nice", "22"),
	kelsey("cutie", "10"),
	julia("bigmistake", "12"),
	nicole("italian", "13"),
	candy("different","14"),
	erin("iwish","16");
	
	private final String description;
	private final String year;
	
	salmon(String descript, String birthday){
		description = descript;
		year = birthday;
	}
	
	public String getDesc(){
		return description;
	}
	
	public String getYear(){
		return year;
	}
}