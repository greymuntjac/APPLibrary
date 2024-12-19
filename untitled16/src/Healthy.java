import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Healthy {
    public void Healthy() {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the health monitoring system.");

            System.out.print(" Please enter body temperature (Celsius) : ");
            double temperature = scanner.nextDouble();

            System.out.print(" Please enter heart rate (times/min) : ");
            int heartRate = scanner.nextInt();

            System.out.print("Please enter blood pressure (systolic/diastolic, e.g. 120/80) : ");
            String bloodPressure = scanner.next();
            String[] bpParts = bloodPressure.split("/");
            int systolic = Integer.parseInt(bpParts[0]);
            int diastolic = Integer.parseInt(bpParts[1]);

            System.out.println();
            System.out.println("Health monitoring results :");
            System.out.println("temperature: " + temperature + "°C");
            System.out.println("heart rate: " + heartRate + " times/min");
            System.out.println("blood pressure: " + systolic + "/" + diastolic + " mmHg");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (temperature >= 36.5 && temperature <= 37.5) {
                System.out.println("Normothermia.");
            } else {
                System.out.println("Abnormal temperature,please be advised!");
            }

            if (heartRate >= 60 && heartRate <= 100) {
                System.out.println("Normal heart rate.");
            } else {
                System.out.println("Abnormal heart rate,please be advised!");
            }

            if (systolic >= 90 && systolic <= 120 && diastolic >= 60 && diastolic <= 80) {
                System.out.println("Normotension.");
            } else {
                System.out.println("Abnormal blood pressure,please be advised!");
            }
            System.out.println("Input anything to quit:");
            String answer = scanner.next();
            break;
        }
    }
}