public class Unit3p2 {
	public static void main(String[] args){
		String name = "Harry";
		int value = name.length();
		System.out.println(value);

		
		//LowerCase

		String lstring = name.toLowerCase();
		System.out.println(lstring);

		
		//UpperCase

		String ustring = name.toUpperCase();
		System.out.println(ustring);

		// Non Trim 

		String nonTrimmedString = "       Harry      ";
		System.out.println(nonTrimmedString);
		String trimmedstring;
		System.out.println(nonTrimmedString.trim());

		// Substring 

		System.out.println(name.substring(2));

		// Substring
		
		System.out.println(name.substring(1,4));

		
		// Replace

		System.out.println(name.replace('r' , 'p'));
		System.out.println(name.replace("rry" , "ier"));



		// Start with / True or False

	//	System.out.println(name.starstWith("Har"));
	//	System.out.println(name.starstWith("Var"));


		// CharAt

		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));


		// IndexOf

		System.out.println(name.indexOf("r"));
		System.out.println(name.indexOf("y"));


		// Escape Sequence
		
		System.out.println("Hey I am Good \n In Pragramming");
		System.out.println("Hey I am Good \t In Pragramming");
		System.out.println("Hey I am Good \' In Pragramming");
		System.out.println("Hey I am Good \\ In Pragramming");

	
	}
}