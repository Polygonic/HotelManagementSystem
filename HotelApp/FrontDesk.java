public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void checkIn(String guestName, String plateNumber, int numberOfCarts) {
        System.out.println("=== Check-in: " + guestName + " ===");
        cart.requestCart(numberOfCarts);
        valet.parkVehicle(plateNumber);
    }

    public void checkOut(String guestName, String plateNumber, int roomNumber, int numberOfCarts) {
        System.out.println("=== Check-out: " + guestName + " ===");
        cart.requestCart(numberOfCarts);
        valet.pickUpVehicle(plateNumber);
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestValetPickUp(String plateNumber) { valet.pickUpVehicle(plateNumber); }
    public void requestRoomCleaning(int roomNumber)    { houseKeeping.cleanRoom(roomNumber); }
    public void requestLuggageCarts(int numberOfCarts) { cart.requestCart(numberOfCarts); }
}
