// Sistema de notas bimestrais desenvolvido em Java.
// O programa recebe quatro notas de 0 a 25, valida os valores,
// calcula a nota final e informa se o aluno foi aprovado,
// ficou de recuperação ou foi reprovado.
// by João Victor Barbosa

import java.util.Scanner;

public class SistemaBimestre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a primeira nota do bimestre (0 a 25)");
        double numero1 = sc.nextDouble();
        while (numero1 > 25 || numero1 < 0) {
            System.out.println("Nota inválida! Digite um valor entre 0 e 25");
            numero1 = sc.nextDouble();
        }

        System.out.println("Escreva a segunda nota do bimestre (0 a 25)");
        double numero2 = sc.nextDouble();
        while (numero2 > 25 || numero2 < 0) {
            System.out.println("Nota inválida! Digite um valor entre 0 e 25");
            numero2 = sc.nextDouble();
        }

        System.out.println("Escreva a terceira nota do bimestre (0 a 25)");
        double numero3 = sc.nextDouble();
        while (numero3 > 25 || numero3 < 0) {
            System.out.println("Nota inválida! Digite um valor entre 0 e 25");
            numero3 = sc.nextDouble();
        }

        System.out.println("Escreva a quarta nota do bimestre (0 a 25)");
        double numero4 = sc.nextDouble();
        while (numero4 > 25 || numero4 < 0) {
            System.out.println("Nota inválida! Digite um valor entre 0 e 25");
            numero4 = sc.nextDouble();
        }

        double nota = numero1 + numero2 + numero3 + numero4;
        System.out.println("A nota final do aluno é igual a: " + nota);

        if (nota >= 60) {
            System.out.println("Você passou de ano");
        } else if (nota >= 50) {
            System.out.println("Você ficou de reprovação final de ano");
        } else {
            System.out.println("Você reprovou de ano");
        }
    }
}
