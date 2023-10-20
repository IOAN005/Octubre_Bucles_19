import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Leer un numeroy monstrar su cuadrado,repetir el proceso hasta que se imtrodusca un numero negativo
        //Declarar una variable
        //Primitivas
        int numero = 0;
        //instancia
        Scanner teclado = new Scanner(System.in);
        while (numero >= 0) {
            //solicitar el numero
            System.out.println("escriba un numero y cuando quiero salir escriba un negativo");
            numero = teclado.nextInt();
            if (numero >= 0) {

                System.out.println("el cuadrado de " +  numero  + " es " + (numero * numero));
                System.out.println("el cuadrado de " + numero + " es 2" + Math.pow(numero, 2));

            } else {
                System.out.println("gracias...");
            }
        }

        }
    }
