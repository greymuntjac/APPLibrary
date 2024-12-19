import java.lang.ref.Cleaner;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int color=random.nextInt(31,37);
            if(color==31){
            System.out.println("\033[31m");
            }
            else if(color==32){
                System.out.println("\033[32m");
            }
            else if(color==33){
                System.out.println("\033[33m");
            } else if(color==34){
                System.out.println("\033[34m");
            } else if(color==35){
                System.out.println("\033[35m");
            } else if(color==36){
                System.out.println("\033[36m");
            } else{
                System.out.println("\033[37m");
            }

            System.out.println("""
                    -------------App Library------------
                    |  a) Sports management            |
                    |  b) Guessing game                |
                    |  c) Coffee introduction          |
                    |  d) Calculator                   |
                    |  e) Healthy                      |
                    |  f) Compute                      |
                    |  g) Five-in-five                 |
                    |  h) Fate                         |
                    |  i) Exit                         |
                     ----------------------------------""");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("The place that you want to go:");


            String choice = scanner.next();
            switch (choice) {
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
                    fiveinfive Fiveinfive=new fiveinfive();
                    Fiveinfive.fiveinfive();
                    break;

                case "h":
                    Fate fate=new Fate();
                    fate.Fate();
                    break;


                case "i":
                    System.out.println("Exiting...bye.");
                    System.exit(0);
            }


        }
    }

}