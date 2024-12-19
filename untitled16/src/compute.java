import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

 class compute {

    public void compute() {
        Scanner scanner=new Scanner(System.in);
        int right=0;
        int wrong=0;

        while (true){
            try{
                System.out.println("Please choose addition, subtraction, multiplication or division? (1 for addition /2 for subtraction /3 for multiplication /4 for division)");
                double youranswer;
                double rightanswer;
                int choice=scanner.nextInt();
                double num1=random.nextDouble(0,100);
                double num2=random.nextDouble(0,100);


                if (choice!= 1&&choice!=2&&choice!=3&&choice!=4){
                    System.out.println("Please re-select");
                    continue;
                }
                else if(choice==1){
                    System.out.println("Practice starts");
                    System.out.println(num1 + "+" +num2 + "=?");
                    youranswer=scanner.nextDouble();
                    rightanswer=num1+num2;
                }
                else if(choice==2){System.out.println("Practice starts");
                    System.out.println(num1 + "-" +num2 + "=?");
                    youranswer=scanner.nextDouble();
                    rightanswer=num1 -num2;}

                else if(choice==3){System.out.println("Practice starts");
                    System.out.println(num1 + "*" +num2 + "=?");
                    youranswer=scanner.nextDouble();
                    rightanswer=num1 *num2;}

                else {System.out.println("Practice starts");
                    System.out.println(num1 + "/" +num2 + "=?");
                    youranswer=scanner.nextDouble();
                    rightanswer=num1 /num2;
                }


                double result = determine(youranswer,rightanswer);

                if (result==1){
                    right=right+1;
                    System.out.println("Right");
                    System.out.println("Has got right "+right+"and got wrong" + wrong + "with a total of  "+ ( wrong +right)+" question");
                }
                else if(result==-1) {
                    wrong=wrong+1;
                    System.out.println("Wrong,the right answer is"+ rightanswer);
                    System.out.println("Has got right "+right+" and got wrong" + wrong + " with a total of "+ ( wrong +right)+" question");
                }

                System.out.println("Do you want to continue?('yes' to continue or anything else to quit):");

                String answer=scanner.next();
                if (!answer.equalsIgnoreCase("yes")) {

                    break;
                }

            }catch (InputMismatchException e){
                System.out.println("You are automatically returned to the main screen.");
                scanner.next();

            }
        }
    }
    public  static  double determine(double youranswer,double rightanswer) {
        if (youranswer == rightanswer) {
            return 1;

        } else {
            return -1;

        }


    }


     }


