package main;

import model.Aeronave;

public class main {

	public static void main(String[] args) {
		Aeronave aviao = new Aeronave();
		
		aviao.setModelo("Boeing XB-15");
		aviao.setCapacidade( 400);
		aviao.setComprimento(26);
		aviao.setVelocidadeMaxima(850);
		
		aviao.decolar();
		aviao.pousar();
	}
	
}
