package model;

public class Atm {
/*
Neste exercício, você irá simular um caixa de supermercado para registrar compras. 
A classe CaixaSupermercado representa 
o terminal onde os produtos são registrados e o pagamento é realizado. 
Essa classe inclui informações como número da compra, lista de itens comprados e total da compra.

Atributos

-numeroCompra: Um identificador único para cada compra.
-itensComprados: Uma lista contendo todos os produtos comprados, incluindo quantidade e preço.
-totalCompra: O valor total da compra.

Métodos

-adicionarItemCompra(Produto item): Adiciona um produto à lista de itens comprados.
-removerItemCompra(Produto item): Remove um produto da lista de itens comprados.
-calcularTotalCompra(): Calcula o valor total de todos os itens comprados para determinar o total da compra.
-imprimirReciboCompra(): Gera um recibo detalhando os itens comprados, seus preços individuais e o total da compra.
-fecharCompra(): Finaliza a compra e registra o pagamento.
-aceitarPagamento(String metodoPagamento): Permite realizar o pagamento da compra por diferentes métodos, como dinheiro, cartão ou pix.

Instruções:

Implemente a classe CaixaSupermercado com os atributos e métodos descritos acima.
Certifique-se de que os métodos realizem suas respectivas operações de forma correta e eficiente.
*/
	private int numeroCompra;
	private int itensComprados;
	private int totalCompra;
	
	// SET E GET
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
	public int getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(int totalCompra) {
		this.totalCompra = totalCompra;
	}
	
	// MÉTODOS
	public int adicionarItemComprar(int produto){
		return this.itensComprados = produto; 
	}
	
}
