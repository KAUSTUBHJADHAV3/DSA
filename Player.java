package DSA;

public class Player {
    String name;
    int guess;

    Player(String name){
        this.name = name;
    }

    void MakeGuess(){
        guess = (int)(Math.random()*10);
        System.out.println(name + " is guessing "+guess);
    }
}