import java.util.Scanner;

public class Ej4 {
    //Introducimos la variable
    public static void main(String[] args) {
        System.out.println("Escribe un numero decimal:  ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if (num < 0 && num > -1 || num > 0 && num < 1) {
            System.out.println("Numero casi-cero");
        } else
            System.out.println("No se considera casi-cero");
    }
}

