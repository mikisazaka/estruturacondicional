package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		String local = "";
		
		if (x == 0.0) {
			local = "Eixo Y";
		} else if (y == 0) {
			local = "Eixo X";
		} else if ((x > 0) && (y > 0)) {
			local = "Q1";
		} else if ((x < 0) && (y > 0)) {
			local = "Q2";
		} else if ((x < 0) && (y < 0)) {
			local = "Q3";
		} else if ((x > 0) && (y < 0)) {
			local = "Q4";
		} else if ((x == 0) && (y == 0)) {
			local = "Origem";
		} else {
			local = "Inválido";
		}
		
		System.out.println(local);
		
		sc.close();

	}

}
