/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicaciondeconversionmonedas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class clsprincipal {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        Scanner entradaNombre = new Scanner(System.in);
        Scanner cantidadDinero = new Scanner(System.in);
        
        String nombreUsuario = new String ("");
        int numeroOpcion = 0;
        float cantidadDineroVariable = 0;
        float dolarConvertir = (float) 0.13;
        float monedaEuro = (float) 0.11;
        float yuanConvertir = (float) 0.84;
        boolean elegir = false;
        
        System.out.println("Bienvenido a la aplicacion.");
        System.out.println("Introduzca su nombre porfavor: ");
        nombreUsuario = entradaNombre.nextLine();
        System.out.println("Ok, que quieres hacer acontinuacion "+nombreUsuario+"??");
        System.out.println("A que moneda quieres convertir tus quetzales?\n");
        
        do {
            
            System.out.println("1. Convertir a Dolares.");
            System.out.println("2. Convertir a Euros");
            System.out.println("3. Convertir a Yuanes.");
            System.out.println("4. salir/cerrar.");
            
            try {

                System.out.println("Elige una opcion porfavor: ");
                numeroOpcion = sn.nextInt();

                switch (numeroOpcion) {
                    case 1:
                        
                        System.out.println("Muy bien "+ nombreUsuario + " aqui vas a convertir a dolares");
                        System.out.println("Introduce la cantidad de Quetzales a convertir: ");
                        cantidadDineroVariable = cantidadDinero.nextFloat();
                        cantidadDineroVariable = cantidadDineroVariable*dolarConvertir;
                        System.out.println("El resultado es: "+cantidadDineroVariable+" Dolares");
                        System.out.println("Que quieres hacer acontinuacion "+nombreUsuario+"??\n");
                        
                        break;
                    case 2:
                        System.out.println("Muy bien "+nombreUsuario+" aqui vas a convertir a Euros");
                        System.out.println("Introduce la cantidad de Quetzales a convertir: ");
                        cantidadDineroVariable = cantidadDinero.nextFloat();
                        cantidadDineroVariable = cantidadDineroVariable*monedaEuro;
                        System.out.println("El resultado es: "+cantidadDineroVariable+" Euros");
                        System.out.println("Que quieres hacer acontinuacion "+nombreUsuario+"??\n");
                        
                        break;
                    case 3:
                        System.out.println("Muy bien "+nombreUsuario+" aqui vas a convertir a yuanes");
                        System.out.println("Introduce la cantidad de Quetzales a convertir: ");
                        cantidadDineroVariable = cantidadDinero.nextFloat();
                        cantidadDineroVariable = cantidadDineroVariable*yuanConvertir;
                        System.out.println("El resultado es: "+cantidadDineroVariable+" Yuanes");
                        System.out.println("Que quieres hacer acontinuacion "+nombreUsuario+"??\n");
                        
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Esa opcion no esta disponible, vuelve a intentar");

                }
            } catch (InputMismatchException esepcion) {
                System.out.println("Solo debes introducir un numero");
                sn.next();
            }
            
            
        }while(elegir = true);
        
    }

}
