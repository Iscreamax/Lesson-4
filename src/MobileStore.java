import java.util.Scanner;

public final class MobileStore {
    public final String imei;
    public static int purchasedMobile = 0;
    public static final String workingTime = "Yes";

    static {
        System.out.print("Does the Mobile Store open?(Yes/No) ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equals(workingTime)) {
            System.out.println("You are welcome!");
        } else {
            System.out.println("The Mobile Store is closed.Come back later!");
            Runtime.getRuntime().exit(0);
        }

    }

    public static void purchased() {
        System.out.println("\n" + "Number of phones purchased today: " + purchasedMobile);
    }

    public MobileStore(MobilePhone mobilePhone, Client client) {
        String result = "";
        for (int i = 0; i < 15; i++) {
            String j;
            j = Integer.toString((int) (Math.random() * 10));
            result = result + j;
        }
        imei = result;
        mobilePhone.setImei(imei);
        System.out.println(client.getFirstName() + " " + client.getSurname() + ", you've purchased the phone - " + mobilePhone.toString());
        System.out.println("The IMEI of this phone is - " + imei);
        purchasedMobile++;
    }


}

