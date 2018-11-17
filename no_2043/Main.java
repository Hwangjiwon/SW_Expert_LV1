package no_2043;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int K = sc.nextInt();
		
		int result;
		
		for(result = 1; K != P; K++,result++);
		
		System.out.println(result);
		
		sc.close();
	}

}
