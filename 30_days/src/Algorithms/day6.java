package Algorithms;

import java.util.Scanner;

public class day6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		in.nextLine();
		
		for (int i = 0; i <= N; i++) {
			String s = in.nextLine();
			String even = "", odd = "";
			
			for(int j = 0; j < s.length(); j++) {
				if(j % 2 ==0) 
					even += s.substring(j, j+1);
				else
					odd += s.substring(j, j+1);
			}
			System.out.println(even + " " + odd);
		}
		in.close();

	}
}
