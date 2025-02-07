import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean sucesso = false;
        do {
            try {
                System.out.print("Digite o primeiro parâmetro: ");
                int parametroUm = terminal.nextInt();
                System.out.println(" ");
                System.out.print("Digite o segundo parâmetro: ");
                int parametroDois = terminal.nextInt();
                System.out.println(" ");
                //chamando o metodo contendo a lógica de contagem
                contar(parametroUm, parametroDois);
                sucesso = true;
            }catch (ParametrosInvalidosException e) {
                System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro.");
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida! Certifique-se de digitar números inteiros.");
                terminal.nextLine(); // Limpa o buffer do scanner para evitar loop infinito
            }
        }while(!sucesso);
    }
    public static class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException() {
            super("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm>=parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for(int i=1;i<=contagem;i++){
            System.out.printf("Imprimindo o numero %d\n",i);
        }
    }
    }