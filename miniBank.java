import java.util.Scanner;

public class miniBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        bank b1 = new bank(100);
        System.out.println("Bievenido a nuestro banco que quiere hacer:");
        System.out.println("Opciones:\n/d: depotiso\n/r: retirar\n/s: saldo\n/e: Salir");
        boolean activate = true;

        try{
            while (activate){
                String option = input.nextLine();

                switch (option) {
                    case "/d":
                        System.out.println("Cuanto quiere depositar:");
                        int depositNumber = input.nextInt();
                        b1.deposit(depositNumber);
                        break;

                    case "/r":
                        System.out.println("Cuanto quiere retirar:");
                        int withdrawNumber = input.nextInt();
                        b1.witdraw(withdrawNumber);
                        break;

                    case "/s":
                        System.out.println(b1.getMoney());
                        break;

                    case "/e":
                        activate = false;
                        break;

                    default:
                        System.out.println("No es una opción válida");
                }

            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    static class bank{
        private int money;
        public bank(int money){
            this.money = money;
        }

        public void deposit(int number){
            this.money = money + number;
        }

        public void witdraw(int number){
            if((number > 0) && (number < this.money)){
                this.money = money - number;
            }
        }

        public int getMoney(){
            return this.money;
        }
    }
}
