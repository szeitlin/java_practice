public class HelloPrinter
{
    public static void main(String[] args)
    {
        Day sallyRidesBirthday = new Day(1951, 5, 26);
        Day sallyRideDied = new Day(2012, 7, 23);
        System.out.println(sallyRideDied.daysfrom(sallyRidesBirthday));
        
    }
}
