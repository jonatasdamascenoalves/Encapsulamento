package model;

public class Aeronave {
		
		private int capacidade;
		private String modelo;
		private double comprimento;
		private double velocidadeMaxima;
		
		
		public int getCapacidade() {
			return capacidade;
		}
		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public double getComprimento() {
			return comprimento;
		}
		public void setComprimento(double comprimento) {
			this.comprimento = comprimento;
		}
		public double getVelocidadeMaxima() {
			return velocidadeMaxima;
		}
		public void setVelocidadeMaxima(double velocidadeMaxima) {
			this.velocidadeMaxima = velocidadeMaxima;
		}
		
		
		public void decolar() {
			System.out.println("A aeronave " + this.modelo + " acabou de decolar");
		}
		
		public void pousar() {
			System.out.println("A aeronave " + this.modelo + " acabou de pousar");
		}
		
		
	}
