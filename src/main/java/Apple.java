public class Apple extends Fruit {

    public Apple() {
        super(1.0f);
    }

    @Override
    public String toString() {
        String info = "Яблоко: Вес - " + getWeight();
        return info;
    }
}