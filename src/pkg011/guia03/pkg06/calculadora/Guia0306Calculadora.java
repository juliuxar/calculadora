/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg011.guia03.pkg06.calculadora;
import java.util.Scanner;

/**
 * 6.	Realizar un programa que pida dos números enteros positivos por 
 * teclado y muestre por pantalla el menú al pie del planteo. El usuario deberá
 * elegir una opción y el programa deberá mostrar el resultado por pantalla y 
 * luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
 * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en 
 * vez de salir del programa directamente, se debe mostrar el siguiente 
 * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
 * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
 * contrario se vuelve a mostrar el menú:
 * -----------
 * MENU
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * 5. Salir
 * Elija opcion:
 * -----------
 * @author RonDamon
 */
public class Guia0306Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iOpcion, iNum1, iNum2, iResultado;
        String sSale;
        Scanner teclado = new Scanner(System.in);
        
        iNum1 = 0;
        iNum2 = 0;
        iResultado = 0;
        
        // iOpcion = 0;
        sSale = "";
        
        do{
            do{
                System.out.println("+--------------------+");
                System.out.println("|      -=MENU=-      |");
                System.out.println("|    1. Sumar        |");
                System.out.println("|    2. Restar       |");
                System.out.println("|    3. Multiplicar  |");
                System.out.println("|    4. Dividir      |");
                System.out.println("|    5. Salir        |");
                System.out.println("| Elija opcion:      |");
                System.out.println("+--------------------+");
                
                iOpcion = teclado.nextInt();
                if (iOpcion > 0 && iOpcion < 5){

                    do {
                    System.out.println("Ingrese el 1er numero (entero positivo o no sale):");
                        iNum1 = teclado.nextInt();
                    } while(iNum1 < 1);
                    
                    
                    do {
                    System.out.println("Ingrese el 2do numero (entero positivo o no sale):");
                        iNum2 = teclado.nextInt();
                    } while(iNum2 < 1);

                
                    switch(iOpcion){
                        case 1:  // suma
                            iResultado = iNum1 + iNum2;
                            break;
                        case 2:  // resta
                            iResultado = iNum1 - iNum2;
                            break;
                        case 3:  // multiplicacion
                            iResultado = iNum1 * iNum2;
                            break;
                        case 4:  // division
                            iResultado = iNum1 / iNum2;
                    }

                    System.out.println("Resultado: " + iResultado);

                } else if (iOpcion==5){

                    System.out.println("¿Esta seguro? (S/N)");
                    // Debajo no se usa .nextLine porque solo se espera
                    // 1 palabra, por lo tanto se usa .next
                    sSale = teclado.next();   
                    
                } else {
                    System.out.println("Valor incorrecto");
                }
                
            } while(iOpcion!=5);

            
        } while(sSale.equals("S")==false);
     
        System.out.println("Programa terminado");
        teclado.close();  
    }
    
}
