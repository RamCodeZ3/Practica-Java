import java.util.Scanner;

public class Palidromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String finalWord = "";

        System.out.println("Ingrese una palabra:");
        String word = input.nextLine();
        String w = word.toLowerCase().replace(" ","");

        for (int i = w.length() - 1; i >= 0; i--) {
            finalWord += w.charAt(i);
        }

        if(w.equals(finalWord)){
            System.out.println("Es un palindromo");
        }
        else{
            System.out.println("No es un palindromo");
        }
    }
}
