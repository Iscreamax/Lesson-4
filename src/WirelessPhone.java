public class WirelessPhone extends Phone {
    public WirelessPhone(int model, String version, int price) {
        super(model, version, price);
    }

    public void satelliteConnection(){
        System.out.println("The connection with the satellite is established!");
    }
}
