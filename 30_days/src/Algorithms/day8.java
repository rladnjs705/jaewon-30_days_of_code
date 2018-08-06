package Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class day8 {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		Map<String, Object> phoneBook = new HashMap<>();
		
		
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			
			phoneBook.put(name, phone);
			
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			// Write code here
			
			if(phoneBook.containsKey(s)){
				System.out.println(s+"="+phoneBook.get(s));
			}else
			{
				System.out.println("Not found");
			}
			
		}
		in.close();

	}
}
