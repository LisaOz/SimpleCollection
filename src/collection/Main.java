package collection;

public class Main {
	public static void main(String[] args) {
		SimpleCollection c = new SimpleCollection("Letters");
		System.out.println(c);

		c.add("a");
		System.out.println("b");

		c.add("b");
		System.out.println(c);

		c.add("c");
		System.out.println(c);

		c.replace("c", "d");
		System.out.println("After replacing elements,");
		System.out.println(c);

		c.remove("d");
		System.out.println("After removing elements,");
		System.out.println(c);

	}
}
