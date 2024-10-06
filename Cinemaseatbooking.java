import java.util.Scanner;

public class Cinemaseatbooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        char[][] seats = new char[5][10];

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = 'O';
            }
        }

        while (true) {
            System.out.println("\nCinema Booking System");
            printSeats(seats);
            System.out.println("Enter row (0-4) and seat (0-9) to book, or -1 to exit:");

            int row = scanner.nextInt();
            if (row == -1) {
                break; 
            }
            int seat = scanner.nextInt();

       
            if (row < 0 || row >= seats.length || seat < 0 || seat >= seats[row].length) {
                System.out.println("Invalid seat selection. Please try again.");
            } else if (seats[row][seat] == 'X') {
                System.out.println("Seat already booked. Please choose another seat.");
            } else {
                // Book the seat
                seats[row][seat] = 'X';
                System.out.println("Seat booked successfully.");
            }
        }

        System.out.println("Thank you for using the Cinema Booking System!");
        scanner.close();
    }

    private static void printSeats(char[][] seats) {
        System.out.println("Current seat arrangement:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
