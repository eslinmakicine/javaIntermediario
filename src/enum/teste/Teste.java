package Enum.teste;

import Enum.DiaSemanaConstantes;

public class Teste {

	public static void main(String[] args) {
		
		usandoConstantes();
		imprimeDiaSemana(2);
	}
	
	private static void usandoConstantes() {
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("Utilizando constantesd no Java");
		System.out.println(segunda);
		System.out.println(terca);
		System.out.println(quarta);
		System.out.println(quinta);
		System.out.println(sexta);
		System.out.println(sabado);
		System.out.println(domingo);

		
	}
	
	private static void imprimeDiaSemana(int dia) {
		switch (dia) {
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Ter�a-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("S�bado-Feira");
			break;
		case 8:
			System.out.println("Domingo-Feira");
			break;
		}
	}

}
