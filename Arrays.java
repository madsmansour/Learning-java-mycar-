import  java.lang.reflect.Array;

public class Arrays {

    public static void main(String args[]) {
        // 31, 45, 22 , 98 , 10
        int[] numbers = new int[5];

        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        Arrays.sort((numbers));

        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {31, 45, 22, 98, 10};
        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
        System.out.println("Index 1: " + myFavoriteCandyBars[1]);
        myFavoriteCandyBars[2] = "Snickers";
                System.out.println("Index 2: " + myFavoriteCandyBars[2]);
        System.out.println("Length: " + myFavoriteCandyBars.length);

        System.out.println(Array.get(myFavoriteCandyBars, 2));
    }
}
