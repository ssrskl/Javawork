
public class TestString {
	public static void main(String[] args) {
	String string = new String("abcdefghijklm");
	String string2 = "abcdf";
	System.out.println(string.charAt(3));
	System.out.println(string2.equals(string));
	System.out.println(string2.equalsIgnoreCase(string));
	System.out.println(string.indexOf('c'));
	
	}
}
