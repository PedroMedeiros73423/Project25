public class Project25 {

    public static void main(String[] args) {
        int qtd = 20;
        int vetor[] = new int[qtd];
        for(int i = 0; i < qtd; i++){
            System.out.println("Digite o n�mero: " + i);
        }
        int soma = 0;
        for(int i = 0; i < qtd; i++){
            soma = soma + i;
        }
        int media = soma / qtd;
        System.out.println("A soma �: " + soma + "\n A m�dia �: " + media);
        
    }
}