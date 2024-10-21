import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        System.out.println("Introduce el dia");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();

        System.out.println("Introduce el mes");
        Scanner sc2 = new Scanner(System.in);
        int mes = sc2.nextInt();

        System.out.println("Introduce el año");
        Scanner sc3 = new Scanner(System.in);
        int año = sc3.nextInt();

        switch (mes) {
            case 1,3,5,7,8,10,12:

                 if (dia == 31 && mes == 12){
                    año = año + 1;
                    mes = 1;
                    dia = 1;
                }else if (dia == 31) {
                     mes = mes + 1;
                     dia = 1;
                     break;
                 }
                case 4,6,9,11:
                    if (dia == 30){
                        mes = mes + 1;
                        dia = 1;
                    }
                    break;
            case 2:
                if (dia == 28){
                    mes = mes + 1;
                    dia = 1;
                }
            default:
                System.out.println("ERROR La fecha no existe");

        }
        System.out.println("La fecha correspondiente es: " + dia +" , " + mes + " , " + año );
    }
}
