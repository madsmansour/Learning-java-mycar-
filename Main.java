import java.awt.*;

import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Mads");
        System.out.println("Hvordan går det idag?");

        Car myCar = new Car(25.5, "1BC32D", Color.BLUE, true);


        Car sallyCar = new Car(13.5, "3D20BN", Color.BLACK, false);

        System.out.println("My Car's license plate: " + myCar.licensePlate);
        System.out.println("Sally's Car's license plate: " + sallyCar.licensePlate);
        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());

        String userInput ="entertainment";
        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstcharacter = userInput.charAt(0);
        System.out.println(firstcharacter);
        System.out.println("Contains" + userInput.contains("Enter".toLowerCase()));


    }
}