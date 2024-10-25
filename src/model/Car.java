package model;

public class Car {
/*
Imagine um sistema para controlar as funções de um carro. 

A classe **`Carro`** representa um veículo com:

- **Marca:** O fabricante do carro (ex: Fiat, Volkswagen, Chevrolet).
- **Modelo:** O nome específico do modelo (ex: Argo, Gol, Onix).
- **Ano:** O ano de fabricação do carro.
- **Cor:** A cor do carro.
- **Quilometragem:** A distância total percorrida pelo carro.
- **Combustível:** O tipo de combustível utilizado pelo carro (gasolina, diesel, etc.).

A classe **`Carro`** oferece métodos para:

- **Ligar:** Aciona o motor do carro.
- **Desligar:** Desliga o motor do carro.
- **Acelerar:** Aumenta a velocidade do carro.
- **Frear:** Diminui a velocidade do carro.
- **Abastecer:** Adiciona combustível ao tanque do carro.
*/

	String Marca;
	String Modelo;
	int Ano;
	String Cor;
	double Quilometragem;
	String Combustível;
	
	// set() e get()
	
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public double getQuilometragem() {
		return Quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		Quilometragem = quilometragem;
	}

	public String getCombustível() {
		return Combustível;
	}

	public void setCombustível(String combustível) {
		Combustível = combustível;
	}

	// métodos
	
	public String ligar() {
		return "Aciona o motor do carro.";
	}
	
	public String desligar() {
		return "Desliga o motor do carro.";
	}
	
	public String acelerar() {
		return "Aumenta a velocidade do carro.";
	}
	
	public String frear() {
		return "Diminui a velocidade do carro.";
	}
	
	public String abastercer() {
		return "Adiciona combustível ao tanque do carro.";
	}
}
