package estruturacondicional;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a;
		a = sc.nextDouble();
		String intervalo = "";
		
		if ((a >= 0) && (a <= 25)) {
			intervalo = "Intervalo [0,25]";
		} else if ((a > 25) && (a <= 50)) {
			intervalo = "Intervalo (25,50]";
		} else if ((a > 50) && (a <= 75)) {
			intervalo = "Intervalo (50,75]";
		} else if ((a > 75) && (a <= 100)) {
			intervalo = "Intervalo (75,100]";
		} else {
			intervalo = "Fora do intervalo";
		}
		
		System.out.println(intervalo);
		
		sc.close();

	}

}
