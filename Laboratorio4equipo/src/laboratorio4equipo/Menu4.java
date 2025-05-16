package laboratorio4equipo;
import java.util.Scanner;

/**
 * @author gaat1
 */
public class Menu4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        boolean entrar = true;
        while (entrar){
            System.out.println("----Menu-----");
            System.out.println("1. Cifrado");
            System.out.println("2. Filtrar");
            System.out.println("3. Codigo Enigma");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            int menu = input.nextInt();
            switch (menu){
                case 1:
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

                break;
                case 2:
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

                    palabra = "";

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
                case 3:
                    boolean salir = false;

                    while (!salir) {
                        System.out.println("1. Encriptar texto.");
                        System.out.println("2. Desencriptar texto.");
                        System.out.println("3. Salir.");
                        System.out.print("Ingrese una opcion: ");
                        int opcion = input.nextInt();

                        switch (opcion) {
                            case 1: {
                                System.out.print("Ingrese el texto a encriptar: ");
                                palabra = input.next();
                                String par = "";
                                String impar = "";
                                for (int i = 0; i < palabra.length(); i++) {
                                    if (i % 2 == 0) {
                                        par += palabra.charAt(i);
                                    } else {
                                        impar += palabra.charAt(i);
                                    }
                                }
                                String encriptado = par + impar;
                                System.out.println("La palabra encriptada es: " + encriptado);
                                break;
                            }
                            case 2: {
                                System.out.print("Ingrese el texto a desencriptar: ");
                                palabra = input.next();
                                String original = "";
                                int mitad = palabra.length() / 2;
                                String par = "", impar = "";
                                for (int i = 0; i < palabra.length(); i++) {
                                    if (i < mitad) {
                                        par += palabra.charAt(i);
                                    } else {
                                        impar += palabra.charAt(i);
                                    }
                                }
                                for (int i = 0; i < palabra.length(); i++) {
                                    if (i % 2 == 0) {
                                        original += par.charAt(i / 2);
                                    } else {
                                        original += impar.charAt(i / 2);
                                    }
                                }
                                System.out.println("La palabra desencriptada es: " + original);
                                break;
                            }
                            case 3:
                                salir = true;
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Opcion inválida.");
                                break;
                        }
                    }
                case 4:
                    entrar = false;
                    System.out.println("Saliendo...");
                default:
                    System.out.println("Opcion inválida.");
                    break;    

            }
        }
    }
}
