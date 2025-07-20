import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Sistema de Venda de Ingressos de Cinema ---");

        try {
            System.out.println("\nEscolha o tipo de ingresso que deseja comprar:");
            System.out.println("1 - Ingresso Comum");
            System.out.println("2: Meia-Entrada");
            System.out.println("3 - Ingresso Família");
            System.out.println("Sua opção: ");
            int tipoIngresso = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o nome do filme: ");
            String nomeFilme = scanner.nextLine();

            System.out.print("Digite o preço por ingresso sem descontos (ex: 30,50): ");
            double precoBase = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("É legendado? (S/N)");
            boolean isLegendado = scanner.nextLine().equalsIgnoreCase("S");

            System.out.print("Quantos ingressos você deseja? ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            Tickets ingressoComprado = null;

            switch (tipoIngresso) {
                case 1:
                    ingressoComprado = new Tickets(precoBase, nomeFilme, isLegendado, quantidade);
                    break;
                case 2:
                    ingressoComprado = new HalfEntry(precoBase, nomeFilme, isLegendado, quantidade);
                    break;
                case 3:
                    ingressoComprado = new FamilyEntry(precoBase, nomeFilme, isLegendado, quantidade);
                    break;
                default:
                    System.out.println("Opção de ingresso inválida. O programa será encerrado.");
                    break;
            }

            if (ingressoComprado != null) {
                System.out.println("\n===============================");
                System.out.println("    RESUMO DA COMPRA");
                System.out.println("===============================");
                System.out.println("Filme: " + ingressoComprado.getMovieName());

                String tipoDescricao = "Comum";
                if (ingressoComprado instanceof HalfEntry) {
                    tipoDescricao = "Meia-Entrada";
                } else if (ingressoComprado instanceof FamilyEntry) {
                    tipoDescricao = "Família";
                    if (ingressoComprado.getNumberOfTickets() > 3) {
                        tipoDescricao += " (com 5% de desconto)";
                    }
                }

                System.out.println("Tipo de Ingresso: " + tipoDescricao);
                System.out.println("Quantidade: " + ingressoComprado.getNumberOfTickets());
                System.out.printf("VALOR TOTAL: R$ %.2f\n", ingressoComprado.getTotalPrice());
                System.out.println("===============================");
            }
        } catch (InputMismatchException e) {
            System.out.println("\nErro: Entrada inválida. Por favor, digite os números corretamente.");
        } finally {
            scanner.close();
        }
    }
}
