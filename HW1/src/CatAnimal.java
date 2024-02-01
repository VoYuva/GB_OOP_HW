package HW1.src;

public class CatAnimal extends Animal{
    public CatAnimal(String name) {
        super(name);
    }

    public void toGo(){
        System.out.println(name + " is going");
    }

    public void fly(){
        System.out.println(name + " cannot flying");
    }

    public void swim(){
        System.out.println(name + " can swim, but hates it");
    }
}
