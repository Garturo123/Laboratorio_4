/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana4;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Zelaya_Gabriel_Estructura {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
       
        System.out.print("Ingresar una frase: ");
        String frase = input.next();
        System.out.print("Ingresar número entero positivo (Longitud mínima requerida): ");
        int longitudMinima = input.nextInt();
        
        if(longitudMinima<0){
            
            do{
                System.out.print("Solo se permiten valores enteros positivos. Favor ingresar otro número: ");
                longitudMinima = input.nextInt();
            }while(longitudMinima<0);
            
        }
        
        frase = frase.replace(".", "").replace(",", "").replace(";", "").replace(":", "").replace("?", "").replace("!", "");
        
        frase = frase + " ";
        
        String palabra = "";
        
        System.out.println("Palabras con más de "+longitudMinima+" letras: ");
        
        for(int index = 0; index < frase.length(); index++){
            char caracterActual = frase.charAt(index);
            if(caracterActual != ' '){
                palabra += caracterActual;
            }else{
                if(longitudMinima < palabra.length()){
                    System.out.println(palabra);
                }
                palabra = "";
            }
        }
       
    }
    
}
