package HW1.src;

public class Main {
    public static void main(String[] args){
        Animal cat = new CatAnimal("Kitty");
        Animal fish = new FishAnimal("Nemo");
        Animal bird = new BirdAnimal("Faust");

        cat.toGo();
        bird.fly();
        fish.swim();

        cat.swim();
        cat.fly();
        bird.swim();
        fish.toGo();



    }
}
