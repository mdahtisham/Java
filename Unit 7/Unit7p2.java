public class Unit7p2 {
	static void change(int a){
		a = 98;
	}
		static void change2(int [] arr){
		arr[0] = 98;
	}
		static void tellJoke(){
		System.out.println("I invented a new word\n" + 
				"Pilagiarism!");
	}

	public static void main(String[] args){
	//	tellJoke();

	int [] marks = {53, 78, 94, 39, 48};
		change2(marks);
	System.out.println(marks[0]);


	}
}
			 