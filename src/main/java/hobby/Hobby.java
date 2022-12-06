package hobby;

import java.util.Scanner;

public class Hobby {

    public static void main(String[]args) {

        System.out.println("Please enter your name:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Please, enter your hobby");
        String hobby = scanner.nextLine();

        System.out.println("Wonderful " + name + ", your hobby is " + hobby + "!");
    }
}
