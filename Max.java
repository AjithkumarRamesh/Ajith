package forloop1homework;

public class Max {
	public static void main(String[] args) {
		int[] num = { 10, 100, 20, 30, 40, 500, 1000 };
		String[] word = { "Ajithkumar", "Divya" ,"Mutheeswari"};
		String maxs=word[0];
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		for(int i=0;i<word.length;i++) {
			if(word[i].length()>maxs.length()) {
				maxs=word[i];
			}
		}
		System.out.println(maxs);
		System.out.println(max);
	}

}
