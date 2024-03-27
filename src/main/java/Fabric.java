import java.util.ArrayList;

public class Fabric {

    public static Apple generateApple(){
        Apple apple = new Apple();
        return apple;
    }

    public static Orange generateOrange(){
        Orange orange = new Orange();
        return orange;
    }

    public static ArrayList<Fruit> generateFruits(int count){
        ArrayList<Fruit> fruit = new ArrayList<>();
        int length = count / 2;

        if (count % 2 != 0) {
            fruit.add(generateApple());
        }

        for (int i = 0; i < length; i++) {
            fruit.add(generateApple());
        }
        for (int i = 0; i < length; i++) {
            fruit.add(generateOrange());
        }
        return fruit;
    }

    public static ArrayList<Apple> generateApples(int count){
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            apples.add(generateApple());
        }
        return apples;
    }

    public static ArrayList<Orange> generateOranges(int count){
        ArrayList<Orange> oranges = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            oranges.add(generateOrange());
        }
        return oranges;
    }

    public static ArrayList<Apple> getApples(ArrayList<Fruit> fruits) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) {
                apples.add((Apple)fruit);
            }
        }
        return apples;
    }

    public static ArrayList<Orange> getOranges(ArrayList<Fruit> fruits) {
        ArrayList<Orange> oranges = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit instanceof Orange) {
                oranges.add((Orange)fruit);
            }
        }
        return oranges;
    }
}
