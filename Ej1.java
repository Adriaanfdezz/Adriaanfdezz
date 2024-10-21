import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        //Introducimos la variable
        System.out.println("Escribe un numero:  ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Con el if
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
