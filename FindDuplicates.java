package forloop1homework;

public class FindDuplicates {

	public static void duplicatechar(String name) {
		int count=0;
		char[] ch = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			count=0;
			for(int j=0;j<=i;j++) {
			if (ch[i]==ch[j]) {
				count++;
			}
			if(count>1) {
				System.out.println(ch[i]);
			}
			}
		}
	}

	public static void nonDuplicatechar(String name) {
		int count=0;
		char[]ch=name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			count=0;
			for(int j=0;j<=i;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='0';
				}
				if(count==1&&ch[i]!='0') {
					System.out.println(ch[i]);
				}
				
			}
			
		}
	}
	public static void duplicateCount(String name) {
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			int count=0;
			for(int j=0;j<name.length();j++) {
				if(name.charAt(j)==ch) {
					count++;
				}
			}
			
				System.out.println(ch+"-"+count);
			}
		}
	
	public static void nonDuplicateCount(String name) {
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			int count=0;
			for(int j=0;j<name.length();j++) {
				if(name.charAt(j)==ch) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(ch+"-"+count);
			}
		}
	}
	public static void main(String[] args) {
		String name = "heishero";
		duplicatechar(name);
		//nonDuplicatechar(name);
		
	}

}
