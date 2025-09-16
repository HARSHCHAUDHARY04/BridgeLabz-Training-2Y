public class hotel_booking_system {
    private String guestName;
    private String roomType;
    private int nights;


    public hotel_booking_system() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

 
    public hotel_booking_system(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }


    public hotel_booking_system(hotel_booking_system other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
 
        hotel_booking_system defaultBooking = new hotel_booking_system();
        System.out.println("Default Booking Details:");
        defaultBooking.displayBookingDetails();

 
        hotel_booking_system paramBooking = new hotel_booking_system("John Doe", "Deluxe", 3);
        System.out.println("\nParameterized Booking Details:");
        paramBooking.displayBookingDetails();


        hotel_booking_system copyBooking = new hotel_booking_system(paramBooking);
        System.out.println("\nCopied Booking Details:");
        copyBooking.displayBookingDetails();
    }
}