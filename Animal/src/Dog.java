public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, int tail, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.coat = coat;
    }


    public void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("Dog.eat() called");
        chew();
    }


    public void walk(){
        System.out.println("Dog.walk is called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run is called");
        move(10);
    }


    @Override
    public void move(int speed) {
        System.out.println("Dog.move is moving at a speed of: " + speed);
    }
}
