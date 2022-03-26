package Enum.teste.calculadora;

public class Calculadora {
	enum Operacao {
		SOMAR("+") {
			@Override
			public double executaEperacao(double x, double y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		},
		SUBTRAIR("-") {
			@Override
			public double executaEperacao(double x, double y) {
				// TODO Auto-generated method stub
				return x-y;
			}
		},
		MULTIPLICAR("*") {
			@Override
			public double executaEperacao(double x, double y) {
				// TODO Auto-generated method stub
				return x*y;
			}
		},
		DIVIDIR("/") {
			@Override
			public double executaEperacao(double x, double y) {
				// TODO Auto-generated method stub
				return x/y;
			}
		};

		private String simbolo;

		private Operacao(String simbolo) {
			this.simbolo = simbolo;
		}

		public abstract double executaEperacao(double x, double y);
		
		public String toString() {
			return this.simbolo;
		}
	}
	
	public static void main(String[] args) {
		double x = 2.0;
		double y = 3.0;
		
		for(Operacao op : Operacao.values()) {
			System.out.println(x + " ");
			System.out.println(op.toString() + " ");
			System.out.println(y + " ");
			System.out.println(op.executaEperacao(x, y));
			System.out.println(" ");
		}
	}

}
