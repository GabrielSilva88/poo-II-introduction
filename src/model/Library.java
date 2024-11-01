package model;

public class Library {
/*
Implemente um sistema de gerenciamento para uma biblioteca. 
A classe Biblioteca representa o catálogo de livros, com informações sobre cada livro como:

- Nome do livro: O título do livro.
- Autor: O(s) autor(es) do livro.
- Gênero: A categoria literária do livro (ex: romance, fantasia, suspense).
- Editora: A empresa responsável pela publicação do livro.
- Ano de publicação: O ano em que o livro foi lançado.
- Disponibilidade: Indica se o livro está emprestado, disponível para empréstimo ou reservado.

A classe Biblioteca oferece métodos para:

- Empréstimo: Registra o empréstimo de um livro a um usuário.
- Devolução: Registra a devolução de um livro pelo usuário.
- Pesquisa por título/autor/gênero: Permite buscar livros no catálogo por diferentes critérios.
- Reservar livro: Permite que um usuário reserve um livro emprestado por outro.
- Renovar empréstimo: Permite estender o prazo de empréstimo de um livro, se disponível.
- Multar por atraso: Calcula e registra multas por atraso na devolução de livros.
*/
	// Atributos
	
	private String nome; // titulo
	private String autor;
	private String genero;
	private String editora;
	private String anoDePublicacao;
	private String disponibilidade;
	
	// métodos modificadores get e set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(String anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	public String getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	// métodos 
	
	// Empréstimo
	public String emprestar() {
		return "Registra o empréstimo de um livro a um usuário.";
	}
	
	// Devolução
	public String devolver() {
		return "Registra a devolução de um livro pelo usuário.";
	}
	
	// Pesquisa por título/autor/gênero
	public String pesquisar(String pesquisar) {
		if ( pesquisar == nome) {
			return this.nome;
		} else if (pesquisar == genero) {
			return this.genero;
		}else{
			return this.autor;
		}
	}
	
	//Renovar empréstimo
	public String renovarEmpestar() {
		return "Permite estender o prazo de empréstimo de um livro, se disponível.";
	}
	
	//Multar por atrasos
	public String multar() {
		return "Calcula e registra multas por atraso na devolução de livros.";
	}
}
