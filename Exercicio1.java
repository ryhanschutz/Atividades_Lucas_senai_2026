import java.util.Scanner; //importando o scanner

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do sensor: ");
        String nomeSensor = input.nextLine();   //pede o nome do sensor

        System.out.print("Valor da leitura: ");
        double valorLeitura = input.nextDouble(); //pede o dado da leitura (exemplo: temperatura)

        System.out.println("Sensor " + nomeSensor + " registado com o valor " + valorLeitura + " unidades."); //resposta do sistema (output)

        input.close(); //encerramento do código
    }
}