package comparable;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
//		Members m1 = new Members("anas" , 40);
//		Members m2 = new Members("hiba" , 36);
//		Members m3 = new Members("ali" , 30);
//		Members m4 = new Members("tania" , 25);
		
		// if we have array of objects and we want to sort them (as age or name ...) so we 
		// must have special method (compareTo()) in the class and depends on what this methods
		// have in the body we sort the objects and we must have just one compareTo() in class
		
		Members[]names = new Members[4];
		names[0] = new Members("anas" , 40);
		names[1] = new Members("hiba" , 36);
		names[2] = new Members("ali" , 30);
		names[3] = new Members("tania" , 25);
		// we can not use this method alone with objects have attributes will be(error)and that why
		// we use implements Comparable<> 
		Arrays.sort(names);      // we use Arrays.sort method cause we have array not ArrayList
	// 	Collections.sort(names);  ------> error cause this Collections uses with ArrayList
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
//		System.out.println();
//		Members m1 = new Members("abc" , 30);
//		Members m2 = new Members("abd" , 25);
//		System.out.println(m1.compareTo(m2));
//		
		

	}

}
