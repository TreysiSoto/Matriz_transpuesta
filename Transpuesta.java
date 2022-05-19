package Clase08;

import javax.swing.JOptionPane;

public class MatrizT {
    private int[][] matrizA;
    private int[][] matrizT;
    private int fila;
    private int columna;
    private int valores;

    MatrizT() {
        System.out.println( "MATRIZ CUDRADA");
        
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de filas"));
        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas"));
        this.matrizA = new int[fila][columna];
        this.matrizT = new int[fila][columna];

    }

    void agregarMatriz() {
        for (int fila = 0; fila < this.matrizA.length; fila++) {
            for (int columna = 0; columna < this.matrizA[fila].length; columna++) {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingresar valores para matriz A"));
                this.matrizA[fila][columna] = this.valores;
            }
        }

    }

    void mostrarMatriz() {
        for (int fila = 0; fila < this.matrizA.length; fila++) {
            for (int columna = 0; columna < this.matrizA[fila].length; columna++) {
                System.out.printf(" %d ", this.matrizA[fila][columna]);
            }
            System.out.println();
        }

    }

    void calcularMatrizT() {

        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int columna = 0; columna < matrizT[fila].length; columna++) {
                matrizT[columna][fila] = matrizA[fila][columna];
            }
        }
    }

    void mostrarMatrizT() {

        System.out.println("***TRANSPUESTA DE UNA MATRIZ CUADRADA***");

        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int columna = 0; columna < matrizT[fila].length; columna++) {
                System.out.printf("%d ", this.matrizT[fila][columna]);
            }
            System.out.println();
        }
    }
}
