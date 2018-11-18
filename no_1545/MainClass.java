package no_1545;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		for(int i = A; i >= 0; i--)
			System.out.print(i+" ");
		sc.close();
	}
}
