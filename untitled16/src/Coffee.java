import java.util.Random;
import java.util.Scanner;


public class Coffee {

    float a;
    double b;
    String c;
    String d;




    public void coffee() {
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
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of coffee!");
        while(true) {
            System.out.println("What kind of coffee would you like to learn about? ");
            System.out.println("Espresso(1),Americano(2),Caffè Latte(3),Cappuccino(4),Caffè Mocha(5):");
            a = input.nextInt();

            while (a != 1 && a != 2 && a != 3 && a != 4 && a != 5) {
                System.out.print("Sorry,the number you entered is incorrect,please re-enter it again");
                a = input.nextInt();
            }
            if (a == 1) {
                c = "Espresso";
            }//意式浓缩
            if (a == 2) {
                c = "Americano";
            }//美式
            if (a == 3) {
                c = "Caffè Latte";
            }//拿铁
            if (a == 4) {
                c = "Cappuccino";
            }//卡布奇诺
            if (a == 5) {
                c = "Caffè Mocha";
            }//摩卡
            //choose the kind of coffee

            System.out.println("Which aspect would you like to learn about? ");
            System.out.println("history(1),the recipe for coffee(2),characteristic(3):");
            b = input.nextInt();

            while (b != 1 && b != 2 && b != 3) {
                System.out.print("Sorry,the number you entered is incorrect,please re-enter it again");
                b = input.nextInt();
            }
            if (b == 1) {
                d = "history";
            }
            if (b == 2) {
                d = "recipe";
            }
            if (b == 3) {
                d = "characteristic";
            }
            b = b / 10;
            //choose what aspect they want to learn


            System.out.println("OK,here is the " + d + " of " + c + " :");
            if (a + b == 1.1) {
                System.out.println("The history of espresso can be traced back to the early 20th century, ");
                System.out.println("initially invented around 1820 by the Frenchman Louis-Bernard Rabaut, and later gained ");
                System.out.println("widespread popularity due to its advocacy by Italians. With the acceleration of industrialization,");
                System.out.println("people began to pursue more efficient and convenient coffee brewing methods. Espresso, with its ");
                System.out.println("quick and concentrated characteristics, gradually emerged as a favorite. ");
            } else if (a + b == 1.2) {
                System.out.println("Heating the coffee cup before use is crucial; rinse it with hot water to prevent the ");
                System.out.println("porcelain or glass from cooling the coffee. Grind the coffee beans using a fine grind setting, ");
                System.out.println("typically using 7 to 15 grams per serving, and pour the ground coffee into the portafilter. ");
                System.out.println("Tap the portafilter on a tamper to evenly distribute the coffee or use a distribution tool to");
                System.out.println(" ensure no air pockets, which can affect extraction. Compact the coffee grounds firmly with a ");
                System.out.println("tamper to maintain its shape. Begin extraction immediately to avoid burning the coffee grounds.");
                System.out.println(" Once extraction is complete, remove the cup from the coffee machine tray and enjoy your espresso.");
            } else if (a + b == 1.3){
                System.out.println("The essence of espresso lies in extracting the aroma of coffee under high pressure. It features two ");
                System.out.println("distinct characteristics: ① Small and Quick: A serving of espresso is typically small (ranging from 15 to 60 ");
                System.out.println("milliliters), served in a specialized cup. Unlike other coffee preparation methods, making espresso involves ");
                System.out.println("using high pressure and hot water to extract coffee oils and other aromatic components within an extremely short");
                System.out.println(" period (20-30 seconds). ② Compact and Refined: The most defining characteristic of espresso is the creamy layer");
                System.out.println(" of coffee oil floating on its surface, which is composed of numerous powdered particles, water, coffee oil, and");
                System.out.println(" carbon dioxide. The taste of espresso is intense, powerful, and rich. On average, the concentration of a cup of");
                System.out.println(" espresso is over 10 times that of a cup of hand-brewed coffee.");}
            else if (a + b == 2.1){
                System.out.println("The history of Americano coffee can be traced back to the World War II era, with its origins not in the United ");
                System.out.println("States but on the European battlefields. At that time, American soldiers stationed in Europe found the local espresso too ");
                System.out.println("strong for their taste. To improve its flavor, they tried diluting it with hot water, making it closer to the drip coffee ");
                System.out.println("commonly consumed in the United States. This practice was soon noticed by Italians, who began offering this diluted coffee ");
                System.out.println("to American soldiers, which eventually evolved into the now-familiar Americano. After World War II, with the rapid ");
                System.out.println( "economic recovery of the United States and the rise of coffee shop chains, Americano coffee gradually became a standardized");
                System.out.println(" beverage and gained widespread popularity and acceptance globally. Today, Americano coffee has become an international ");
                System.out.println("phenomenon, loved by coffee enthusiasts worldwide.");}
            else if (a + b == 2.2){
                System.out.println("By simply diluting espresso with hot water and adding sugar and milk according to personal taste, you can refer to");
                System.out.println(" the method for making espresso.");}
            else if (a + b == 2.3){
                System.out.println("Compared to espresso, Americano coffee uses more hot water to dilute the coffee, reducing its bitterness");
                System.out.println(" and resulting in a milder taste. It has a balanced acidity and bitterness, neither too sour nor too bitter, making");
                System.out.println(" it easy to drink. Its rich flavor offers both the body of coffee and a hint of sweetness and acidity.");}
            else if (a + b == 3.1){
                System.out.println("The Caffè Latte first emerged in Europe during the 17th century and became a popular beverage in Italy, ");
                System.out.println("especially favored in coffeehouses. Italians enjoyed adding an equal amount of milk to a shot of espresso and topping");
                System.out.println(" it with a layer of milk foam, creating the classic Caffè Latte.");}
            else if (a + b == 3.2){
                System.out.println("First, grind the coffee beans into fine powder using a coffee grinder. Next, brew the coffee powder with ");
                System.out.println("a mocha pot or espresso machine to obtain a rich espresso. Allow it to cool slightly. Meanwhile, pour milk into a ");
                System.out.println("milk frother and heat it while creating foam. It's best to control the milk temperature at around 65°C. Pour the ");
                System.out.println("steamed milk into a cup, filling about two-thirds of it. Then, gently pour the espresso over the milk. The espresso");
                System.out.println(" will sink and create a distinct layer between the milk and the surface. Finally, add a layer of foam on top and ");
                System.out.println("sprinkle some chocolate powder for added flavor and presentation.");}
            else if (a + b == 3.3){
                System.out.println("The espresso component in a latte brings a rich coffee aroma, while the steamed milk gives it a smooth ");
                System.out.println("texture. The combination of these two elements creates a layered and complex taste experience in the mouth. The ");
                System.out.println("foam on top is as light and fluffy as clouds, with a delicate texture that enhances the richness and depth of the");
                System.out.println(" coffee's flavor. A moderate temperature allows the aroma and taste of the coffee to be fully expressed.");}
            else if (a + b == 4.1){
                System.out.println("In the late 19th century, Milanese citizens enjoyed a drink called Marco Polo, a mix of espresso and hot");
                System.out.println(" milk without foam. In 1895, Francesco Allii opened the Caffè Cesare in Milan and introduced his innovative beverage, ");
                System.out.println("initially called Cappuccino (later standardized), which combined espresso, warm milk, and a layer of light foam. This ");
                System.out.println("drink quickly gained popularity among locals. The name Cappuccino originated from the Capuchin monks, who wore brown ");
                System.out.println("robes and pointed hats. When the Capuchin order arrived in Italy, locals found their attire distinctive and named it ");
                System.out.println("Cappuccino, derived from the Italian word Cappuccio meaning hood. Italians, who loved coffee, noticed the similar");
                System.out.println(" color between the mixed drink and the monks' robes, thus naming the beverage Cappuccino.");}
            else if (a + b == 4.2){
                System.out.println("Using an espresso machine, follow the machine's instructions to add the appropriate amount of coffee ");
                System.out.println( "grounds and extract the espresso. The espresso should have a golden, fine crema layer, which is a key feature of ");
                System.out.println("a cappuccino. Pour milk into a clean pitcher and heat it to between 60 and 65 degrees Celsius. Use the steam nozzle");
                System.out.println(" to froth the milk until it forms a dense foam. Once the milk reaches the desired temperature and the foam is thick,");
                System.out.println(" turn off the steam nozzle. Pour the espresso into a coffee cup first. Then, pour the frothed milk into the coffee,");
                System.out.println(" being careful to maintain the integrity of the foam. Finally, gently scoop the remaining foam onto the top of the");
                System.out.println(" coffee to form a thick layer. Optionally, use a latte art tool to create beautiful patterns on the foam for added");
                System.out.println(" visual appeal and fun.");}
            else if (a + b == 4.3){
                System.out.println("The taste of a cappuccino is unique and delightful. It blends the intense aroma and rich flavor of ");
                System.out.println("espresso with the smoothness and sweetness of steamed milk. The fine foam on top is as light as a cloud, adding " );
                System.out.println("layers of complexity and silkiness to the coffee. Overall, the taste of a cappuccino is both rich and smooth, ");
                System.out.println("leaving a lasting impression.");}
            else if (a + b == 5.1){
                System.out.println("In the 15th century, the overseas shipping industry of non-coffee-producing countries in the Middle ");
                System.out.println("East and Africa was not developed, and the port of Mocha in Yemen was the main coffee export port near the Red ");
                System.out.println("Sea at that time.Therefore, African coffee was mainly concentrated at the port of Mocha for export, and thus ");
                System.out.println("these coffees were collectively known as Mocha coffee.");}
            else if (a + b == 5.2){
                System.out.println("Place the finely ground coffee beans into the coffee machine, add an appropriate amount of water ");
                System.out.println("according to the machine's instructions, and then start the machine to extract the coffee essence. Wait for the");
                System.out.println(" extraction to complete, and then pour the coffee essence into a cup. Add an appropriate amount of cocoa powder");
                System.out.println(" to fresh milk, and heat it in the microwave on high for 40 seconds until the cocoa powder is completely dissolved");
                System.out.println(" and mixed evenly with the milk. Next, pour the cocoa milk mixture into the cup containing the coffee essence, ");
                System.out.println( "and stir well to combine. Place whipped cream and sugar in a bowl, and whisk with a whisker until it reaches a " );
                System.out.println( "soft peak consistency (about 5 stages of whipping). The whipped cream should appear fluffy and easy to squeeze out.");
                System.out.println(" Squeeze the whipped cream into the cup containing the coffee and cocoa milk mixture, forming a thick layer of " );
                System.out.println("cream on top. Finally, use chocolate sauce to draw decorative patterns on the surface of the whipped cream.");}
            else if (a + b == 5.3){
                System.out.println("Mocha coffee blends various elements such as coffee, chocolate, and milk, resulting in a rich and ");
                System.out.println("complex flavor. When tasted, one can feel the mellow richness of the coffee intertwined with the sweetness of ");
                System.out.println("the chocolate, creating a unique and unforgettable taste. The flavor is layered, transitioning from the mellow ");
                System.out.println("richness of the coffee to the sweetness of the chocolate, and then to the smoothness of the milk, with each layer");
                System.out.println(" boasting its own distinct taste and texture. This layered flavor makes mocha coffee even more dimensional and");
                System.out.println( " profound.");}


            System.out.println("Do you want to continue?('yes' to continue or anything else to quit):");
            String answer=input.next();
            if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("STOP");
                break;
            }
        }
    }
}
