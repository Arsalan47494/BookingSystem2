import java.util.Scanner;

public class Cinemabooking {
    public static void main(String[] args) {
       
        String[] movies = {"Fast And Furios", "Batman", "Interstellar"};
        int[] availableSeats = {10, 5, 0}; 
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to the Cinema Booking System!");
            System.out.println("Available Movies:");

            for (int i = 0; i < movies.length; i++) {
                System.out.println((i + 1) + ". " + movies[i] + " (" + availableSeats[i] + " seats available)");
            }
            System.out.print("Select a movie by number or enter 0 to exit: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for using the Cinema Booking System!");
                break;
            }
            if (choice < 1 || choice > movies.length) {
                System.out.println("Invalid choice. Try Again");
                continue;
            }
            int movieIndex = choice - 1;
            if (availableSeats[movieIndex] > 0) {
                
                availableSeats[movieIndex]--;
                System.out.println("Seat booked successfully for " + movies[movieIndex] + "!");
                System.out.println("Remaining seats: " + availableSeats[movieIndex]);
            } else {
                System.out.println("Sorry, no seats available for " + movies[movieIndex] + ".");
            }
        }
    }
}
