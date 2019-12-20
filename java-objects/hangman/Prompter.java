import java.util.Scanner;

class Prompter {
    private Game game;

    public Prompter(Game game) {
        this.game = game;
    }

    // Request guess from user and return to applyGuess
    public boolean promptForGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter:  ");
        String guessInput = scanner.nextLine();
        char guess = guessInput.charAt(0);
        return game.applyGuess(guess);
    }

    // Show progress of guesses
    public void displayProgress() {
        System.out.printf("You have %d tries left to try to solve: %s%n", 
            game.getRemainingTries(),
            game.getCurrentProgress()
            );
    }
}
