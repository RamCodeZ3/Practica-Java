import java.util.Scanner;

public class EvenOrOdd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }

    }
}