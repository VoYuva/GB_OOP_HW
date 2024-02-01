package HW1.src;

public abstract class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }



    public abstract void toGo();

    public abstract void fly();

    public abstract void swim();

}
