public class Fish extends Animal {
    private String name;

    public Fish() {
        super(0);
    }

    public void eat() {
        System.out.println("The fish is eating.");
    }

    // Override walk method to specify that fish can't walk
    public void walk() {
        System.out.println("Fish can't walk.");
    }

    public void play() {
        System.out.println("The fish is playing.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
