/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
	The value of n will be a valid index of a char in the original string,
	i.e. n will be in the range 0..str.length()-1 inclusive.

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
*/

public class Main {

    public void main(String[] args) {
        // write your code here
        String str = "code";
        tuna tunaObject = new tuna();;
        //System.out.println(frontBack(str));
    }

    public String frontBack(String str) {

        String newstring="";
        newstring += str.charAt(str.length());
        for(int i=1;i<(str.length()-1);i++){
            newstring+=str.charAt(i);

        }
        newstring+=str.charAt(0);
        System.out.println(newstring);
        return newstring;
    }
}
