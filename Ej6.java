import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        //Introducimos la variable
        System.out.println("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Escribe un numero: ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        System.out.println("Escribe un numero: ");
        Scanner sc3 = new Scanner(System.in);
        int num3 = sc3.nextInt();

        if (num > num2 && num > num3) {
            if (num2 > num3) {
                System.out.println(num + " , " + num2 + " , " + num3);
            }else {
                System.out.println(num + " , " + num3 + " , " + num2);
            }

        }else if (num2 > num && num2 > num3) {
            if (num > num3) {
                System.out.println(num2 + " , " + num + " , " + num3);
            }else {
                System.out.println(num2 + " , " + num3 + " , " + num);
            }

        }else if (num3 > num && num3 > num2) {
            if (num > num2) {
                System.out.println(num3 + " , " + num + " , " + num2);
            }else {
                System.out.println(num3 + " , " + num2 + " , " + num);
            }
        }


    }
}
