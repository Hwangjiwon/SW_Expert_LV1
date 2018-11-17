package no_2056;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int year, month, day;
		for (int i = 0; i < T; i++) {
			int buf = sc.nextInt();

			day = buf % 100;
			buf /= 100;
			month = buf % 100;
			buf /= 100;
			year = buf;
			
			if (month < 1 || month > 12 || day < 1 || day > 31) 
				System.out.printf("#%d -1\n",(i+1));
			else if(month == 2 || month == 4 || month == 6 || month == 9 || month == 11){
				
				if(month ==2 && day > 29)
						System.out.printf("#%d -1\n",(i+1));
				else if(day > 31)System.out.printf("#%d -1\n",(i+1));
				else System.out.printf("#%d %04d/%02d/%02d\n",(i+1),year,month,day);
				
			} else System.out.printf("#%d %04d/%02d/%02d\n",(i+1),year,month,day);	
		}
		sc.close();
	}
}
