import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class products {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         List<Product> products = new ArrayList<Product>();
     }

     static class Product{
         private String name;
         private double price;
         private int quantity;

         public Product(String name, double price, int quantity){
             this.name=name;
             this.price=price;
             this.quantity=quantity;
         }

         public void getProduct(){
             System.out.print("Nombre: " + name + " ");
             System.out.print("| Precio: " + price);
             System.out.print("| Cantidad: " + quantity + "\n");
         }

         public void setProduct(){
             Scanner input = new Scanner(System.in);

             System.out.print("Nuevo nombre del producto: ");
             this.name= input.nextLine();

             System.out.print("Nuevo precio del producto: ");
             this.price = input.nextDouble();

             System.out.print("Neva cantidad del producto: ");
             this.price = input.nextInt();
         }
     }
}
