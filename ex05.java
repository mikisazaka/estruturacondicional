package estruturacondicional;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int codigo, qtda;
		codigo = sc.nextInt();
		qtda = sc.nextInt();
		double preco = 0;
		
		switch (codigo) {
		case 1:
			preco += 4 * qtda;
			break;
		case 2:
			preco += 4.5 * qtda;
			break;
		case 3:
			preco += 5 * qtda;
			break;
		case 4:
			preco += 2 * qtda;
			break;
		case 5:
			preco += 1.5 * qtda;
			break;
		default:
			System.out.println("Inválido");
		}
		
		System.out.printf("R$%.2f", preco);
		
		sc.close();

	}

}
