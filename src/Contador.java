
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Para encerrar o programa digite 0 no campo do Primeiro parâmetro");
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        
        if (parametroUm == 0) {
            System.out.println("Programa finalizado com sucesso!");
            System.exit(0);
        }
        do {
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }

            System.out.println("Para encerrar o programa digite 0 no campo do Primeiro parâmetro");
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();
        } while (parametroUm != 0);

        System.out.println("Programa finalizado com sucesso!");

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
