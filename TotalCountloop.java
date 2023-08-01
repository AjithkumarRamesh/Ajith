package forloop1homework;

public class TotalCountloop {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int count=0;
	for(int i=1;i<=a;i++) {
		count=count+i;
	}
	System.out.println(count);
}
}
