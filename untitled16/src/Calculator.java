import java.util.InputMismatchException;

import java.util.Random;
import java.util.Scanner;

public class Calculator {


   public void Calculator(){
        Scanner scanner = new Scanner(System.in);
       Random random=new Random();
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
        while (true) {
            try {
                System.out.println("Welcome to the Calculator");
                System.out.println("Please input num1");
                double num1 = scanner.nextDouble();
                System.out.println("Please input symbol");
                char symbol=scanner.next().charAt(0);
                System.out.println("Please input num2");
                double num2 = scanner.nextDouble();

                if(symbol!='+'&&symbol!='-'&&symbol!='*'&&symbol!='/'){
                    System.out.println("Sorry,please input the correct symbol ");
            }
            else{


                 if (symbol =='+' ) {
                    System.out.println("Answer is "+(num1 + num2));}

                else if (symbol == '-') {
                System.out.println("Answer is "+(num1 - num2));}
                else if (symbol == '*'){
                    System.out.println("Answer is "+(num1 * num2));}
                else  {
                    System.out.println("Answer is "+(num1 / num2));}

            }
                System.out.println("Do you want to continue?('yes' to continue or anything else to quit):");

                String answer=scanner.next();
                if (!answer.equalsIgnoreCase("yes")) {

                    break;
                }

            }catch (RuntimeException e) {
                throw new RuntimeException(e);
            }


        }
    }
}



