import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
while(true){
        System.out.println("""
                 -------------App Library------------
                |  a) Sports management            |
                |  b) Guessing game                |
                |  c) Coffee introduction          |
                |  d) Calculator                   |
                |  e) Healthy                      |
                |  f) Compute                      |
                |  g) Exit                         |
                 ----------------------------------""");
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
        System.out.println("The place that you want to go:");


        String choice =scanner.next();
        switch (choice){
            case "a":
                Sports sports=new Sports();
                sports.Sports();
                break;
            case "b":
                guessinggame Guessinggame=new guessinggame();
               Guessinggame.Guessinggame();
               break;
            case "c":
                Coffee coffee=new Coffee();
                coffee.coffee();
                break;
            case "d":
                Calculator calculator=new Calculator();
                calculator.Calculator();
                break;

            case "e":
               Healthy healthy=new Healthy();
               healthy.Healthy();
               break;
            case "f":
                compute Compute=new compute();
                Compute.compute();
                break;


            case "g":
                System.out.println("Exiting...bye.");
                System.exit(0);
        }
    }
}
    }
