public class Example {
    public static void main(String[] args) {

        System.out.println("We are making a new PEZ Dispenser.");

        System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser. %n", 
                            PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Yoda");

        System.out.printf("The dispenser is %s. %n", 
                            dispenser.getCharacterName());

        if (dispenser.isEmpty()) {
            System.out.println("Dispenser is empty.");
        }

        try {
        System.out.println("Filling the dispenser with delicious PEZ....");
        dispenser.fill(13);
        } catch(IllegalArgumentException iae) {
            System.out.println("Whoa there!");
            System.out.printf("The error was %s %n", iae.getMessage());
        }

        if (!dispenser.isEmpty()) {
            System.out.println("The dispenser is full.");
        } 
        
        while (dispenser.dispense()) {
            System.out.println("CHOMP!");
        }
        if (dispenser.isEmpty()) {
            System.out.println("You ate all the PEZ");
        }

        
    }
}
