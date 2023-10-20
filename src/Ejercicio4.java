import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //realizar un juego de adivinar un numero y calcularel numero a adivinar
        //con la clase random(1 al 10) y luego ir pidiendo numeros indicando si es mayor o menor
        //con respecto  al numero a adivinar.
        //el proceso termina cuando el usuario acierta.


        //1.Declara variable
        // primitiva
        int numeroPedir=0,numeroAdivinar;
        //de instancia
        Random numeroAleatorio=new Random();
        Scanner teclado =new Scanner(System.in);
        numeroAdivinar =numeroAleatorio.nextInt(1,11);
        //System.out.println("numero a adivinar"+numeroAdivinar);

        while (numeroPedir!=numeroAdivinar){
            System.out.println("escriba un numero-->");
            numeroPedir=teclado.nextInt();
            if (numeroPedir>numeroAdivinar){
                System.out.println("el numero pedido es mayor al de adivinar");

            }else if (numeroPedir<numeroAdivinar){
                System.out.println("el numero pedido es menor");
            }else{
                System.out.println("enhorabuena a adivinado");

            }

        }

    }
}
