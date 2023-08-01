package forloop1homework;

public class CharAtCount {
	public static void main(String[] args) {
		String name="ajithkumar";
		int []count=new int[256];
		int len=name.length();
		for(int i=0;i<len;i++) 
			count[name.charAt(i)]++;
		char ch[]=new char[name.length()];	
		
		for(int i=0;i<len;i++) {
			ch[i]=name.charAt(i);
			int a=0;
			for(int j=0;j<=i;j++) {
				if(name.charAt(i)==ch[j]) {
					a++;
				}
				if(a==1)
					System.out.println(name.charAt(i)+"-"+count[name.charAt(i)]);
			}
		
		}
	}

}
