package main;

import model.Eletrodomestico;

public class main {

	public static void main(String[] args) {
		
		Eletrodomestico eletrodomestico = new Eletrodomestico();
		
		eletrodomestico.setTipo("geladeira");
		eletrodomestico.setVoltagem("bivolt");
		eletrodomestico.setAltura(1.62 );
		eletrodomestico.setComprimento(61.30);
		eletrodomestico.setLargura(54.80);
		
		eletrodomestico.ligar();
		eletrodomestico.desligar();
		

	}

}