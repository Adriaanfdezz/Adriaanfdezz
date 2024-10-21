import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        //Introducimos la variable
        System.out.println("Escribe un numero para decir las cifras que tiene: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //Realizamos la operacion para evaluar cual es el resultado
        if (num >= 0 && num <= 9) {
            System.out.println(num +" Tiene 1 cifra");
        } else if (num >= 10 && num <= 99) {
            System.out.println(num +" Tiene 2 cifras");
        }else if (num >= 100 && num <= 999) {
            System.out.println(num +" Tiene 3 cifras");
        } else if (num >= 1000 && num <= 9999) {
            System.out.println(num +" Tiene 4 cifras");
        } else if (num >= 10000 && num <= 99999) {
            System.out.println(num + " Tiene 5 cifras");
        }else {
            System.out.println("Numero no valido");
        }
    }
}
