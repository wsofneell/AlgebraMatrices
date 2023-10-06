import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        int opc = 0;
        int tamaño, CantFilas, CantColumnas;

        do {
            System.out.println("Menu de opciones: ");
            System.out.println("1. Verificar si 2 matrices son iguales o no");
            System.out.println("2. Sumar 2 matrices");
            System.out.println("3. Generar una matriz 0 de n x m");
            System.out.println("4. Obtener el inverso aditivo de una matriz de n x m");
            System.out.println("5. Restar 2 matrices");
            System.out.println("6. Multiplicar un escalar por una matriz de n x m");
            System.out.println("7. Multiplicar 2 matrices compatibles");
            System.out.println("8. Obtener una matriz identidad de tamano n");
            System.out.println("9. Obtener la inversa de una matriz de tamano  n");
            System.out.println("10. Obtener el determinante de una matriz de tamano n");
            System.out.println("11. Salir de la App");
            opc = lector.nextInt();
        } while (opc > 0 || opc <= 11);

        switch (opc) { 
            case 1:
                System.out.println("1. Verificar si 2 matrices son iguales o no");
                System.out.println("Cantidad de filas: ");
                CantFilas = lector.nextInt();
                System.out.println("Cantidad de columnas: ");
                CantColumnas = lector.nextInt();

                int matrizA[][] = new int[CantFilas][CantColumnas];
                System.out.println("Ingrese los elementos de la matriz A: ");
                for (int i = 0; i < matrizA.length; i++) { 
                    for (int j = 0; j < matrizA[i].length; j++) {  
                    System.out.print("Elemento [" + i + "," + j + "] = ");
                        matrizA[i][j] = lector.nextInt();        
                    }           
                }
                int matrizB[][] = new int[CantFilas][CantColumnas];
                System.out.println("Ingrese los elementos de la matriz B: ");
                for (int i = 0; i < matrizB.length; i++) { 
                    for (int j = 0; j < matrizB[i].length; j++) {  
                    System.out.print("Elemento [" + i + "," + j + "] = ");
                        matrizB[i][j] = lector.nextInt();        
                    }           
                }
                    boolean iguales = true;
                    for (int i = 0; i < CantFilas; i++) {
                        for (int j = 0; j < CantColumnas; j++) {
                            if (matrizA[i][j] != matrizB[i][j]) {
                                iguales = false;
                                break;  
                            }
                        }
                        if (!iguales) {
                            break;  
                        }
                    }
                    if (iguales) {
                        System.out.println("Las matrices son iguales.");
                    } else {
                        System.out.println("Las matrices son distintas.");
                    }
                break;

            case 2:
                System.out.println("2. Sumar 2 matrices");
                System.out.println("Cantidad de filas");
                CantFilas = lector.nextInt();
                System.out.println("Cantidad de columnas");
                CantColumnas = lector.nextInt();

                int matriz1S[][] = new int [CantFilas][CantColumnas];
                int matriz2S[][] = new int[CantFilas][CantColumnas];
                int sumaMatrices[][] = new int[CantFilas][CantColumnas];
                    
                System.out.println("Elementos de la matriz A");
                for(int i = 0; i<CantFilas;i++){
                    for(int j = 0; j<CantColumnas;j++){
                        System.out.print("Elemento"+(i+1)+(j+1)+" = ");
                        matriz1S[i][j] = lector.nextInt();
                    }
                    System.out.println("\n");
                }

                System.out.println("Elementos de la matriz B");
                for(int i = 0; i<CantFilas;i++){
                    for(int j = 0; j<CantColumnas;j++){
                        System.out.print("Elemento"+(i+1)+(j+1)+" = ");
                        matriz2S[i][j] = sc.nextInt();
                    }
                    System.out.println("\n");
                }

                if (matriz1S.length != matriz2S.length || matriz1S[0].length != matriz2S[0].length) {
                System.out.println("Las matrices no tienen las mismas dimensiones. No se pueden sumar.");
                } else {
                for (int i = 0; i < CantFilas; i++) {
                    for (int j = 0; j < CantColumnas; j++) {
                    sumaMatrices[i][j] = matriz1S[i][j] + matriz2S[i][j];
                    }
                }

                System.out.println("Elementos de la matriz Suma");
                for (int i = 0; i < CantFilas; i++) {
                    for (int j = 0; j < CantColumnas; j++) {
                    System.out.print(sumaMatrices[i][j] + "\t");
                    }
                    System.out.println("\n");
                    }   
                }
                break;

            case 3:
                System.out.println("3. Generar una matriz 0 de n x m");
                System.out.println("Cantidad de filas: ");
                CantFilas = lector.nextInt();
                System.out.println("Cantidad de columnas: ");
                CantColumnas = lector.nextInt();

                int matrizG[][] = new int[CantFilas][CantColumnas];
                System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < matrizG.length; i++) { 
                    for (int j = 0; j < matrizG[i].length; j++) {  
                    System.out.print("Matriz [" + i + "," + j + "] = ");
                        matrizG[i][j] = 0;        
                    }           
                }
                System.out.println("Matriz " + CantFilas + " * " + CantColumnas + ":");
                for (int i = 0; i < CantFilas; i++) {
                    for (int j = 0; j < CantColumnas; j++) {
                        System.out.print(matrizG[i][j] + " ");
                    }
                    System.out.println(); 
                }
                break;

            case 4:
                System.out.println("4. Obtener el inverso aditivo de una matriz de n x m");
                System.out.println("Cantidad de filas: ");
                CantFilas = lector.nextInt();
                System.out.println("Cantidad de columnas: ");
                CantColumnas = lector.nextInt();

                if (cantFilas <= 0 || CantColumnas <= 0) {
                    System.out.println("Las dimensiones de la matriz deben ser mayores que cero.");
                } else {
                    int matrizInvAd[][]  = new int[CantFilas][CantColumnas];
                    System.out.println("Ingrese los elementos de la matriz A: ");
                    for (int i = 0; i < matrizInv.length; i++) { 
                        for (int j = 0; j < matrizInvAd[i].length; j++) {  
                        System.out.print("Elemento [" + i + "," + j + "] = ");
                            matrizInvAd[i][j] = lector.nextInt();        
                        }           
                    }
                    for (int i = 0; i < CantFilas; i++) {
                        for (int j = 0; j < CantColumnas; j++) {
                            matrizInvA[i][j] = matrizInvAd[i][j] * -1; 
                        }
                    }
                    System.out.println("Matriz del inverso aditivo:");
                    for (int i = 0; i < CantFilas; i++) {
                        for (int j = 0; j < CantColumnas; j++) {
                            System.out.print(matrizInvAd[i][j] + "\t");
                        }
                        System.out.println();  
                    }
                }
                break;

            case 5:
                System.out.println("5. Restar 2 matrices");
                System.out.println("Cantidad de filas");
                CantFilas = lector.nextInt();
                System.out.println("Cantidad de columnas");
                CantColumnas = lector.nextInt();

                int matriz1R[][] = new int[CantFilas][CantColumnas];
                int matriz2R[][] = new int[CantFilas][CantColumnas];
                int restaMatrices[][] = new int[CantFilas][CantColumnas];
                    
                System.out.println("Elementos de la matriz A");
                for(int i = 0; i < CantFilas; i++){
                    for(int j = 0; j < CantColumnas; j++){
                        System.out.print("Elemento" + (i+1) + (j+1) + " = ");
                        matriz1R[i][j] = lector.nextInt();
                    }
                    System.out.println("\n");
                }

                System.out.println("Elementos de la matriz B");
                for(int i = 0; i < CantFilas; i++){
                    for(int j = 0; j < CantColumnas; j++){
                        System.out.print("Elemento" + (i+1) + (j+1) + " = ");
                        matriz2R[i][j] = sc.nextInt();
                    }
                    System.out.println("\n");
                }
                
                if (matriz1S.length != matriz2S.length || matriz1S[0].length != matriz2S[0].length) {
                System.out.println("Las matrices no tienen las mismas dimensiones. No se pueden restar.");
                } else {
                for (int i = 0; i < CantFilas; i++) {
                    for (int j = 0; j < CantColumnas; j++) {
                    restaMatrices[i][j] = matriz1R[i][j] - matriz2R[i][j];
                    }
                }

                System.out.println("Elementos de la matriz Resta");
                for (int i = 0; i < CantFilas; i++) {
                    for (int j = 0; j < CantColumnas; j++) {
                        System.out.print(restaMatrices[i][j] +"\t");
                    }
                    System.out.println("\n");
                    }
                }
                break;

            case 6:
                System.out.println("6. Multiplicar un escalar por una matriz de n x m");
                System.out.println("Introduzca el escalar");
                int escalar = lector.nextDouble();
                System.out.println("Cantidad de filas");
                CantFilas = lector.nextInt();
                System.out.println("Cantidad de columnas");
                CantColumnas = lector.nextInt();

                int matrizEsc[][] = new int[CantFilas][CantColumnas];
                for (int i = 0; i < CantFilas; i ++) {
                    for (int j = 0; j < CantColumnas; j++) {
                        matrizEsc[i][j] = lector.nextInt();
                    }
                }
                int matrizMultiplicada[][] = new int [CantFilas][CantColumnas];
                 for (int i = 0; i < CantFilas; i++) {
                    for (int j = 0; j < CantColumnas; j++) {
                            matrizMultiplicada[i][j] = escalar * matrizEsc[i][j];
                    }
                }
                System.out.println("La matriz multiplicada es: ");

                for (int i = 0; i < CantFilas; i++) {
                    for (int j = 0; j < CantColumnas; j++) {
                        System.out.println(matrizMultiplicada[i][j]);
                    }
                    
                }
                System.out.println();
                break;

            case 7:
                System.out.println("7. Multiplicar 2 matrices compatibles");
                System.out.println("Cantidad de filas de la primera matriz:");
                int CantFilas1 = lector.nextInt();
                System.out.println("Cantidad de columnas de la primera matriz:");
                int CantColumnas1 = lector.nextInt();

                int[][] matriz1M = new int[CantFilas1][CantColumnas1];
                for (int i = 0; i < CantFilas1; i++) {
                    for (int j = 0; j < CantColumnas1; j++) {
                        System.out.println("Elemento ( "+ (i + 1) +" , "+( j + 1) +" ) ");
                        matriz1M[i][j] = scanner.nextInt();
                    }
                }
                
                System.out.println("Cantidad de filas de la segunda matriz:");
                int CantFilas2 = lector.nextInt();
                System.out.println("Cantidad de columnas de la segunda matriz:");
                int CantColumnas2 = lector.nextInt();

                int[][] matriz2M = new int[CantFilas2][CantColumnas2];
                for (int i = 0; i < cantFilas2; i++) {
                    for (int j = 0; j < CantColumnas2; j++) {
                        System.out.println("Elemento ( "+ (i + 1) +" , "+( j + 1) +" ) ");
                        matriz2M[i][j] = scanner.nextInt();
                    }
                }

                if (CantColumnas1 != CantFilas2) {
                    System.out.println("Las matrices no son compatibles.");
                    return;
                }
        
                int[][] matriz3M = new int[CantFilas1][CantColumnas2];
                for (int i = 0; i < CantFilas1; i++) {
                    for (int j = 0; j < CantColumnas2; j++) {
                        for (int k = 0; k < CantColumnas1; k++) {
                            matriz3M[i][j] += matriz1M[i][k] * matriz2M[k][j];
                        }
                    }
                }
            
                System.out.println("Imprimiendo la matriz resultante");
                for(int i = 0; i < CantFilas1; i++){
                    for(int j = 0; i < CantColumnas2; j++){
                        System.out.print(matriz3M[i][j] + "\t");
                    }
                }
                System.out.println("");
                break;

            case 8:
                System.out.println("8. Obtener una matriz identidad de tamano n");
                System.out.pritnln("Digite el tamaño de la matriz cuadrada");
                int num = lector.nextInt(); 
                for(int i = 0; i < num; i++){
                    for(int j = 0; j<num; j++){
                        if(i == j){
                            System.out.print("1"+ "\t");
                        }else{
                            System.out.print("0" + "\t");
                        }
                        System.out.println("\n");
                    }
                }
                break;

            case 9:
                System.out.println("9. Obtener la inversa de una matriz de tamano  n");
                System.out.print("Ingrese el tamaño de la matriz cuadrada (n): ");
                int n = lector.nextInt();
                
                int[][] matriz = new int[n][n];
                System.out.println("Ingrese los elementos de la matriz:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                        matriz[i][j] = lector.nextInt();
                    }
                }

                int[][] matrizIdentidad = new int[n][n];
                for (int i = 0; i < n; i++) {
                    matrizIdentidad[i][i] = 1.0;
                }

                for (int columna = 0; columna < n; columna++) {
                    int pivote = matriz[columna][columna];

                    for (int j = 0; j < n; j++) {
                        matriz[columna][j] /= pivote;
                        matrizIdentidad[columna][j] /= pivote;
                    }

                    for (int i = 0; i < n; i++) {
                        if (i != columna) {
                            int factor = matriz[i][columna];
                            for (int j = 0; j < n; j++) {
                                matriz[i][j] -= factor * matriz[columna][j];
                                matrizIdentidad[i][j] -= factor * matrizIdentidad[columna][j];
                            }
                        }
                    }
                }

                System.out.println("\n Matriz Inversa:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(matrizIdentidad[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;

            case 10:
                System.out.println("10. Obtener el determinante de una matriz de tamano n");
                System.out.println("Cantidad de filas");
                CantFilas = lector.nextInt();
                System.out.println("Cantidad de columnas");
                CantColumnas = lector.nextInt();
                int matrizN[][] = new int[CantFilas][CantColumnas];
                for(int i = 0; i < CantFilas; i++){
                    for(int j = 0; j < CantColumnas; j++){
                        System.out.print("Elemento" + (i+1) + (j+1) + " = ");
                        matrizN[i][j] = lector.nextInt();
                    }
                    System.out.println("\n");
                }
                int determinante = 0;
                for (int i = 0; i < n; i++) {
                    determinante += matrizN[0][i] * cofactor(matrizN, 0, i);
                }
                System.out.println(determinante);

                break;
            case 11:
                System.out.println("11. Salir de la App");
                System.out.println("Saliendo de la App");
                
            default:
                System.out.println("Opcion incorrecta");
                break;
        } //Switc

        boolean rep = true;
        System.out.print("Desea volver a utlizar la calculadora de Matrices? (S/N): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                rep = false;
        lector.close();
        }
    
    } // Main
} //Class
