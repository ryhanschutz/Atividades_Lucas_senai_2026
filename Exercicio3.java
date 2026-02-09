import java.util.Scanner; //importando o scanner

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double somaProducao = 0.0;  //declarando variaveis

        System.out.println("=== Produção das 5 horas do turno ==="); //print pra deixar bonito

        for (int hora = 1; hora <= 5; hora++) {
            System.out.print("Peças produzidas na hora " + hora + ": ");
            double producaoHora = input.nextDouble(); 
            somaProducao += producaoHora;
        }

        double mediaHoraria = somaProducao / 5; //faz a media para entregar a saída

        System.out.println("\nSoma total de peças: " + somaProducao); //mostra o total de peças
        System.out.printf("Média horária: %.2f peças/hora%n", mediaHoraria); //mostra a média

        input.close();
    }
}