//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int color = random.nextInt(31, 37);
            if (color == 31) {
                System.out.println("\u001b[31m");
            } else if (color == 32) {
                System.out.println("\u001b[32m");
            } else if (color == 33) {
                System.out.println("\u001b[33m");
            } else if (color == 34) {
                System.out.println("\u001b[34m");
            } else if (color == 35) {
                System.out.println("\u001b[35m");
            } else if (color == 36) {
                System.out.println("\u001b[36m");
            } else {
                System.out.println("\u001b[37m");
            }

            System.out.println("-------------App Library------------\n|  a) Sports management            |\n|  b) Guessing game                |\n|  c) Coffee introduction          |\n|  d) Calculator                   |\n|  e) Healthy                      |\n|  f) Compute                      |\n|  g) Five-in-five                 |\n|  h) Fate                         |\n|  i) Exit                         |\n ----------------------------------");

            try {
                TimeUnit.SECONDS.sleep(1L);
            } catch (InterruptedException var15) {
                InterruptedException e = var15;
                throw new RuntimeException(e);
            }

            System.out.println("The place that you want to go:");
            switch (scanner.next()) {
                case "a":
                    Sports sports = new Sports();
                    sports.Sports();
                    break;
                case "b":
                    guessinggame Guessinggame = new guessinggame();
                    Guessinggame.Guessinggame();
                    break;
                case "c":
                    Coffee coffee = new Coffee();
                    coffee.coffee();
                    break;
                case "d":
                    Calculator calculator = new Calculator();
                    calculator.Calculator();
                    break;
                case "e":
                    Healthy healthy = new Healthy();
                    healthy.Healthy();
                    break;
                case "f":
                    compute Compute = new compute();
                    Compute.compute();
                    break;
                case "g":
                    fiveinfive Fiveinfive = new fiveinfive();
                    Fiveinfive.fiveinfive();
                    break;
                case "h":
                    Fate fate = new Fate();
                    fate.Fate();
                    break;
                case "i":
                    System.out.println("Exiting...bye.");
                    System.exit(0);
            }
        }
    }
}
