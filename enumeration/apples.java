import java.util.EnumSet;

class apples {
	public static void main(String[] args){
		for (salmon people: salmon.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		
		System.out.println("\n\nAnd now for the range of constants!!\n");
		
		for (salmon people: EnumSet.range(salmon.kelsey, salmon.candy))
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
	}
}