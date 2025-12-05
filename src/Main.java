import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Declaracao das variaveis
        *   double item1 = 239.99;
        *   double item2 = 129.75;
        *   double item3 = 99.95;
        *   double item4 = 350.89;
        *   double comissao = 0;
        *
        * Criacao do objeto input
        * exibe uma mensagem solicitando o item vendido
        * armazena o valor em uma variavel item
        *
        * Enquanto item for diferente de -1
        *   puxa o valor do item, armazena e soma a comissao
        *   exibe a mesma mensagem
        *
        * Calcula a comissao = R$ 200,00 + 9% da variavel
        * Exibe o valor da comissao
        * */
        // Variaveis
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        double comissao = 0;
        double vendas = 0;

        Scanner input = new Scanner(System.in); // Objeto input

        System.out.print("Informe o item vendido {1, 2, 3 ou 4} ou digite -1 para sair: ");
        int item = input.nextInt();

        while (item != -1) {
            switch (item)
            {
                case 1: vendas += item1; break;
                case 2: vendas += item2; break;
                case 3: vendas += item3; break;
                case 4: vendas += item4; break;
            }

            System.out.println("Item registrado a comissao!");
            System.out.print("Informe outro item vendido {1, 2, 3 ou 4} ou digite -1 para sair: ");
            item = input.nextInt();
        }

        comissao = 200 + 0.09*vendas;
        System.out.printf("Valor da comissao: R$ %.2f", comissao);
    }
}