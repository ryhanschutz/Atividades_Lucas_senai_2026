public class Exercicio4 {
    public static void main(String[] args) {
        int[] historico = {1, 0, 1, 1}; // 1 = em Operação, 0 = parada

        int contagemOperacao = 0; 

        for (int estado : historico) {
            if (estado == 1) { //if usado que caso o intervalo seja 1, ele adiciona uma unidade a variável
                contagemOperacao++; //adiciona 1 a variavel
            }
        }

        System.out.println("Histórico analisado: " + historico.length + " períodos"); //quantas vezes foi analisado
        System.out.println("A máquina esteve em operação " + contagemOperacao + " vezes."); //conta quantas vezes a maquina estava em operação
    }
} //schutzmeister