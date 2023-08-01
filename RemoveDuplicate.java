package forloop1homework;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String a="abcabc";
		String b="";
		
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(b.indexOf(c)<0) {
				b+=c;
			}
		}
		System.out.println(b);
	}
}
