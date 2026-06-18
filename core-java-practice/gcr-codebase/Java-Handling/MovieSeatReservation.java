public class MovieSeatReservation {

    int seats[] = {101, 102, 103, 104, 105};

    public int getSeat(int index) {

        try {

            return seats[index];

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid Seat Position Requested!");

            return -1;
        }
    }

    public static void main(String[] args) {

        MovieSeatReservation movie = new MovieSeatReservation();

        int seatNumber = movie.getSeat(8);

        if (seatNumber != -1) {
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("Seat not available.");
        }
    }
}
