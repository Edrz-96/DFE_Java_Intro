
public class HelloWorld {

	public static void main(String[] args) {
//output helloworld to the console

		System.out.println("Hello World");

//out helloworld as a string to the console
		String message = "Whatever";
		System.out.println(message);

		hi("Output three");
		System.out.println(usingReturn("Output four"));

	}

//	do the same with a method
	public static void hi(String input) {
		System.out.println(input);

	}

	public static String usingReturn(String str) {
		return str;
	}

}
