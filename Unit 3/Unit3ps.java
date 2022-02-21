public class Unit3ps {
	public static void main(String [] args) {
	// Question 1
		String name = "Jack Parker";
		name = name.toLowerCase();
		System.out.println(name);

	// Question 2
		String text = "I am a good coder";
		text = text.replace(" " , "_");
			System.out.println(text);

	// Question 3
		String letter = "Dear name , Thanks a lot";
		letter = letter.replace("name" , "coder");
			System.out.println(letter);

	// Question 4 
		String myString = "This code contain  double   triple space";
		System.out.println(myString.indexOf("  "));
		System.out.println(myString.indexOf("   "));

	// Question 5
		String myLetter = "Dear coder,\n\tThis Java Course is Nice \n\t Thank";
			System.out.println(myLetter);



	}
}