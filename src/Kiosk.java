import java.util.Scanner;
public class Kiosk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Age please?");
        var age = scan.nextInt();
        if (age >= 21) {
            System.out.println("You get a wrist band");
        } else if (age < 21) {
            System.out.println("");

        }
    }
}


