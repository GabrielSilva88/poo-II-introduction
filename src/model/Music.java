package model;

public class Music {
/* 
Represente  uma Música. A classe deve ter atributos como título, artista e gênero. 
Os métodos dessa classe serão, no mínimo, reproduzir, pausar e exibir descrição.
*/
	// atributos
	private String titulo;
	private String artista;
	private String genero;
	private String album;
	
	// set(); e get();
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	// metódos
	
	public String reproduzir() {
		return "paly ►";
	}
	
	public String pausar() {
		return "pause ⏸︎";
	}
	
	public String exibirDescricao() {
		return "Música: titulo e autor";
	}
	
}

