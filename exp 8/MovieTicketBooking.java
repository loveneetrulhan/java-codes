import java.util.HashSet;

class SeatAlreadyBookedException extends Exception { //It is used to handle cases where a user tries to book a seat that is already taken
    private static final long serialVersionUID = 1L;

    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class MovieTicketBooking {
    private HashSet<Integer> bookedSeats = new HashSet<>(); // HashSet to store already booked seat numbers

    public void bookSeat(int seatNumber) throws SeatAlreadyBookedException {
        if (bookedSeats.contains(seatNumber)) { //If already booked: It throws SeatAlreadyBookedException with a message.

            throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked.");
        }
        bookedSeats.add(seatNumber);
        System.out.println("Seat " + seatNumber + " booked successfully.");
    }

    public static void main(String[] args) {
        MovieTicketBooking booking = new MovieTicketBooking();
        
        try {
            booking.bookSeat(10); // First time booking (Success)
            booking.bookSeat(10); // Booking the same seat again (Exception)
        } catch (SeatAlreadyBookedException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }
    }
}
