import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;
    
    public Box(ArrayList<T> fruits) {
        this.fruits = new ArrayList<>(fruits);
    }
    
    public int countFruit(){
        return fruits.size();
    }
    
    public double getWeight(){
        double sum = 0;
        for (T t : fruits) {
            sum += t.getWeight();
        }
        return sum;
    }
    
    public ArrayList<T> getFruits() {
        ArrayList<T> result = this.fruits;
        this.fruits = new ArrayList<>();
        return result;
    }
    
    public ArrayList<T> getFruits(int count) {
        ArrayList<T> result = new ArrayList<>();
        while (count > 0) {
            result.add(this.fruits.get(count - 1));
            this.fruits.remove(count - 1);
            count--;
        }
        return result;
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }
    
    public void addFruits(ArrayList<T> fruits) {
        this.fruits.addAll(fruits);
    }
    
    public Boolean compare(Box box) {
        if (this.getWeight() == box.getWeight()) {
            return true;
        }
        else return false;
    }
    
    @Override
    public String toString() {
        String info = "Вес коробки - " + getWeight() + "\nДанные по фруктам: " +  fruits.toString();
        return info;

    }
}