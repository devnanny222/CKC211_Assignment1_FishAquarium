// Guppy is a concrete class. It "implements Fish", so it must
// write the code for swim() and blowBubbles() from the Fish interface.
public class Guppy implements Fish {

    // private = other classes cannot change these directly (encapsulation)
    private String name;
    private String color;

    // Constructor: runs when we write new Guppy("name")
    public Guppy(String name) {
        // Check the name first so we never make a fish without a name
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Fish must have a name");
        }
        this.name = name;      // "this.name" is the field, "name" is the parameter
        this.color = "Blue";     // every guppy has the same colour
    }

    // Accessor (getter): lets other classes read the name
    public String getName() {
        return name;
    }

    // Accessor (getter): lets other classes read the colour
    public String getColor() {
        return color;
    }

    // Behaviour 1 from the video: the fish swims
    @Override
    public void swim() {
        System.out.println(name + " the guppy darts quickly through the water");
    }

    // Behaviour 2 from the video: the fish blows bubbles
    @Override
    public void blowBubbles() {
        System.out.println(name + " the guppy lets out a few tiny bubbles");
    }

    // Called automatically when we print the object,
    // so it shows readable text instead of a memory address
    @Override
    public String toString() {
        return "Guppy [name=" + name + ", color=" + color + "]";
    }
}