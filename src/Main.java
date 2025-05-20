/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima?");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Esteve no local do crime?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Mora perto da vítima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Devia para a vítima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Já trabalhou com a vítima");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int contagem = 0;
        for (String resultado: respostas) {
            if (resultado.equalsIgnoreCase("sim")) {
                contagem++;
            }
        }

        System.out.println("Quantidade de respostas 'sim': " + contagem);
        System.out.println("\nPortando o réu é considerado: ");

        switch (contagem) {
            case 2:
                System.out.println("Suspeito.");
                break;
            case 3:
                System.out.println("Cumplice.");
                break;
            case 4:
                System.out.println("Cumplice.");
                break;
            case 5:
                System.out.println("Assassino!");
                break;
            default:
                System.out.println("Inocente.");
        }
    }
}
