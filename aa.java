package comparable;

import java.util.Arrays;

public class aa {

	public static void main(String[] args) {
	String [] x = new String[] {"anas", "hiba","aya","tania"};
	int [] y = new int[] {5,7,3,4,9};
	Arrays.sort(x);    // sort String  alfabetic
	for (String item : x) {
		System.out.print(item +"  ");
		
	}
	System.out.println();
	Arrays.sort(y);   // sort int ascending
	for (int item : y) {
		System.out.print(item +"  ");
		
	}

	}

}
