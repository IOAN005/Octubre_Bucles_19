import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //pedir numeros hasta que se taclee uno negativo,y mostrar cuantos numeros se han introducido

        int numero =0;
        int sumaNumeros=0;
        Scanner teclado =new Scanner(System.in);

        while (numero>=0){
            System.out.println("escriba un numero");
            numero=teclado.nextInt();
            if (numero>0){
                System.out.println();
            }


        }


    }
}
