package Enum.teste;

import Enum.GeraCpfCnpj;

public enum TipoDocumento {
	CPF{
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraNumeroTeste();
	

}
