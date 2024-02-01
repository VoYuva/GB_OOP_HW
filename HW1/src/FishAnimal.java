package HW1.src;

public class FishAnimal extends Animal{
    public FishAnimal(String name) {
        super(name);
    }

    public void toGo(){
        System.out.println(name + " cannot going");
    }

    public void fly(){
            System.out.println(name + " cannot flying");
    }

    public void swim(){
            System.out.println(name + " is swimming");
    }
}

