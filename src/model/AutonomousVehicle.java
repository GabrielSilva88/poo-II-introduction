package model;

public class AutonomousVehicle {
/*Implemente um sistema para controlar um veículo autônomo. A classe **`VeículoAutonomo`** representa um carro capaz de se locomover sem intervenção humana, com informações como:

- **Modelo:** O nome do modelo do veículo autônomo.
- **Velocidade atual:** A velocidade em que o veículo está se movendo no momento.
- **Destino:** O local para onde o veículo deve se dirigir.

A classe **`VeículoAutonomo`** oferece métodos para:

- **Definir destino:** Informa o local para onde o veículo deve se dirigir.
- **Iniciar viagem:** Aciona o sistema de direção autônoma e começa a viagem em direção ao destino.
- **Parar veículo:** Interrompe a viagem e estaciona o veículo com segurança.*/
	
	// ATRIBUTOS
	
	private String modelo;
	private double velocidadeAtual;
	private String destino;
	
	// MÉTODO
	
	public void definirDestino() {
		
	}
	
	public void iniciarViagem() {
		
	}
	
	public void pararVeiculos() {
		
	}
	
	// Gets(); e Sets();

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	
	
}
