import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        //Introducimos la variable
        System.out.println("Introduce un numero entre 1 y 7:  ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        switch (num1){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERROR Introduce un numero entre 1 y 7:  ");
                break;

        }
    }
}
