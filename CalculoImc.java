

package com.mycompany.calculoimc;

import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        float peso;
        float altura;
        float imc;
        String nome;
        
        System.out.println("Digite seu nome");
        nome = Leitor.lerString();
        System.out.println("Digite seu peso");
        peso = Leitor.lerFloat();
        System.out.println("Digite sua altura");
        altura = Leitor.lerFloat();
        imc  = peso /(altura*altura);
        System.out.println(nome + " o seu imc e:" + imc);
        
         
                
        
        
    }
}

class Leitor {
    
    public static Scanner teclado = new Scanner(System.in);
    
     
    public static String lerString(){
      
      String leitura;
      leitura = teclado.nextLine();
      return leitura;
    }
    
    
    
    public static float lerFloat(){
      
      float leitura;
      leitura = teclado.nextFloat();
      return leitura;
    }
}
