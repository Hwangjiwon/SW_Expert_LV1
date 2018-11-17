package no_2050;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = null;
		str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, "");
		String[] result = new String[st.countTokens()];
		
		int i = 0;
		while(st.hasMoreElements()) {
			int arr[] = new int[st.countTokens()];
			result[i++] = st.nextToken();
			
		}
		
		sc.close();
	}
}

