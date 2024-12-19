import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class guessinggame {





    public void Guessinggame(){
        int a=100000;
        Scanner scanner = new Scanner(System.in);
        String words1=new String("Welcome to the guessing game! Your starting capital is $100,000");
        for(int i=0;i<62;i++)
        {
            System.out.print(words1.charAt(i));
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("0");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String words2=new String("Please choose the side you think will win '1 or -1' or select '0' for a draw");
        for(int i=0;i<76;i++)
        {
            System.out.print(words2.charAt(i));
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(".");
        while (true) {
            try {
                System.out.print("Your choice is：");
                int yourChoice = scanner.nextInt();


                if (yourChoice != 1 && yourChoice != -1 &&yourChoice != 0) {
                    System.out.println("Invalid selection, please re-enter.");
                    continue;
                }
                System.out.print("Your chips($):");
                int b = scanner.nextInt();
                if(b<=0){
                    System.out.println("Please enter more than 0 chips");

                    continue;}
                else{
                    if (b>a){
                        System.out.println("Underfund");
                        continue;
                    }}

                int computer1Choice = random.nextInt(3) + 1;
                int computer2Choice = random.nextInt(3) + 1;
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Computer 1 is out：" + getChoiceName(computer1Choice));
                System.out.println("Computer -1 is out：" + getChoiceName(computer2Choice));

                int result = determineWinner(computer1Choice, computer2Choice);
                if(result ==yourChoice){
                    a=a+b;}                       else {a=a-b;}

                if (result == 0) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("The game is tied.");
                    computer1Choice = random.nextInt(3) + 1;
                    computer2Choice = random.nextInt(3) + 1;
                    System.out.println("Your remaining funds are:" +a+" $");
                } else if (result == 1) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Computer 1 is the winner!");
                    computer2Choice = random.nextInt(3) + 1;
                    computer1Choice = random.nextInt(3) + 1;
                    System.out.println("Your remaining funds are:" +a+" $");
                } else {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Computer -1 is the winner!");
                    computer2Choice = random.nextInt(3) + 1;
                    computer1Choice = random.nextInt(3) + 1;
                    System.out.println("Your remaining funds are:" +a+" $");
                }
                if(a==0){
                    System.out.println("You have lost all your money and the game is over");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Do you want to continue?('yes' to continue or anything else to quit):");
                String continueChoice = scanner.next();
                if (!continueChoice.equalsIgnoreCase("yes")) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Your remaining funds are:"+a+" $,game over.");
                    break;

                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // 清除错误输入
            }

        }
    }

    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            default:
                return "Unknown";
        }
    }



    public static int determineWinner(int computer2Choice, int computer1Choice) {
        if (computer2Choice == computer1Choice) {
            return 0;
        } else if ((computer2Choice == 1 && computer1Choice == 2) ||
                (computer2Choice == 2 && computer1Choice == 3) ||
                (computer2Choice == 3 && computer1Choice == 1)) {
            return 1;
        } else {
            return -1;
        }
    }

}



