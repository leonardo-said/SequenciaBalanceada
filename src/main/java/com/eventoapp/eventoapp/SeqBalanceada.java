package com.eventoapp.eventoapp;

import java.util.Stack;


public class SeqBalanceada {

	// Esse método conta o número mínimo de inversões das chaves 
	// para tornar a sequência estável.
	// Se o número de elementos da sequência for ímpar, a função retorna -1,
	// para indicar que a sequência não pode ser balanceada. 
    static int contaMinInversoes(String expressao) 
    { 
        int len = expressao.length(); 
      
        // o comprimento da sequência deve ser par para ser possível
        // torná-la balanceada através do uso de inversÃµes das chaves.
        if (len%2 != 0) 
        return -1; // retorna -1, para indicar que a sequência não pode ser balanceada.
      
        
        // Depois desse loop, usamos uma pilha que contém a parte não balanceada da sequência
        // isto é, uma expressÃ£o da forma "}}..}{{..{".
        // Sendo m o número total de "}" e n o número total de "{" após a remoção da parte já balanceada,
        // nós precisaremos de um número mínimo de ceil(m/2) + ceil(n/2) inversões para tornar a sequência inicial balanceada
        Stack<Character> pilha = new Stack<>(); 
          
        for (int i=0; i<len; i++) 
        { 
            char c = expressao.charAt(i); 
            if (c =='}' && !pilha.empty()) 
            { 
                if (pilha.peek()=='{') 
                    pilha.pop(); 
                else
                    pilha.push(c); 
            } 
            else
                pilha.push(c); 
        } 
      
        // Comprimento da sequência reduzida
        // red_len = (m+n) 
        int red_len = pilha.size(); 
      
        // aqui, conta-se a quantidade de chaves de abertura "{"
        // ao final da pilha        
        int n = 0; 
        while (!pilha.empty() && pilha.peek() == '{') 
        { 
            pilha.pop(); 
            n++; 
        } 
      
        // retorna ceil(m/2) + ceil(n/2)
        // que é na verdade igual a (m+n)/2 + n%2 quando
        // m+n é par.
        return (red_len/2 + n%2); 
    } 
	
	
}
