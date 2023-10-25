import java.util.Scanner;

public class MulMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las dimensiones de la matriz A
        System.out.println("Ingrese las dimensiones de la matriz A:");
        System.out.print("Número de filas: ");
        int r1 = scanner.nextInt();
        System.out.print("Número de columnas: ");
        int c1 = scanner.nextInt();

        // Solicitar las dimensiones de la matriz B
        System.out.println("Ingrese las dimensiones de la matriz B:");
        System.out.print("Número de filas: ");
        int r2 = scanner.nextInt();
        System.out.print("Número de columnas: ");
        int c2 = scanner.nextInt();

        // Verificar si las matrices se pueden multiplicar
        if (c1 != r2) {
            System.out.println("No se pueden multiplicar las matrices porque c1 no es igual a r2.");
        } else {
            // Declarar las matrices A, B y C
            int[][] A = new int[r1][c1];
            int[][] B = new int[r2][c2];
            int[][] C = new int[r1][c2];

            // Solicitar los valores de la matriz A
            System.out.println("Ingrese los valores de la matriz A:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print("A[" + i + "][" + j + "]: ");
                    A[i][j] = scanner.nextInt();
                }
            }

            // Solicitar los valores de la matriz B
            System.out.println("Ingrese los valores de la matriz B:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print("B[" + i + "][" + j + "]: ");
                    B[i][j] = scanner.nextInt();
                }
            }

            // Realizar la multiplicación de matrices
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Imprimir las matrices A, B y el resultado C
            System.out.println("Matriz A:");
            imprimirMatriz(A);
            System.out.println("Matriz B:");
            imprimirMatriz(B);
            System.out.println("Matriz C (Resultado de la multiplicación de A * B):");
            imprimirMatriz(C);
        }

        scanner.close();
    }

    // Método para imprimir una matriz con formato
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
