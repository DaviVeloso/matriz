package Aplication;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("digite o tamanho que deseja para a matriz: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for(int i = 0; i < matriz.length; i++){
            for( int j = 0; i < matriz.length; i++){
                System.out.println("digite um numero: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Minha diagonal: ");
        for(int i = 0; i < matriz.length; i++){
            System.out.println(matriz[i][i]);
        }

        int count = 0;

        for(int i = 0; i < matriz.length; i++){
            for( int j = 0; i < matriz.length; i++){
                if(matriz[i][j] < count){
                    count ++;
                }
            }
        }
        System.out.println("Numeros negativos: "+ count);

















    }
}
