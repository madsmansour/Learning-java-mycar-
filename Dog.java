import java.awt.*;

public class Dog {


        double yearsOld;
        String dogName;
        Color furColor;
        boolean isDogBarking;

        public Dog(double inputYearsOld,
                   String inputDogName,
                   Color inputFurColor,
                   boolean inputIsDogBarking) {

            this.yearsOld = inputYearsOld;
            this.dogName = inputDogName;
            this.furColor = inputFurColor;
            this.isDogBarking = inputIsDogBarking;
        }
}
