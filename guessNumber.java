import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random()*100)+ 1 ;
        boolean activate = true;

        try{
            while (activate){
                System.out.println("Adivine el numero:");
                int number2 = input.nextInt();

                if(number == number2){
                    System.out.println("Adivinate el numero si era: " + number);
                    activate = false;
                }

                else if(number > number2){
                    System.out.println("El numero es mayor que: "+ number2);
                }

                else {
                    System.out.println("El numero es menor que: " + number2);
                }
            }
        }
        catch(Exception e){
            System.out.println("Debe ser un numero: " + e);
        }
    }
}
