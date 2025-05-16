package laboratorio4equipo;
import java.util.Scanner;

/**
 * @author gaat1
 */
public class Cifrado {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresa la palabra que quieras cifrar: ");
        String palabra = input.next();
        System.out.print("Elija un numero positivo entero para el desplazamiento: ");
        int desplazamiento = input.nextInt();
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cifrado = "";
        for (int index = 0;index < palabra.length();index++){
            char letra = palabra.charAt(index);
            if (alfabeto.indexOf(letra) != -1){
                int indice = alfabeto.indexOf(letra);
                if (indice+desplazamiento >= 26){
                    cifrado += alfabeto.charAt(indice+desplazamiento-26);
                }else{
                    cifrado += alfabeto.charAt(indice+desplazamiento);
                }
            }else if(ALFABETO.indexOf(letra) != -1){
                int indice = ALFABETO.indexOf(letra);
                if (indice+desplazamiento >= 26){
                    cifrado += ALFABETO.charAt(indice+desplazamiento-26);
                }else{
                    cifrado += ALFABETO.charAt(indice+desplazamiento);
                }
            }
            else{
                cifrado += letra;
            }
        }
        System.out.println("Esta es palabra cifrafa: " + cifrado);

    }
}
