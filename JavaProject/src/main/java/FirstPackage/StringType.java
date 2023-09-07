package FirstPackage;

public class StringType {

	public static void main(String[] args) {
		
		String text = "Welcome to Automation Testing Training";
		System.out.println(text);
		System.out.println("Total length of the text"+" "+text.length());
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		//System.out.println(text.contains("Automation"));
		
		//boolean s=text.contains("automation"); //Its a case sensitive
		boolean s=text.equalsIgnoreCase("welcome to automation Testing Training");  // Answer is true
		System.out.println(s);
		
		
		
		
		

	}

}
