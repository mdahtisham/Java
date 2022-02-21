import java.util.Scanner;
public class Project1 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first subject marks :  ");
	int subject1 = sc.nextInt();
		System.out.println("Enter your second subject marks :  ");
	int subject2 = sc.nextInt();
		System.out.println("Enter your third subject marks :  ");
	int subject3 = sc.nextInt();
		System.out.println("Enter your fourth subject marks :  ");
	int subject4 = sc.nextInt();	
		System.out.println("Enter your fifth subject marks :  ");
	int subject5 = sc.nextInt();
		float percentage = (subject1 + subject2 + subject3 + subject4 + subject5)/500.0f*100;
		System.out.println("Percentage :   ");
		System.out.println(percentage);
	}
}


			//Calculator for 5 Subject Percentage