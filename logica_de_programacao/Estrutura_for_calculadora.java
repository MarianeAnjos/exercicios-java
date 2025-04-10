package logica_de_programacao;

import java.util.Scanner;

public class Estrutura_for_calculadora {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System. in);
        int N = sc. nextInt();
        //   inicio | condicao | incremento
        for (int i = 1; i <= 10; i++) {
            int produto = N
                    * i;
            System.out.println(i +"x" + N+"= " + produto) ;
            sc. close();
        }
    }
}