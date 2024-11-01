
import java.util.Scanner;

import java.util.concurrent.TimeUnit;

class Sports {
    public void Sports() {



           Scanner scanner = new Scanner(System.in);

           System.out.println("Welcome to the sports management.");

           System.out.println("Do you have any old injuries? (yes/no)");
           String oldInjuries = scanner.next();


           System.out.println("What is your goal, lose weight or gain muscle? (l/g)");
           String goal = scanner.next();


           System.out.println("Please enter your height (in cm):");
           float height = scanner.nextFloat();

           System.out.println("Please enter your weight (in kg):");
          float weight = scanner.nextFloat();



           System.out.println("Old Injuries: " + oldInjuries);
           if(goal .equalsIgnoreCase("l")){
           System.out.println("Goal: lose weight");}
           else if(goal .equalsIgnoreCase("g")){
               System.out.println("Goal: gain muscle");
           }
           System.out.println("Height: " + height + " cm");
           System.out.println("Weight: " + weight + " kg");
        float BMI = weight / ((height/100 )* (height/100));
        System.out.println("Your BMI is : " + BMI);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (BMI < 18.5){
            System.out.println("You are underweight.You should exercise more and have a balanced diet.");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Your weight is normal.So glad to see you're at a healthy weight,keep it up!");
        } else if (BMI >= 25 && BMI < 29.9) {
            System.out.println("Your weight is overweight.Be careful with your eating habits and keep exercising!");
        } else {
            System.out.println("You are obese.I'm sorry, but for your physical condition, I think you should immediately change your eating habits and make your own weight loss plan.");
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
System.out.println("Here are some suggestions.");
           if(oldInjuries.equalsIgnoreCase("no")) {
               if (goal .equalsIgnoreCase("l")){
                   System.out.println("Bodybuilding is a very good and recommended way to lose weight. ");
                   System.out.println("Each person can according to their own physical conditions, strength, muscle line to develop an individualized fitness way, do more aerobic exercise, do less anaerobic exercise.");
                   System.out.println("And according to their own weight and standard weight gap, to develop the total time of weekly exercise, it is recommended to maintain at least 1-2 hours of aerobic exercise every day, at least 5 times a week. ");
                   System.out.println("At the same time, the diet should be low-sugar, low-oil, low-fat diet, eat more foods rich in high-quality protein, try to limit alcohol, pay attention to rest.");
               }
               else{
                   System.out.println("The method of muscle growth during fitness is progressive resistance training, which can rapidly increase the muscle strength.  ");
                   System.out.println("The main method is to first measure the maximum load that the muscle group can bear for 10 consecutive isotonic contractions, and make the daily amount of exercise as a reference.");
                   System.out.println("The daily training is divided into 3 groups. The first group of exercise took 50% of the maximum load and repeated 10 times, and the second group of exercise took 75% of the maximum load and repeated 10 times. The third group of exercise took 100% of the maximum load and repeated 10 times, each group could rest for 1 minute, and then repeated the test of the maximum muscle load after 1 week. ");
                   System.out.println("If the muscle strength has improved, the training intensity and plan for the next week should be formulated according to the latest maximum load, and protein should be added to promote muscle growth after fitness.");
               }
           }
           else{ if (goal .equalsIgnoreCase("l")){
               System.out.println("Bodybuilding is a very good and recommended way to lose weight. ");
               System.out.println("Each person can according to their own physical conditions, strength, muscle line to develop an individualized fitness way, do more aerobic exercise, do less anaerobic exercise.");
               System.out.println("And according to their own weight and standard weight gap, to develop the total time of weekly exercise, it is recommended to maintain at least 1-2 hours of aerobic exercise every day, at least 5 times a week. ");
               System.out.println("At the same time, the diet should be low-sugar, low-oil, low-fat diet, eat more foods rich in high-quality protein, try to limit alcohol, pay attention to rest.");
               System.out.println("Considering that you have an old injury, please pay attention to moderate exercise");
           }
           else{
               System.out.println("The method of muscle growth during fitness is progressive resistance training, which can rapidly increase the muscle strength.  ");
               System.out.println("The main method is to first measure the maximum load that the muscle group can bear for 10 consecutive isotonic contractions, and make the daily amount of exercise as a reference.");
               System.out.println("The daily training is divided into 3 groups. The first group of exercise took 50% of the maximum load and repeated 10 times, and the second group of exercise took 75% of the maximum load and repeated 10 times. The third group of exercise took 100% of the maximum load and repeated 10 times, each group could rest for 1 minute, and then repeated the test of the maximum muscle load after 1 week. ");
               System.out.println("If the muscle strength has improved, the training intensity and plan for the next week should be formulated according to the latest maximum load, and protein should be added to promote muscle growth after fitness.");
               System.out.println("Considering that you have an old injury, please pay attention to moderate exercise");
           }

           }

           System.out.println("Input anything to quit:");
           String answer=scanner.next();



           }


        }














