package model;

public class SupermarketCheckout {
/*
Neste exercício, você irá simular um caixa de supermercado para registrar compras.
A classe CaixaSupermercado representa o terminal onde os produtos são registrados e o pagamento é realizado.
Essa classe inclui informações como número da compra, lista de itens comprados e total da compra.

Atributos

- numeroCompra: Um identificador único para cada compra.
- itensComprados: Uma lista contendo todos os produtos comprados, incluindo quantidade e preço.
- totalCompra: O valor total da compra.

Métodos

- adicionarItemCompra(Produto item): Adiciona um produto à lista de itens comprados.
- removerItemCompra(Produto item): Remove um produto da lista de itens comprados.
- calcularTotalCompra(): Calcula o valor total de todos os itens comprados para determinar o total da compra.
- imprimirReciboCompra(): Gera um recibo detalhando os itens comprados, seus preços individuais e o total da compra.
- fecharCompra(): Finaliza a compra e registra o pagamento.
- aceitarPagamento(String metodoPagamento): Permite realizar o pagamento da compra por diferentes métodos, como dinheiro, cartão ou pix.

Instruções:

Implemente a classe CaixaSupermercado com os atributos e métodos descritos acima.
Certifique-se de que os métodos realizem suas respectivas operações de forma correta e eficiente.
*/
	/* Atributos */
	
	private int numeroCompra; 	//- numeroCompra: Um identificador único para cada compra.
	private int itensComprados; //- itensComprados: Uma lista contendo todos os produtos comprados, incluindo quantidade e preço.
	private double valorCompra; // valor unitario do preço do produto. "adicionado"
	private double totalCompra; // totalCompra: O valor total da compra.
	
	/* Métodos */
	
	public int adicionarItemCompra(/*Produto item*/){
		return this.itensComprados++;
	}
	
	public int removerItemCompra(/*Produto item*/) {
		return this.itensComprados--;
	}
	
	public double calcularTotalCompra() {
		return this.numeroCompra * this.valorCompra;
	}
	
	public String imprimirReciboCompre() {
		return "valor total da compra" + totalCompra + "Total de itens" + numeroCompra;
	}
	
	public String fecharCompra() {
		return "fechar";
	}
	
	public String aceitarPagamentos(String metodoPagamento) {
		return "removido";
	}
	
	// set() e get()

	public int getNumeroCompra() {
		return numeroCompra;
	}

	public void setNumeroCompra(int numeroCompra) {
		this.numeroCompra = numeroCompra;
	}

	public int getItensComprados() {
		return itensComprados;
	}

	public void setItensComprados(int itensComprados) {
		this.itensComprados = itensComprados;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
	

	
}
