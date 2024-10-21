import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        //Introducimos la variable
        System.out.println("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Escribe un numero: ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        if (num > num2) {
            System.out.println(num +" y " + num2);
        } else if (num < num2) {
            System.out.println(num2 + " y " +num);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
