import java.util.Scanner;

public class Kalk {

    public static void main(String[] args) {
        double l1, l2;
        for(;;)
        {
        String operation;
        Scanner scannerObject = new Scanner(System.in);



        System.out.println("Pierwsza liczba: ");
        l1 = scannerObject. nextDouble();

        System.out.println("Druga liczba: ");
        l2 = scannerObject. nextDouble();

        Scanner op = new Scanner(System.in);
        System.out.println("----MENU----");
        System.out.println("Wybierz działanie");
        System.out.println("+ Dodawanie");
        System.out.println("- Odejmowanie");
        System.out.println("/ Dzielenie");
        System.out.println("* Mnożenie");
        System.out.println("w wyjscie");
        operation = op.next();

        switch (operation) {
            case "+":
                System.out.println("Twoj wynik to: " + (l1 + l2));
                break;

            case "-":
                System.out.println("Twoj wynik to: " + (l1 - l2));
                break;

            case "/":
                System.out.println("Twoj wynik to: " + (l1 / l2));
                break;

            case "*":
                System.out.println("Twoj wynik to: " + (l1 * l2));
                break;

            case "w":
                System.exit(0);
                break;

            default:
                System.out.println("Wybrano zle dzialanie");
            }
        }
    }
}