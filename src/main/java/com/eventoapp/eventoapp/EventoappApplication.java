package com.eventoapp.eventoapp;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoappApplication.class, args);
	
		ArrayList<String> listaSeq = new ArrayList();
		SeqBalanceada contaSeq = new SeqBalanceada();
	
		int n = listaSeq.size();
		int resultado = 0; // receberá o número mínimo de inversões para tornar a seq. balanceada
	    for (int i=0; i<n; i++) { // percorrerá a lista de strings com as sequências
	      resultado = contaSeq.contaMinInversoes(listaSeq.get(i));
	      System.out.print(resultado + " ");
	    }
	    System.out.println(" ");
	    
	}

}
