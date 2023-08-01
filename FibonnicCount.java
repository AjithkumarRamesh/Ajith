package forloop1homework;

public class FibonnicCount {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int a=0,b=1,c=0;
		int count=0;
		for(int i=0;i<=num;i++) {
			c=a+b;
			count=count+a;
			a=b;
			b=c;
			
		}
		System.out.println(count);

	}

}
