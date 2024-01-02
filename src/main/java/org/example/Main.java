
package org.example;

public class Main {
    public static void main(String[] args) {
        creaArray(10);

        }
        public static void creaArray ( int dimensione){
            int[] array = new int[dimensione];
            int somma = 0;
            for (int i = 0; i < dimensione; i++) {
                array[i] = i+1;
                somma = somma + array[i];
            }
            System.out.println("La somma degli elementi dell'array è: " + somma);
        }
    }


