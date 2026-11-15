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

        System.out.println("==============================================");
        System.out.println("        FISH AQUARIUM (STACK / LIFO)");
        System.out.println("==============================================");

        // Step 1: add the fish
        // The for loop walks through each position in the array.
        System.out.println();
        System.out.println("STEP 1: ADDING FISH");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < fishes.length; i++) {
            aquarium.addFish(fishes[i]);
            System.out.println("Added #" + (i + 1) + " : " + fishes[i]);
        }

        // Step 2: size and next fish
        System.out.println();
        System.out.println("STEP 2: AQUARIUM STATUS");
        System.out.println("----------------------------------------------");
        System.out.println("Total fish in aquarium : " + aquarium.size());
        System.out.println("Next fish to remove    : " + aquarium.nextFish());

        // Step 3: remove the fish one by one until the aquarium is empty.
        // A while loop keeps running while the aquarium is not empty.
        System.out.println();
        System.out.println("STEP 3: REMOVING FISH (LAST IN, FIRST OUT)");
        System.out.println("----------------------------------------------");
        String order = "";
        int count = 1;
        while (!aquarium.isEmpty()) {
            Fish f = aquarium.undoFish();
            System.out.println("Removal " + count + " of 8 -> " + f);
            f.swim();
            f.blowBubbles();
            System.out.println();

            // keep the name for the summary at the end
            String fishName = getName(f);
            order = order + fishName;
            if (!aquarium.isEmpty()) {
                order = order + " -> ";
            }
            count++;
        }

        // Step 4: final check and summary
        System.out.println("STEP 4: SUMMARY");
        System.out.println("----------------------------------------------");
        System.out.println("Removal order : " + order);
        System.out.println("Aquarium empty? " + aquarium.isEmpty());
        System.out.println("Aquarium size : " + aquarium.size());
        System.out.println("==============================================");
    }

    // Gets just the name out of the fish text, e.g. "Goldfish [name=Goldie, ...]" -> "Goldie".
    // Done this way so the Fish interface does not need an extra method.
    private static String getName(Fish f) {
        String text = f.toString();
        int start = text.indexOf("name=") + 5;
        int end = text.indexOf(",", start);
        return text.substring(start, end);
    }
}
