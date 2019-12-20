class Game {
    public static final int MAX_MISSES = 7;
    private String answer;
    private String hits;
    private String misses;

    // Track correct and incorrect guesses
    public Game(String answer) {
        this.answer = answer;
        hits = "";
        misses = "";
    }

    // Take user input and apply to correct or incorrect guesses
    public boolean applyGuess(char letter) {
        boolean isHit = answer.indexOf(letter) != -1;
        if (isHit) {
            hits += letter;
        } else {
            misses += letter;
        } 
        return isHit;
    }

    // Calculate number of guesses remaining
    public int getRemainingTries() {
        return MAX_MISSES - misses.length();
    }

    // Track progress of game to be displayed by displayProgress()
    public String getCurrentProgress() {
        String progress = "";
        for (char letter : answer.toCharArray()) {
            char display = '-';
            if (hits.indexOf(letter) != -1) {
                display = letter;
            }
            progress += display;
        }
        return progress;
    }
}
