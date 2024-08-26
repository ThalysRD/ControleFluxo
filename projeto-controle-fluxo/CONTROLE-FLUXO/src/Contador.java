import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
       Scanner terminal = new Scanner(System.in);
       System.out.println("Digite o primeiro parâmetro");
       int primeiro = terminal.nextInt();
       System.out.println("Digite o segundo parâmetro");
       int segundo = terminal.nextInt();
       terminal.close();

       try {
        contar(primeiro, segundo);
       } catch (ParametrosInvalidosException e){
            System.out.println("O primeiro parâmetro é maior que o segundo");
       }

    }

    static void contar(int primeiro, int segundo)   throws ParametrosInvalidosException {
        if (primeiro > segundo) {
            throw new ParametrosInvalidosException();
        }

        int contagem = segundo - primeiro;
        for(int numero = 1; numero <= contagem; numero++){
            System.out.println("Imprimindo " + numero);
        }
    }
}
