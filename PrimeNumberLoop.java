package forloop1homework;

public class PrimeNumberLoop {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		boolean b=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				b=false;
			}
		}
		System.out.println(b);
	}

}
