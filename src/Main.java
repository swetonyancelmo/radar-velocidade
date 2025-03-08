import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá Guarda de Trânsito!");

        System.out.println("Digite abaixo se o radar está numa Via Urbana ou Rodovia:");
        String viasTerrestres;
        do {
            viasTerrestres = scanner.nextLine();
            if (!viasTerrestres.equalsIgnoreCase("Via Urbana") && !viasTerrestres.equalsIgnoreCase("Rodovia")) {
                System.out.println("Opção inválida! Por favor, digite 'Via Urbana' ou 'Rodovia'.\n");
            }
        } while (!viasTerrestres.equalsIgnoreCase("Via Urbana") && !viasTerrestres.equalsIgnoreCase("Rodovia"));


        System.out.println("Digite abaixo em quantos KM o veículo passou no seu radar: ");
        int velocidade = scanner.nextInt();

        if (viasTerrestres.equals("Via Urbana")  && velocidade > 80) {
            System.out.println("Veículo em questão está com velocidade acima do permitido para Via Urbana! Deve-se " +
                    "aplicar multa.");
        } else if (viasTerrestres.equals("Via Urbana") && velocidade <= 80) {
            System.out.println("Veículo dentro do limite para Vias Urbanas.");
        } else if(viasTerrestres.equals("Rodovia") && velocidade > 100){
            System.out.println("Veículo em questão está com velocidade acima do permitido para Rodovia! Deve-se " +
                    "aplicar multa.");
        } else if (viasTerrestres.equals("Rodovia") && velocidade <= 100) {
            System.out.println("Veículo dentro do limite para Rodovia.");
        }

        scanner.close();
    }
}