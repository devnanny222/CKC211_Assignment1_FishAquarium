import java.util.NoSuchElementException;
import java.util.Stack;

//Aquarium keeps the fish in a Stack.
 
// Reason using Stack:
// 1) A stack only works at one end, the top. 
// 2) addFish() pushes a fish on top and undoFish() pops the fish on top. 
// 3) A stack is LIFO (Last In,First Out), so the fish added last is the first one taken out, and the fish added first comes out last. 
// 4) This fits undoFish() because "undo" should cancel the most recent addition first.
       // Example: add Goldie, then Bubbles, then Nemo.
                // The removal order is Nemo, Bubbles, Goldie.
       // Invariant: the top of the stack is the fish added most recently.
                  // An empty aquarium means the stack has no fish.

public class Aquarium {

    private Stack<Fish> fishes = new Stack<>();

    //  Adds a fish on top of the aquarium.
    //  @param fish the fish to add
    public void addFish(Fish fish) {
        fishes.push(fish);
    }

    //  Removes and returns the fish that was added last.
    //  return the removed fish
    //  throws NoSuchElementException if the aquarium is empty
    public Fish undoFish() {
        if (fishes.isEmpty()) {
            throw new NoSuchElementException("Aquarium is empty");
        }
        return fishes.pop();
    }


    //  Returns the fish that will be removed next, without removing it.
    //  return the fish on top
    //  throws NoSuchElementException if the aquarium is empty
    public Fish nextFish() {
        if (fishes.isEmpty()) {
            throw new NoSuchElementException("Aquarium is empty");
        }
        return fishes.peek();
    }

    public boolean isEmpty() {
        return fishes.isEmpty();
    }

    public int size() {
        return fishes.size();
    }
}