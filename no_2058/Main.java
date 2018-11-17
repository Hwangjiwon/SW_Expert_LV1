package no_2058;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;

		while (num != 0) {
			result += num % 10;
			num /= 10;
		}
		System.out.println(result);
		sc.close();
	}

}
