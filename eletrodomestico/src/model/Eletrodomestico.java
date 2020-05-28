package model;

public class Eletrodomestico {
	private String tipo;
	private String tamanho;
	private String cor;
	private String voltagem;
	private double altura;
	private double largura;
	private double comprimento;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	
	public void ligar() {
		System.out.println("O eletrodoméstico " + this.tipo + " foi ligado");
	}
	
	public void desligar() {
		System.out.println("O eletrodoméstico " + this.tipo + " foi desligado");
	}
}
