package lab1;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String _name, Integer _distr, Integer _dists) {
        super(_name, _distr, _dists);
    }

    @Override
    public void swim(Integer distance) {
        System.out.println(name + " не умеет плавать");
    }
}
