// a simple high low number guessing game for JShell
//
import java.util.Random;
import java.util.Scanner;

class TooHighTooLow {
    private int number = 0;
    private int guesses = 0;
    private int difference = Math.abs(number - guesses);

    public TooHighTooLow() {
        // setup number to be a random number from 1 to 100
        // TODO: Create a Random object
        // TODO: Set this.number to a random integer from 1 to 100 (hint: use nextInt)
        // TODO: Set this.guesses to 0
        Random random = new Random();
        this.number = random.nextInt(2) + 1;
        this.guesses = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // TODO: Get a number guess from the user (between 1 and 100)
            // TODO: Print a prompt asking for a guess
            // TODO: Read an integer from the scanner and store it in a variable called guess
            System.out.println("Good Luck!");
            System.out.print("Make a guess:");
            int guess = scanner.nextInt();

            // TODO: Get a number guess from the user (between 1 and 100)
            String input = scanner.nextLine();
            //int numberguess = Integer.parseInt(input);

            // TODO: Increment the number of guesses by 1
            this.guesses = this.guesses + 1;

            // TODO: Check if the guess equals the secret number
            // TODO: If correct, print a congratulations message with the number of guesses
            // TODO: Exit the loop using break
            if (guess == this.number) {
                System.out.println("NICE YOU GOT IT!!");
            }
            else if (Math.abs(number - guesses) <= 4) {
                System.out.println("You're within 4 numbers!");
            }
            else if (guesses < number) {
                System.out.println("Too Low.");
            }
            else {
                System.out.println("Too High.");
            }
                //break;

            // TODO: Check if the guess is less than the secret number
            // TODO: If so, print "Too low!"

            // TODO: Check if the guess is greater than the secret number
            // TODO: If so, print "Too high!"

            // TODO: Check if the player has made 10 or more guesses
            // TODO: If so, print a message saying they've run out of guesses and reveal the number
            if (difference <= 4) {
                System.out.println("🔥 You're within 4 numbers!");
            }
            // TODO: Exit the loop using break
            if (this.guesses == 5) {
                System.out.println("No more guesses.");
                System.out.println("-_- Try Again -_-");
                break;
            }
        }
        System.out.println("Thanks for playing");

    }

    public static void main(String[] args) {
        TooHighTooLow game = new TooHighTooLow();
        game.play();
    }
}

// Run the game
TooHighTooLow.main(null);
/exit
