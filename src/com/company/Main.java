package com.company;

public class Main {

    public static void main(String[] args) {
        int[] matrix = {9, 6, 5, 4, 2, 1};

        // messy
        System.out.println("messy:");
        for (int i = 0; i < matrix.length - 1; i++) {
            System.out.print(matrix[i] + " ");
        }

        long startTime = System.nanoTime();
        bubbleSort(matrix);
        long endTime = System.nanoTime();

        //organized out
        System.out.println("\norganized:");
        for (int i = 0; i < matrix.length - 1; i++) {
            System.out.print(matrix[i] + " ");
        }

        // time execution
        System.out.println("\nTime execution: " + (endTime - startTime) + " milliseconds");
    }


    public static void bubbleSort(int[] matrix) {
        int temp;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int x = 0; x < matrix.length - 1; x++) {
                if (matrix[x] > matrix[x + 1]) {
                    temp = matrix[x];
                    matrix[x] = matrix[x + 1];
                    matrix[x + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            int aux = vector[i];
            int j;
            for (j = i - 1; j >= 0 && vector[j] > aux; j--) {
                vector[j + 1] = vector[j];
            }
            vector[j + 1] = aux;
        }
    }


}
