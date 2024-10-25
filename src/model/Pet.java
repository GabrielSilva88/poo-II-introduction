package model;

public class Pet {
/*Crie um aplicativo para cuidar de seu animal de estimação. A classe **`AnimalEstimação`** representa um animal com:

- **Nome:** O nome do animal.
- **Idade:** A idade do animal em anos ou meses.
- **Espécie:** O tipo de animal (ex: cachorro, gato, peixe).
- **Raça:** A raça específica do animal (ex: Labrador Retriever, Siamês, Guppy).
- **Porte:** O tamanho do animal (ex: pequeno, médio, grande).
- **Sexo:** O sexo do animal (macho ou fêmea).

A classe **`AnimalEstimação`** oferece métodos para:

- **Alimentar:** Fornece comida ao animal.
- **Brincar:** Interage com o animal para se divertir e gastar energia.
- **Levar ao veterinário:** Permite agendar consultas e levar o animal para receber cuidados médicos.
- **Passear:** Leva o animal para passear ao ar livre.
- **Dar banho:** Limpa o animal de estimação.
- **Treinar:** Ensina comandos básicos ao animal.
- **Verificar felicidade:** Monitora o bem-estar do animal e identifica sinais de estresse ou tristeza.
*/
	
	// Atributos
	
	private String nome; // O nome do animal.
	private String idade; // A idade do animal em anos ou meses.
	private String especie; // O tipo de animal (ex: cachorro, gato, peixe).
	private String raca; // A raça específica do animal (ex: Labrador Retriever, Siamês, Guppy).
	private String porte; // O tamanho do animal (ex: pequeno, médio, grande).
	private String sexo; // O sexo do animal (macho ou fêmea).

	// get(); e set();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	// Metódos
	
	public String Alimentar() {
		return "Fornecer comida ao animal";
	}
	
	public String brincar() {
		return "Interage com o animal para se divertir e gastar energia";
	}
	
	public String levarAoVeterianrio() {
		return "Permite agendar consultas e levar o animal para receber cuidados médicos.";
	}
	
	public String Pessear() {
		return "Leva o animal para passear ao ar livre.";
	}
	
	public String darBanho() {
		return "Limpa o animal de estimação.";
	}
	
	public String treinar() {
		return "Ensina comandos básicos ao animal.";
	}
	
	public String verificarFelicidade() {
		return "Monitora o bem-estar do animal e identifica sinais de estresse ou tristeza.";
	}
}
