/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medidastendenciacentral.git;

/**
 *
 * @author Ernest
 */
public class Metodos {
    public double calcularMediana()
    {
        Arrays.sort(this.getVector());
        if (this.getVector().length % 2 == 0)
        {
            int indice1 = this.getVector().length / 2 - 1;
            int indice2 = this.getVector().length / 2;
            return (this.getVector()[indice1] + this.getVector()[indice2]) / 2.0;
        } else
        {
            int indice = this.getVector().length / 2;
            return this.getVector()[indice];
        }
    }

 

    public int calcularModa()
    {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int i = 0; i < vector.length; i++)
        {
            if (frecuencia.containsKey(vector[i]))
            {
                frecuencia.put(vector[i], frecuencia.get(vector[i]) + 1);
            } else
            {
                frecuencia.put(vector[i], 1);
            }
        }
        int moda = -1;
        int maxFrecuencia = 0;
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet())
        {
            int valor = entry.getKey();
            int freq = entry.getValue();
            if (freq > maxFrecuencia)
            {
                moda = valor;
                maxFrecuencia = freq;
            }
        }
        return moda;
    }
}
