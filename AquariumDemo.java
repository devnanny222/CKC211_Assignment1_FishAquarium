public class AquariumDemo {

    public static void main(String[] args) {

        // Created 8 fish objects and store them in an array.
        // The array type is Fish, so all different fish types can go in it.
        // Example of polymorphism: Goldfish, Guppy, and Clownfish are all treated as Fish objects.
        Fish[] fishes = new Fish[8];
        fishes[0] = new Goldfish("Goldie");
        fishes[1] = new Guppy("Bubbles");
        fishes[2] = new Clownfish("Nemo");
        fishes[3] = new Goldfish("Sunny");
        fishes[4] = new Guppy("Splash");
        fishes[5] = new Clownfish("Marlin");
        fishes[6] = new Goldfish("Flash");
        fishes[7] = new Clownfish("Coral");

        // Created the aquarium object that will hold the fish.
        Aquarium aquarium = new Aquarium();

        System.out.println("Adding fish:");
        for (int i = 0; i < fishes.length; i++) {
            aquarium.addFish(fishes[i]);
            System.out.println("  added " + fishes[i]);
        }

        // Add every fish in the array to the aquarium.
        // The for loop walks through each position in the array.
        // i starts at 0 and increases until it reaches fishes.length.
        System.out.println();
        System.out.println("Aquarium size: " + aquarium.size());
        System.out.println("Next fish to be removed: " + aquarium.nextFish());

        // Fish will remove one by one until the aquarium is empty.
        // A while loop keeps running as long as the condition is true.
        // Here, we keep removing fish while the aquarium is not empty.
        System.out.println();
        System.out.println("Removing fish one by one:");
        int count = 1;
        while (!aquarium.isEmpty()) {
            Fish f = aquarium.undoFish();
            System.out.println(count + ". " + f);
            f.swim();        // each fish swims
            f.blowBubbles(); // each fish makes bubbles
            count++;
        }

        // Final check: after all fish are removed, the aquarium should be empty.
        System.out.println();
        System.out.println("Aquarium empty? " + aquarium.isEmpty());
        System.out.println("Aquarium size: " + aquarium.size());
    }
}
