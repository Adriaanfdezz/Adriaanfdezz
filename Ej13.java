import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        //Defino las variables
        System.out.println("Ingrese un numero:  ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //Comprueba si es par o multiplo de 5
        if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("El %d es par y divisible de 5" + num);
        } else if (num % 2 == 0) {
            System.out.println("El %d es par y pero no divisible por 5" + num);
        }else if (num % 5 == 0) {
            System.out.println("El %d es par y pero si divisible por 5" + num);
        } else {
            System.out.println("El %d ni es par ni divisible por 5" + num);
        }
    }
}
