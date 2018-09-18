import  java.lang.reflect.Array;

public class Arrays {

    public static void main(String args[]) {
        // 31, 45, 22 , 98 , 10
        int[] numbers = new int[5];
        // fortæller at der er 5 index med forskellige tal

        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;
        // putter talene i index fra 0-4

        Arrays.sort((numbers));

        System.out.println(Arrays.toString(numbers));
        // viser tallene i nummerede rækkefølge

        int[] numbers2 = {31, 45, 22, 98, 10};
        // sætter tallene i index på en nemmere måde

        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
        // sætter ynglings candybars i rækkefølge
        System.out.println("Index 1: " + myFavoriteCandyBars[1]);
        // printer index 1 candybar til skærm dvs. "Hershey's" da "Twix" = 0
        myFavoriteCandyBars[2] = "Snickers";
        // her ændre jeg index = 2 til Snickers
                System.out.println("Index 2: " + myFavoriteCandyBars[2]);
                // her printer den index 2 ud = Snickers
        System.out.println("Length: " + myFavoriteCandyBars.length);
        // her printer den antal af favoritecandybars ud

        System.out.println(Array.get(myFavoriteCandyBars, 2));
    }
}
