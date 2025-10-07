import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class products {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         List<Product> products = new ArrayList<Product>();

         while(true){
             System.out.println("Comando para trabajar con productos: \n/add \n/get");
             String name = input.nextLine();
             if(name.equals("/add")) {
                 System.out.println("Introduzca el nombre del producto");
                 String product = input.nextLine();

                 System.out.println("Introduzca el precio del producto");
                 double price = input.nextDouble();

                 System.out.println("Introduzca la cantidad del producto");
                 int quantity = input.nextInt();

                 products.add(new Product(product, price, quantity));
             }
             if(name.equals("/get")) {
                 System.out.println("______________________________________________");
                 for(Product p : products){
                     System.out.print("Nombre: " + p.name + " ");
                     System.out.print("| Precio: " + p.price);
                     System.out.print("| Cantidad: " + p.quantity + "\n");
                 }
                 System.out.println("______________________________________________");
             }
         }
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

     }
}
