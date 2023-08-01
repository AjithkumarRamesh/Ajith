package forloop1homework;

public class FabonnicSeries {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int a=0,b=1,c;
		for(int i=0;i<=num;i++) {
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
	}

}
