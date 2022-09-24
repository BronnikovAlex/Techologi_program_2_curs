package lab1;

public abstract class Animal {
    protected String name;
    protected Integer distr;
    protected Integer dists;

    public Animal() {}

    public Animal(String _name, Integer _distr, Integer _dists) {
        this.name = _name;
        this.distr = _distr;
        this.dists = _dists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistr() {
        return distr;
    }

    public void setDistr(Integer distr) {
        this.distr = distr;
    }

    public Integer getDists() {
        return dists;
    }

    public void setDists(Integer dists) {
        this.dists = dists;
    }

    public void run(Integer distance) {
        if (distr >= distance) System.out.println(name + " пробежал дистанцию " + distance + " м");
        else System.out.println(name + " не пробежал дистанцию " + distance + " м");
    }
    public void swim(Integer distance) {
        if (dists >= distance) System.out.println(name + " проплыл дистанцию " + dists + " м");
        else System.out.println(name + " не проплыл дистанцию " + dists + " м");
    }

}
