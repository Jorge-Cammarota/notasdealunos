package BoletimEscolar;

import java.util.Scanner;

public class MediaDeNotas {

    public static void main(String[] args) {
        float nota; //vai armazenar a nota
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua nota [0.0 - 10.0]: ");
        nota = entrada.nextFloat();

        if ((nota <= 10.0) && (nota >= 0.0)) {

            if (nota >= 7.0) {
                System.out.println("Parabéns, você passou direto");
            } else {

                if (nota >= 5.0) {
                    System.out.println("Vai ter que fazer recuperação");
                } else {
                    System.out.println("Reprovado");
                }
            }

        } else {
            System.out.println("Nota inválida, fechando aplicativo");
        }


    }
}

