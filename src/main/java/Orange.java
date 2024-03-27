public class Orange extends Fruit {

    public Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        String info = "Апельсин: Вес - " + getWeight();
        return info;
    }
}