import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        System.out.println("Introduce tu mes de nacimiento:  ");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();

        System.out.println("Introduce tu dia de nacimiento:  ");
        Scanner sc2 = new Scanner(System.in);
        int dia = sc2.nextInt();

        if (mes == 1 && dia >= 20 || mes == 2 && dia <= 18) {
            System.out.println("Acuario");
        }else if (mes == 2 && dia >= 19 || mes == 3 && dia <= 20) {
            System.out.println("Piscis");
        } else if (mes == 3 && dia >= 21 || mes == 4 && dia <= 19) {
            System.out.println("Aries");
        } else if ( mes == 4 && dia >= 20 || mes == 5 && dia <= 20) {
            System.out.println("Tauro");
        } else if (mes == 5 && dia >= 21 || mes == 6 && dia <= 20) {
            System.out.println("Geminis");
        } else if (mes == 6 && dia >= 21 || mes == 7 && dia <= 22) {
            System.out.println("Cancer");
        } else if (mes == 7 && dia >= 21 || mes == 8 && dia <= 22) {
            System.out.println("Leo");
        } else if (mes == 8 && dia >= 23 || mes == 9 && dia <= 22) {
            System.out.println("Virgo");
        } else if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22) {
            System.out.println("Libra");
        } else if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21) {
            System.out.println("Scorpio");
        } else if (mes == 11 && dia >= 22 || mes == 12 && dia <= 21) {
            System.out.println("Sagitario");
        } else if (mes == 12 && dia >= 22 || mes == 1 && dia <= 19) {
            System.out.println("Capricornio");
        }

    }
}
