package estruturacondicional;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a;
		a = sc.nextInt();
		
		if (a < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Não é negativo");
		}
		
		sc.close();

	}

}
