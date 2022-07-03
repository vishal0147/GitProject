package Pratice1;

public class Demo2 {

	public static void main(String[] args) {

		String a="abc";
		String b="ABC";
		String c="abc";
		String d="abC";
		
		System.out.println(a.compareTo(b));
	
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(c));
		System.out.println(a.compareTo(d));
	}

}
