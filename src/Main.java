import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int points = 0;
        System.out.println("Ready to start?[y/n]");
        while (true) {
            if (input.nextLine().equals("y")) {
                switch (rand.nextInt(3)) {
                    case 0:
                        System.out.println("Wich pokemon evolves from eevee when exposed to a wateer stone?");
                        System.out.println("1.Vaporeon");
                        System.out.println("2.Flareon");
                        System.out.println("3.Joltoen");
                        System.out.println("4.Espeon");
                        if (input.nextInt() == 1) {
                            System.out.println("CORRECT!");
                            points++;
                        } else {
                            System.out.println("Incorrect");
                        }
                        break;
                    case 1:
                        System.out.println("Wich is the type of the first Kanto gym");
                        System.out.println("1.Water");
                        System.out.println("2.Rock");
                        System.out.println("3.Grass");
                        System.out.println("4.Bug");
                        if (input.nextInt() == 2) {
                            System.out.println("CORRECT!");
                            points++;
                        }else  {
                            System.out.println("Incorrect");
                        } break;
                        case 2:
                            System.out.println("Wich game Zorua was introduced in?");
                            System.out.println("1. Red/Blue");
                            System.out.println("2. Diamond/Pearl");
                            System.out.println("3. Ruby/Saphire");
                            System.out.println("4. Black/White");
                            if (input.nextInt() == 4) {
                                System.out.println("CORRECT!");
                                points++;
                            } else  {
                                System.out.println("Incorrect");
                            } break;
                }
                System.out.println("Wish to continue? [y/n]");
                if (input.next().equals("n")) {
                    System.out.println("You got "+points+" points");
                    break;
                }
            } else  {
                break;
            }
        }
    }
}