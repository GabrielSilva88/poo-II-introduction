package model;

public class Car {
/*
Imagine um sistema para controlar as funções de um carro. 

A classe Carro representa um veículo com:

- Marca: O fabricante do carro (ex: Fiat, Volkswagen, Chevrolet).
- Modelo: O nome específico do modelo (ex: Argo, Gol, Onix).
- Ano: O ano de fabricação do carro.
- Cor: A cor do carro.
- Quilometragem: A distância total percorrida pelo carro.
- Combustível: O tipo de combustível utilizado pelo carro (gasolina, diesel, etc.).

A classe Carro oferece métodos para:

- Ligar: Aciona o motor do carro.
- Desligar: Desliga o motor do carro.
- Acelerar: Aumenta a velocidade do carro.
- Frear: Diminui a velocidade do carro.
- Abastecer: Adiciona combustível ao tanque do carro.
*/
	// ATRIBUTO
   private String Marca;
   private String Modelo;
   private int Ano;
   private String Cor;
   private double Quilometragem;
   private String Combustivel;
   // ATRIBUTOS PARA METODOS
   private boolean motor;
   private double velocidade;
   private double temCombustivel;
 
	
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
		return Combustivel;
	}

	public void setCombustível(String combustível) {
		Combustivel = combustível;
	}

	// MÉTODOS 
	
	public void ligarMotor() {
		if(motor == false) {
			motor = true;
			System.out.println("O motor da partida e liga.");
		}else {
			System.out.println("O motor ja deu partida e está ligado.");
		}
	}
	
	public void desligarMotor() {
		if(velocidade == 0 && motor) {
			motor = false;
			System.out.println("O motor foi desligado.");
		}else if(velocidade > 0 ) {
			System.out.println("Reduzir velocidade para zero, desligar o motor.");
		}else {
			System.out.println("O carro já, desligado.");
		}
	}
	
	public void acelerar() {
		if (motor == true && velocidade < 0) {
			velocidade ++;
			Quilometragem += velocidade;
			temCombustivel -= velocidade;
		System.out.println("O motor e acelerado" + velocidade + "velocidade aumenta." + temCombustivel +"o combustivel do tanque");
		} else {
			System.out.println("O motor ");
		}
	}
	
	public void frear(double reduzir) {
		if (motor==true && velocidade > 0) {
			velocidade -= reduzir;
			if (velocidade < 0) {
				velocidade = 0;
			}
			System.out.println("Freando, velocidade parando:");
		}
			
	}
	
	public void abastercer(double litros) {
		temCombustivel += litros;
		System.out.println("Tanque com"+temCombustivel+", abastecido" + litros);
	}
}
