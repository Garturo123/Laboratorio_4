package laboratorio4equipo;

import java.util.Scanner;

public class CodigoEnigma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
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
                    String palabra = input.next();
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
                    String palabra = input.next();
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
    }
}
