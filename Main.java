import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int queueSize = 10;
        int innocent = (int)(Math.random()*10);

        for(int i = 0; i<queueSize; i++){
            if(i==innocent){
                q.add(1);
            }
            else{
                q.add(0);
            }
        }
        System.out.println("Welcome to Save the Innocent!");
        System.out.println("Guess the position of the innocent (0 to " + (queueSize - 1) + ").");
        System.out.println("The person at the front of the line is killed with each wrong guess.");

        while(!q.isEmpty()){
            System.out.println("\nThere are " + q.size() + " people left. Guess their position (0 to " + (q.size() - 1) + ").");
            System.out.print("Enter your guess: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume the invalid input
                continue; // Skip to the next loop iteration
            }

            int guess = scanner.nextInt();

            if (guess < 0 || guess >= q.size()) {
                System.out.println("Invalid guess. The position must be between 0 and " + (q.size() - 1) + ".");
                continue;
            }

            if (guess == innocent) {
                System.out.println("You win! You saved the innocent!");
                break;
            } else {
                if (guess > innocent) {
                    System.out.println("Too high.");
                } else {
                    System.out.println("Too low.");
                }

                // Kill the person at the front of the line
                int front = q.poll();
                if (front == 1) {
                    System.out.println("You lose! The innocent was killed.");
                    break;
                }

                // The innocent's position shifts
                innocent--;
            }
        }

        System.out.println("Thnakx for playing");
    }
}
