import java.util.Scanner;
public class Unit4ps2 {
	public static void main(String[] args){
	int day;
		System.out.println("Enetr a number only you can  select 1 to 7");
			Scanner sc = new Scanner(System.in);
			day = sc.nextInt();
				switch(day){
				case 1:
					System.out.println("Monday");
				break;
				case 2:
					System.out.println("Tuesday");
				break;
				
				case 3:
					System.out.println("Wednesday");
				break;

				case 4:
					System.out.println("Thursday");

				case 5:
					System.out.println("Friday");
				break;

				case 6:
					System.out.println("Saturday");
				break;

				case 7:
					System.out.println("Sunday");
				break;


				default:
					System.out.println("Wrong Number");
				break;

			}
	}
}