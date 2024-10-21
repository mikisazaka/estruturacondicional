package estruturacondicional;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int horaInicial, horaFinal, total;
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaFinal > horaInicial) {
			total = horaFinal - horaInicial;
		} else {
			total = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + total + " hora(s)");
		
		sc.close();

	}

}
