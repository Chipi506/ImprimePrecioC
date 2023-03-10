package com.mycompany.imprimeprecioc;

import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner 
 * Este programa calcula e imprime la cantidad de una orden de compra.
 *
 */
public class ImprimePrecioC {
        Scanner entrada = new Scanner(System.in);
        static double precio; // precio de compra del artículo
        static int cant; // número de artículos comprados
        
        public void Precio(double precio , int cant){
            System.out.print("Precio de compra del artículo: ");
        precio = entrada.nextDouble();
        System.out.print("Cantidad: ");
        cant = entrada.nextInt();
        System.out.println("Total de orden de compra = $" + precio * cant);
        }
        
    public static void main(String[] args) {
        
    ImprimePrecioC imprimir=new ImprimePrecioC();
    imprimir.Precio(precio,cant);
        
    }

}

