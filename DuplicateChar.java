package forloop1homework;

public class DuplicateChar {
	public static void main(String[] args) {
		String name="PrakeshKumar";
		String dup="";
		char[]c=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(c[i]==c[j]) {
					dup=dup+c[j];
					
				}
				
			}
			
		}
		System.out.println(dup);
	}

}
