# CKC211_Assignment1_FishAquarium
CKC212 Assignment 1: Java aquarium program using a Fish ADT, concrete fish classes and a Stack-based Aquarium.

- **Course:** CKC212 Data Structures, School of Computer Sciences
- **Name:** NAVITHA
- **Language:** Java

## About

This assignment starts from a short aquarium video with eight fish: goldfish (yellow), guppies (blue) and clownfish (yellow with stripes). I watched the video, found the behaviors the fish have in common, turned them into an Abstract Data Type (ADT), then built concrete fish classes and a small aquarium program on top of it.

## What the fish do in the video

1. They **swim** across the tank.
2. They **blow bubbles**.

These two behaviors became the operations in the `Fish` interface.

## Files

| File | What it does |
|---|---|
| `Fish.java` | The Fish ADT (interface) with `swim()` and `blowBubbles()` |
| `Goldfish.java` | Concrete class, implements `Fish` |
| `Guppy.java` | Concrete class, implements `Fish` |
| `Clownfish.java` | Concrete class, implements `Fish` |
| `Aquarium.java` | Stores the fish using a `Stack<Fish>` |
| `AquariumDemo.java` | Demo program with `main` |

## Design

- **ADT:** `Fish` only says what a fish can do. Each species decides how it does it.
- **Concrete types:** each class has a constructor, private fields, accessors (`getName()`, `getColor()`) and a `toString()`. The constructor rejects an empty name.
- **Aquarium:** uses Java's built-in `Stack`. Operations are `addFish`, `undoFish`, `nextFish`, `isEmpty` and `size`. `undoFish()` and `nextFish()` throw `NoSuchElementException` if the aquarium is empty.
- **Why a Stack?** A stack is LIFO (Last In, First Out), so the last fish added is the first one removed. This matches `undoFish()`, which cancels the most recent addition. For example, if I add Goldie, Bubbles and Nemo, they are removed as Nemo, Bubbles, Goldie.

## Demo program

`AquariumDemo` creates exactly eight fish stored as `Fish` (3 goldfish, 2 guppies, 3 clownfish). It then:

1. adds all eight fish to the aquarium
2. prints the aquarium size
3. prints the next fish to be removed
4. removes the fish one by one, calling `swim()` and `blowBubbles()` on each
5. shows the order they were removed in

## How to run

Make sure the JDK (17 or newer) is installed.

```
javac *.java
java AquariumDemo
```

Or open the folder in VS Code and click **Run** above `main` in `AquariumDemo.java`.

## Sample output

```
Aquarium size: 8
Next fish to be removed: Clownfish [name=Coral, color=Yellow with stripes]

Removing fish one by one:
1. Clownfish [name=Coral, color=Yellow with stripes]
Coral the clownfish wiggles from side to side as it swims
Coral the clownfish puffs out a quick burst of bubbles
...
```

## What I learned

- An ADT describes *what* something can do, and the concrete classes decide *how*. Because `Goldfish`, `Guppy` and `Clownfish` all implement `Fish`, I can store them together in one `Fish` reference and call the same methods on each.
- A stack is LIFO, so `undoFish()` removes the most recently added fish first. `nextFish()` uses `peek()` so I can look at the next fish without removing it.
- Keeping fields private and checking the name in the constructor means a fish can never be created in an invalid state.

## AI use disclosure

I used an AI assistant (Claude) to help me understand the assignment, plan the class design and check my code. I set up and ran the program in a Java coding app, went through each file, and made changes so that I understand how it works. The lecture notes on ADT and Stacks were used as the reference for the coding style.

> The files were uploaded to this repository on 15 November 2026.
