import java.util.InputMismatchException;

import java.util.Scanner;

public class Calculator {


   public void Calculator(){
        Scanner scanner = new Scanner(System.in);
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



