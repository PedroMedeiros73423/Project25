package com.mycompany.project25;

public class Project25 {

    public static void main(String[] args) {
        int qtd = 20;
        int vetor[] = new int[qtd];
        for(int i = 0; i < qtd; i++){
            System.out.println("Digite o número: " + i);
        }
        int soma = 0;
        for(int i = 0; i < qtd; i++){
            soma = soma + i;
        }
        int media = soma / qtd;
        System.out.println("A soma é: " + soma + "\n A média é: " + media);
        
    }
}
