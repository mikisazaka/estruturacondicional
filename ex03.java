package estruturacondicional;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if ((a % b == 0) || (b % a == 0)) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();

	}

}
