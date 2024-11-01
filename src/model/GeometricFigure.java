package model;

public class GeometricFigure {
	/*
	 * Implemente um sistema para trabalhar com formas geométricas. 
	 * A classe FiguraGeometrica representa uma forma geométrica abstrata, com informações como:
	 * 
	 * - Tipo de figura: Indica o tipo da forma geométrica (ex: triângulo, círculo, retângulo). 
	 * - Dimensões: As medidas necessárias para definir a forma (ex: base, altura, raio).
	 * 
	 * A classe FiguraGeometrica oferece métodos para:
	 * 
	 * - Calcular área: Calcula a área da figura geométrica. 
	 * - Calcular perímetro: Calcula o perímetro da figura geométrica. 
	 * - Desenhar a figura: Exibe a figura geométrica na tela.
	 * 
	 * OBS.: sujestão prof. Caio, transformar em ENUM os tipos de figuras.
	 * 
	 */

	// ATRIBUTO
	// private String tipoDeFigura;
	private double base;
	private double altura;
	private double raio;
	private double lado;
	
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

/*	NÃO FUCIONA
	
	public enum tipoDeFigura {
		triangulo {
			double lado1, lado2, lado3;
			double area = (base * altura) / 2;
			double perimetro = lado1 + lado2 + lado3;
		},
		circulo {
			double area = Math.PI * Math.pow(raio, 2);
			double perimetro = 2 * Math.PI * raio;
		},
		retangulo{
			double area = base * altura;
			double perimetro = 2 * (base * altura);
		}, 
		quadrado{
			double lado;
			double area = lado * lado;
			double perimetro = 4 * lado;
		}
	}
*/
	public double calcularArea(String figura) {
	switch (figura) {
		case "triangulo": {
			double area = (base * altura) / 2;
		}
		case "ciruclo": {
			double area = Math.PI * Math.pow(raio, 2);
				
		}
		case "retangulo": {	
			double area = base * altura;
		}
		case "quadrado": {
			double lado = 0;
			double area = lado * lado;
			
		}
		
		default:
			throw new IllegalArgumentException("figura não encontrada: " + figura);
		}
	}

	public double calcularPerimetro(String figura) {
		switch (figura) {
		case "triangulo": {
			double lado1 = 0, lado2 = 0, lado3 = 0;
			
			double perimetro = lado1 + lado2 + lado3;	
		}
		case "ciruclo": {
			double perimetro = 2 * Math.PI * raio;
				
		}
		case "retangulo": {	
			double perimetro = 2 * (base * altura);
		}
		case "quadrado": {
			double lado = 0;
			double perimetro = 4 * lado;
		}
		
		default:
			throw new IllegalArgumentException("figura não encontrada: " + figura);
		}
	
	}

}
