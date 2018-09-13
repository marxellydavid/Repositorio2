/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PracticaEvaluada
 */
public class Ejemplo {
    
    public static void main(String[] args){

    int[] edades = new int[6];
    String grupo[] = new String[4];
    
    edades[0] = 23;
    edades[1] = 54;
    edades[2] = 96;
    edades[3] = 13;
    edades[4] = 17;
    edades[5] = 32;
    
    grupo[0] = "Jhon";
    grupo[1] = "Paul";
    grupo[2] = "George";
    grupo[3] = "Ringo";
    
    for(int i = 0; i < 6; i++){
    
        System.out.println("Edad # " + (i + 1) + " = " + edades[i] + " años");
    }
    System.out.println("");
    for(int i = 0; i < 4; i++){
        
        System.out.println("Artista # " + (i + 1) + " = " + grupo[i]);
            
        }
    }
}
