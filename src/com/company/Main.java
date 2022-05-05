package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matriz 1");
        System.out.print("Ingrese la cantidad de filas: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int m = scanner.nextInt();

        int matriz1[][] = llenarMatriz(n,m);
        recorreMatriz(matriz1);

        System.out.println("Matriz 2");
        System.out.print("Ingrese la cantidad de filas: ");
        int n2 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int m2 = scanner.nextInt();

        int matriz2[][] = llenarMatriz(n2, m2);
        recorreMatriz(matriz2);

        System.out.println("Menu");
        System.out.println("1. Sumar matrices");
        System.out.println("2. Restar matrices");
        System.out.println("Selecciona la opcion deseada: ");

        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                suma(matriz1, matriz2);
                break;
            case 2:
                resta(matriz1, matriz2);
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

    }

    public static int[][] llenarMatriz(int n, int m){
        Scanner scanner = new Scanner(System.in);
        int mat[][] = new int[n][m];

        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j++){
                System.out.print("["+i+"] ["+j+ "] = ");
                mat[i][j] = scanner.nextInt();
            }
        }
        return mat;
    }

    public static void recorreMatriz(int mat[][]){

        for (int i = 0; i < mat.length; i++){

            for (int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void suma(int mat1[][], int mat2[][]){
        int m1F = mat1.length;
        int m1C = mat1[0].length;

        int m2F = mat2.length;
        int m2C = mat2[0].length;

        int sum[][] = new int[m1F][m1C];
        if(m1F == m2F && m1C == m2C){

            for (int i = 0; i < m1F; i++){
                for (int j = 0; j < m1C; j++){
                    sum[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            System.out.println();
            recorreMatriz(sum);

        }else {
            System.out.println("Las matrices deben tener las mismas dimenciones");
        }

    }

    public static void resta(int mat1[][], int mat2[][]){
        int m1F = mat1.length;
        int m1C = mat1[0].length;

        int m2F = mat2.length;
        int m2C = mat2[0].length;

        int resta[][] = new int[m1F][m1C];
        if(m1F == m2F && m1C == m2C){

            for (int i = 0; i < m1F; i++){
                for (int j = 0; j < m1C; j++){
                    resta[i][j] = mat1[i][j] - mat2[i][j];
                }
            }
            System.out.println();
            recorreMatriz(resta);

        }else {
            System.out.println("Las matrices deben tener las mismas dimenciones");
        }

    }

}
