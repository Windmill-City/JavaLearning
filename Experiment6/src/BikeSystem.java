public class BikeSystem {
    @SuppressWarnings("FieldCanBeLocal")
    private static class Bike{
        private final String markedCode;
        private final int policeDistrict;
        private final String address;

        Bike(String markedCode, int policeDistrict, String address) {
            this.markedCode = markedCode;
            this.policeDistrict = policeDistrict;
            this.address = address;
        }
    }

    public static void main(String[] args) {
        new Bike("AXB", 19, "14 Kings Road");
    }
}
