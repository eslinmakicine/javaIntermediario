package Enum.teste;

import Enum.DiaSemana;

public class TesteEnum2 {
	public static void main(String[] args) {
		DiaSemana dia;
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
	}

	
}
