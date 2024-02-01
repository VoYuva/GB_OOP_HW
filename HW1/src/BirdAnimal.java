package HW1.src;

public class BirdAnimal extends Animal{
    public BirdAnimal(String name) {
        super(name);
    }

    public void toGo(){
        System.out.println(name + " is going");
    }

    public void fly(){
        System.out.println(name + " is flying");
    }

    public void swim(){
        System.out.println(name + " cannot swimming");
    }
}
