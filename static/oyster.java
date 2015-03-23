public class oyster {
	private String first;
	private String last;
	private static int members = 0;
	
	public oyster(String firstname, String lastname){
		first = firstname;
		last = lastname;
		members ++;
		System.out.printf("Constructor for %s %s, members in the hot girl club: %d\n", first, last, members);
	}
	
}