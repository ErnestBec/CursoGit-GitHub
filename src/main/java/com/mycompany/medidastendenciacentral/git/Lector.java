/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medidastendenciacentral.git;

import java.util.Scanner;

/**
 *
 * @author Ernest
 */
public class Lector 
{
    Scanner sc = new Scanner(System.in);
    public int leerEntero(String mensaje)
    {
        
        int aux=0;
        while (true)
        {   
            
            try
            {
              System.out.println(mensaje); 
              aux=Integer.parseInt(sc.nextLine());
              return aux;
            } catch (Exception e)
            {
                System.out.println("Error Ingresa un dato numerico");
            }
        }
    }
    
}
