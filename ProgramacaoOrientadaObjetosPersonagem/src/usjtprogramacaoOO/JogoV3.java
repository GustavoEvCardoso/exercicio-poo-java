package usjtprogramacaoOO;

import java.util.Random;

public class JogoV3 {
				
	public static void main(String[] args) throws InterruptedException { //joga para outro quando der problema
		Random random = new Random();
		Personagem cacador = new Personagem();
		Personagem lenhador = new Personagem("Joao",5,5,5);
		Personagem pescador = new Personagem ("Pedro",5,5,5);

		
		while(true) {
			switch(random.nextInt(3)) { //vai sortear um numero ate 2, cada numero sorteado ele vai fazer algo que esta
										//nos cases
			case 0:
				cacador.cacar();
				lenhador.dormir();
				lenhador.cacar();
				break;	
				
			case 1:
				
				cacador.dormir();
				lenhador.dormir();
				pescador.dormir();
				break;
			
			case 2:
				
				cacador.comer();
				lenhador.dormir();
				pescador.comer();
				break;
				
			}
			
			System.out.println(cacador.informacoes());
			System.out.println("--------------------/n");
			System.out.println(lenhador.informacoes());
			System.out.println("--------------------/n");
			System.out.println(pescador.informacoes());
			Thread.sleep(2000);// serve para nao ir muito rapido na hora de exibir o system.out no console
		}
	}
}
