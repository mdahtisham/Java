public class Unit7p3 {
	static int sum(int a, int b){
		return a+b;
}
	static int sum(int a, int b, int c){
		return a+b+c;
}

	public static void main(String[] args) {
		System.out.println("Welcome to the varargs");
		System.out.println(sum(4, 5));
		System.out.println(sum(4,2,8));
	}
}