import  java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Fate {
    public void Fate()
    {
        Random random = new Random();
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
        Scanner scanner = new Scanner(System.in);
        int yourammo1 = 6;
        int computerammo2 = 6;
        System.out.println("Welcome to Fate.You and computer all have six ammos.");
        System.out.println("However,The bout is at random,and everyone can lie,so don`t believe easily");
        System.out.println("You can choose check.But if you are wrong,you have to lose any ammo,maybe 1,2 or 3");
        System.out.println("But if you are lucky enough,you will not lose any ammo");
        System.out.println("Also if you don`t find others` wrong , you will lose ammo ");
        System.out.println("If someone`s ammo less or equal to zero,he will fail.");
        System.out.println("So good luck.");
        while (yourammo1 > 0 && computerammo2 > 0) {
            int begin = random.nextInt(0, 2);
            int lose=random.nextInt(0,4);
            if (begin == 0) {
                System.out.println("Computer bout ");
                int word1 = random.nextInt(1, 3);
                int answer1 = random.nextInt(1, 3);
                System.out.println("Computer:My answer is " + word1);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Computer:Are you check?(check is 1 , no check is 0)");
                int lie2 = scanner.nextInt();
                if (lie2 == 1) {
                    System.out.println("You:Check!");
                } else if (lie2 == 0) {
                    System.out.println("You:No check,pass");
                }
                if (lie2 == 1 && word1 != answer1) {
                    System.out.println("Right");
                    computerammo2 = computerammo2 - lose;
                    System.out.println("Your left ammo " + yourammo1);
                    System.out.println("Computer`s left ammo " + computerammo2);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    continue;
                } else if (lie2 == 1 && word1 == answer1) {
                    System.out.println("Wrong");
                    yourammo1 = yourammo1 - lose;
                    System.out.println("Your left ammo " + yourammo1);
                    System.out.println("Computer`s left ammo " + computerammo2);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    continue;
                } else if (lie2 == 0 && word1 != answer1) {
                    yourammo1 = yourammo1 - lose;
                    System.out.println("Your left ammo " + yourammo1);
                    System.out.println("Computer`s left ammo " + computerammo2);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    continue;
                } else {
                    System.out.println("Your left ammo " + yourammo1);
                    System.out.println("Computer`s left ammo " + computerammo2);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    continue;
                }
            } else if (begin == 1) {
                System.out.println("Your bout ");
                System.out.println("Please sent your answer(1/2)");
                int answer2 = scanner.nextInt();
                System.out.println("Please sent your word(1/2)");
                int word2 = scanner.nextInt();
                System.out.println("You:My answer is " + word2);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("You:Are you check?");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int lie1 = random.nextInt(0, 2);
                if (lie1 == 1) {
                    System.out.println("Computer:Check!");
                } else if (lie1 == 0) {
                    System.out.println("Computer:No check,pass");
                }
                if (lie1 == 1 && word2 != answer2) {
                    System.out.println("Right");
                    yourammo1 = yourammo1 - lose;
                    System.out.println("Your left ammo " + yourammo1);
                    System.out.println("Computer`s left ammo " + computerammo2);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    continue;
                } else if (lie1 == 1 && word2 == answer2) {
                    System.out.println("Wrong");
                    computerammo2 = computerammo2 - lose;
                    System.out.println("Your left ammo " + yourammo1);
                    System.out.println("Computer`s left ammo " + computerammo2);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    continue;
                } else if (lie1 == 0 && word2 != answer2) {
                    computerammo2 = computerammo2 - lose;
                    System.out.println("Your left ammo " + yourammo1);
                    System.out.println("Computer`s left ammo " + computerammo2);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    continue;
                } else {
                    System.out.println("Your left ammo " + yourammo1);
                    System.out.println("Computer`s left ammo " + computerammo2);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    continue;
                }

            }

        }
        if (computerammo2 <= 0) {
            System.out.println("You win");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else if (yourammo1 <= 0) {
            System.out.println("Computer win");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        }
    }
