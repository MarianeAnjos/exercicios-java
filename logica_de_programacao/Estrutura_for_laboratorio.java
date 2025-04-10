package logica_de_programacao;
import java.util.Scanner;

/*Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos.

Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada:
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir.
Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída:
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.*/

public class Estrutura_for_laboratorio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        for (int i = 0; i < N; i++) {
            int quantia = sc.nextInt();
            char tipo = sc.next().charAt(0);
            if (tipo == 'C') {
                totalCoelhos += quantia;
            } else if (tipo == 'R') {
                totalRatos += quantia;
            } else if (tipo == 'S') {
                totalSapos += quantia;
            }
        }

        int totalGeral = totalCoelhos + totalRatos + totalSapos;
        double percentCoelhos = (double) totalCoelhos / totalGeral * 100.0;
        double percentRatos = (double) totalRatos / totalGeral * 100.0;
        double percentSapos = (double) totalSapos / totalGeral * 100.0;

        System.out.printf("Total: %d cobaias%n", totalGeral);
        System.out.printf("Total de coelhos: %d%n", totalCoelhos);
        System.out.printf("Total de ratos: %d%n", totalRatos);
        System.out.printf("Total de sapos: %d%n", totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentSapos);

        sc.close();
    }
}
