/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exer_1 {
     public static void main(String[] args) {
        String[] nomes = new String[15];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 15 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("\nNomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
