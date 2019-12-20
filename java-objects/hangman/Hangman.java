public class Hangman{

    public static void main(String[] args) {
        Game game = new Game("treehouse");
        Prompter prompter = new Prompter(game);
        
        // Continue to prompt user for input as long as they have tries remaining.
        while (game.getRemainingTries() > 0) {
            prompter.promptForGuess();
            prompter.displayProgress();
        }
    }
}
