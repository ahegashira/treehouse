import java.io.Console;

class TreeStory {

    public static void main(String[] args) {

        Console console = System.console();
        // __Name__ is a __adjective__ __noun__. They are always __adverb__ __verb__.
        String ageAsString = console.readLine("How old are you?  ");
        int age = Integer.parseInt(ageAsString);
        if (age < 13) {
            // Insert exit code
            console.printf("Sorry, you must be at least 13 to use this program.\n");
            System.exit(0);
        }

        String name = console.readLine("Enter a name:  ");
        String adjective = console.readLine("Enter an adjective:  ");

        String noun;
        boolean isInvalidWord;
        do {
            noun = console.readLine("Enter a noun:  ");
            isInvalidWord = (noun.equalsIgnoreCase("dork") || 
                            noun.equalsIgnoreCase("jerk") ||
                            noun.equalsIgnoreCase("moron"));
            if (isInvalidWord) {
                console.printf("That language is not allowed. Try again. \n\n");
                }
        } while (isInvalidWord);
        

        String adverb = console.readLine("Enter an adverb:  ");
        String verb = console.readLine("Enter a verb ending with -ing:  ");
    
        console.printf("Your TreeStory:/n-----------------\n");
        console.printf("%s is a(n) %s %s.  ", name, adjective, noun);
        console.printf("They are always %s %s.\n", adverb, verb);

    }    
}
