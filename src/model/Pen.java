package model;

public class Pen {
/*Desenvolva uma simulação de uma caneta para uso em um software de anotações. A classe Caneta representa uma caneta com:

- Cor da tinta: A cor da tinta utilizada pela caneta (ex: azul, preta, vermelha).
- Tamanho da ponta: A espessura da ponta da caneta (ex: fina, média, grossa).
- Marca: O fabricante da caneta.
- Nível de tinta: Indica a quantidade de tinta restante na caneta.

A classe Caneta oferece métodos para:

- Escrever: Simula a escrita com a caneta na interface do software.
- Trocar cor da tinta: Permite selecionar uma cor de tinta diferente.
- Verificar nível de tinta: Exibe o nível de tinta restante na caneta.*/
	
	// ATRIBUTOS
	private String corDaTinta;
	private String tamanhoDaPonta;
	private String marca;
	private int nivelDeTinta;
	
	// GETS E SETS
	public String getCorDaTinta() {
		return corDaTinta;
	}

	public void setCorDaTinta(String corDaTinta) {
		this.corDaTinta = corDaTinta;
	}

	public String getTamanhoDaPonta() {
		return tamanhoDaPonta;
	}

	public void setTamanhoDaPonta(String tamanhoDaPonta) {
		this.tamanhoDaPonta = tamanhoDaPonta;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNivelDeTinta() {
		return nivelDeTinta;
	}

	public void setNivelDeTinta(int nivelDeTinta) {
		this.nivelDeTinta = nivelDeTinta;
	}

	//MÉTODOS
	public String escrever(String tampa) {
		if(tampa.equalsIgnoreCase("aberta")) {
			return "caneta pode escrever";
		}else {		
			return "caneta não, escreve uma palavra";
		
		}
	}
	
	public String trocarCorDaCaneta() {
		return "cor mudada";
	}
	
	public int verificarNivelDeTinta() {
		return nivelDeTinta;
	}
}
