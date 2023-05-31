

package com.mycompany.medidastendenciacentral.git;

public class Main {
    public static void llenarVector(int vector[]){
        Lector lc = new Lector();
        for (int i = 0; i < vector.length; i++) {
            System.out.println(i);
            
            vector[i] = lc.leerEntero("Ingresa el numero en la pos: "+i);
        }
    }
    public static void main(String[] args) {
        Lector lc = new Lector();
        int tam = 0;
        do {            
            tam = lc.leerEntero("Ingresa el numero de los datos en el vector");
            if(tam <= 0){
                System.out.println("Ingresa los valores mayores que 1");
            }
        } while (tam <= 0);
        
        int vector [] = new int [tam];
        
        llenarVector(vector);
        
        Metodos m1 = new Metodos (vector);
        
        int op = 0;
        do {            
            op = lc.leerEntero("Elige una opción"
                    + "0 Salir"
                    + "Media"
                    + "Mediana"
                    + "Moda");
            
            switch (op) {
                case 1: 
                    System.out.println("La media es: " + m1.df.format(m1.calcularMedia()));
                    break;
                
                case 2:
                    System.out.println("La mediana es: " + m1.format(calcularMediana()));
                    break;
                
                case 3:
                    System.out.println("La moda es: " + m1.calcularModa());
                    break;
                    
                default:
                    System.out.println("No es esa opcion");
                        
            }
        } while (op!=0);
    }
}
