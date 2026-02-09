public class Exercicio2 {
    public static void main(String[] args) {
        int nivelTanque = 95; //simulação de valor recebido do sensor

        if (nivelTanque >= 90) {
            System.out.println("ALERTA: Nível Crítico - Abrir Válvula de Escoamento!");
        } else if (nivelTanque < 10) {
            System.out.println("ALERTA: Nível Baixo - Ativar Bomba de Enchimento!");
        } else {
            System.out.println("Sistema Estável");
        }
    }
}