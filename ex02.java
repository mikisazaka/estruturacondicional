package estruturacondicional;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a;
		a = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
		
		sc.close();

	}

}
