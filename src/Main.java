import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double capitalInvestido;
        double taxaDeJurosAnual;
        int periodoDeInvestimetoEmAnos;
        double montante;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor investido: ");
        capitalInvestido = scanner.nextDouble();

        System.out.print("Digite a taxa de juros anual em porcentagem: ");
        taxaDeJurosAnual = scanner.nextDouble();

        System.out.print("Digite o período em anos que o capital ficará aplicado ou sob empréstimo: ");
        periodoDeInvestimetoEmAnos = scanner.nextInt();

        montante = capitalInvestido * Math.pow((1 + (taxaDeJurosAnual/100)), periodoDeInvestimetoEmAnos);

        System.out.printf("\n O montante depois de %d ano(s) de investimento(s) é de R$ %.2f \n", periodoDeInvestimetoEmAnos, montante);

        scanner.close();
    }
}