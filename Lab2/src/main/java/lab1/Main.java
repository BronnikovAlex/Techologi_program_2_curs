package lab1;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик",500,10);
        Cat catTuzik = new Cat("Тузик",200,0);
        Tiger tigerBarsik = new Tiger("Барсик",1000,50);
        Animal[] array1 = {dogBobik,catTuzik,tigerBarsik};


        System.out.print("Участники: ");
        for (Animal x : array1) {
            System.out.print(x.getName() + "; ");
        }
        System.out.println("");
        System.out.println("");

        System.out.println("Забег на дистанцию 500м");
        for (Animal x : array1) {
            x.run(500);
        }
        System.out.println("");

        System.out.println("Плавание на дистанцию 50м");
        for (Animal x : array1) {
            x.swim(50);
        }
    }
}