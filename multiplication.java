import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Ingrese un numero para multiplicar:");
       int num = input.nextInt();

       for(int i=1; i<=12; i++){
           System.out.println(num +" x "+ i +" = " +num*i);
       }
    }
}
