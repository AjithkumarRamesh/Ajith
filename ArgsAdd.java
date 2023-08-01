package forloop1homework;

public class ArgsAdd {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		for(int i=a;i<a+b;i++) {
			System.out.println(i);
		}

	}

}
