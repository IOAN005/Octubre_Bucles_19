import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //2.Leer numeros hasta que introduzca un 0.por cada numero indicar si es par o impar
        int numero =0;
        Scanner teclado =new Scanner(System.in);

        while (true){
        System.out.println("escriba el numero hasta que aparece un 0");
        numero= teclado.nextInt();
        if (numero==0)
            break;
        if (numero%2==0){
            System.out.println("es par ->");


        }else {
            System.out.println("es impar-->");

        }
    }
}
}