# Running this project on Google Colab

Colab runs Python by default, so we install Java first and then use shell commands (a `!` at the start of a line) to compile and run the code. You only need a Google account.

## Steps

1. Go to [colab.research.google.com](https://colab.research.google.com) and click **New notebook**.
2. Paste each block below into its own cell and run the cells **in order** (play button or Shift+Enter).

### Cell 1: Install Java
```
!apt-get update -qq
!apt-get install -y default-jdk-headless -qq > /dev/null
!java -version
!javac -version
```
Both commands should print a version number.

### Cell 2: Download the project from GitHub
```
!git clone https://github.com/devnanny222/CKC211_Assignment1_FishAquarium.git
```

### Cell 3: Go into the project folder
```
%cd CKC211_Assignment1_FishAquarium
!ls
```
You should see `Fish.java`, `Goldfish.java`, `Guppy.java`, `Clownfish.java`, `Aquarium.java`, `AquariumDemo.java` and `README.md`.

### Cell 4: Compile and run
```
!javac *.java
!java AquariumDemo
```
`javac` prints nothing if the code compiles. Then `java AquariumDemo` runs the program.

## Expected output

- 8 fish added (3 Goldfish, 2 Guppy, 3 Clownfish)
- `Aquarium size: 8`
- `Next fish to be removed: Clownfish [name=Coral, color=Yellow with stripes]`
- Fish removed one by one in reverse order (Coral, Flash, Marlin, Splash, Sunny, Nemo, Bubbles, Goldie), each one swimming and blowing bubbles
- `Aquarium empty? true` and `Aquarium size: 0`

The removal order is the reverse of the adding order because the Aquarium uses a Stack (LIFO).

## Getting the latest changes

If the code on GitHub is updated, run this in a new cell:
```
%cd /content/CKC211_Assignment1_FishAquarium
!git pull
!javac *.java
!java AquariumDemo
```
