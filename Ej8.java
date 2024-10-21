import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        //Introducimos la variable
        System.out.println("Escribe una nota: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n){
            case 0,1,2,3,4:
                System.out.println("Tu nota es un insuficiente");
                break;
            case 5:
                System.out.println("Tu nota es un suficiente");
                break;
            case 6:
                System.out.println("Tu nota es un bien");
                break;
            case 7,8:
                System.out.println("Tu nota es un notable");
                break;
            case 9,10:
                System.out.println("Tu nota es un sobresaliente");
                break;
                default:
                    System.out.println("ERROR La nota tiene que estar comprendida entre 0 y 10");

        }
    }
}
