import java.awt.*;
import java.util.Scanner;
import java.util.Scanner;

import static java.awt.Color.*;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        {
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

         /*   String userInput = sc.next();
            String uppercased = userInput.toUpperCase();
            System.out.println(userInput);
            System.out.println(uppercased);

            char firstcharacter = userInput.charAt(0);
            System.out.println(firstcharacter);
            System.out.println("Contains" + userInput.contains("Enter".toLowerCase()));*/

            double myCarSpeed = 50;
            myCarSpeed = myCar.speedingUp(myCarSpeed);
            System.out.println(myCarSpeed);

            Dog myDog = new Dog(5.6, "Buster", BLACK, false);
            System.out.println("My dog's age is " + myDog.yearsOld  + " years old ");
            System.out.println("Is dog barking: " + myDog.isDogBarking);
            System.out.println("What color is my dog?: " + myDog.furColor);
            System.out.println("Dog's name is " + myDog.dogName);

        }
    }
}