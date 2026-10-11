public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.checkIn("Mr. Walter White", "KAL-3412", 2);
        System.out.println();
        frontDesk.checkOut("Mr. Walter White", "KAL-3412", 420, 1);
        System.out.println();
        frontDesk.requestRoomCleaning(420);
    }
}