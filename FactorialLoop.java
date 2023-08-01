package forloop1homework;

public class FactorialLoop {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int factorial=1;
		for(int i=1;i<=a;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}
