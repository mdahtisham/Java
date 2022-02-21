public class Unit6p2 {
	public static void main(String[] args) {
	//	int [] marks = {98,36,73,84,38};
	//	float [] marks = {83.0f ,91.5f ,83.7f ,74.0f ,84.8f};
	//	String [] student = {"Code", "Pragrammer", "Java", "CS", "Coder"};

	//		System.out.println(marks[1]);
	//		System.out.println(student[2]);
			

		// For find out the length of Array

	//	System.out.println(marks.length);



		int [] marks = {98,36,73,84,38};
			
		//	for(int i = 0; i<marks.length;i++){                 //for loop
		//		System.out.println(marks[i]);      
		//    }


			for(int element: marks) {  			    //for each loop
				System.out.println(element);
		}
	}
}