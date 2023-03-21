import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double totalAmount,apple,banana,pear,tomatoes,eggplant;

        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoesPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many kilos of apple do you want? ");
        apple = scanner.nextDouble();
        System.out.print("How many kilos of banana do you want? ");
        banana = scanner.nextDouble();
        System.out.print("How many kilos of pear do you want? ");
        pear = scanner.nextDouble();
        System.out.print("How many kilos of tomatoes do you want? ");
        tomatoes = scanner.nextDouble();
        System.out.print("How many kilos of eggplant do you want? ");
        eggplant = scanner.nextDouble();
        totalAmount =(applePrice*apple)+(bananaPrice*banana)+(pearPrice*pear)+(tomatoesPrice*tomatoes)+(eggplantPrice*eggplant);
        System.out.print("Total Amount: "+totalAmount+" TL");
    }
}
