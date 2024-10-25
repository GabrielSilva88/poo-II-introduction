package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task {
	
	/*
	 * Imagine um sistema para gerenciar suas tarefas do dia a dia.
	 * Cada tarefa é representada pela classe Tarefa , que possui:
	 * 
	 * Descrição → Uma breve descrição do que precisa ser feito (ex: “Comprar leite”, “Escrever relatório”).
	 * Data de criação → A data em que a tarefa foi criada. 
	 * Estado → Indica se a tarefa está pendente ou concluída.
	 * 
	 * A classe Tarefa também terá métodos para:
	 * 
	 * Marcar Como Concluída → Altera o estado da tarefa para “concluída”. 
	 * Editar Descrição → Permite modificar o texto da descrição da tarefa.
	 * 
	 */
	// ATIBUTOS
	
	private String descricao;
	private LocalDateTime dataCriacao;
	private String estado;
	private LocalDateTime dataAlteracaoEstado;
	
	// CONSTRUTOR
	public Task(String descricao) {
		super();
		this.descricao = descricao;
		this.dataCriacao = LocalDateTime.now();
		this.estado = "pedente";
	}
	
	// METODO MARCAR COMO CONCLUÍDO
	public void marcarConcluido() {
		this.estado = "conlcuído";
	}
	
	// METODO EDITAR DESCRIÇÃO
	public void editarDescricao(String novaDescricao) {
		this.descricao = novaDescricao;
	}
	
	// METODO DATA DA CRIAÇÃO ALTERADA
	public String getDescricaoFormatada() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return "Tarefa: " + descricao + "\nData de Descrição: "+ dataCriacao.format(formatter) + "\nEstado: " + estado;
	}
	
	// METODO DATA DA ALTERAÇÃO DO ESTADO
	public LocalDateTime getDataAlteracaoEstado() {
		return dataAlteracaoEstado;
	}

	// GETS E SETS
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	
	
	
}

/* atributos não corresponde as funções
Scanner sacn = new Scanner(System.in);
String descricao;
int dataDeCriacao;
boolean estado;
*/
/* METODOS NÃO UTILIZADOS, NÃO CORRESPONDER
public boolean marcarComoConcluido(boolean estado) {
	this.estado = estado;
	if (estado == false) {
		System.out.println("Pendente");
	} else {
		estado = true;
		System.out.println("Concluída");
	}
	return estado;
}

public String editarDescriacao(String editarDescricao) {
	if(descricao == null || descricao.isEmpty()) {
		System.out.println("Digite : ");
		this.descricao = editarDescricao;
		editarDescricao = sacn.nextLine();
	}
	return editarDescricao;
}
*/