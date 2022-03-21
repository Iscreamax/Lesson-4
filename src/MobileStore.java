import java.util.Scanner;

public final class MobileStore {
    public final String imei;
    public static int purchasedMobile = 0;
    public static final String WORKING_TIME = "Yes";


    static {
        System.out.print("Does the Mobile Store open?(Yes/No) ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equals(WORKING_TIME)) {
            System.out.println("You are welcome!");

        } else {
            System.out.println("The Mobile Store is closed.Come back later!");
            Runtime.getRuntime().exit(0);
        }
        scanner.close();
    }

    public String createImei() {
        String result = "";
        for (int i = 0; i < 15; i++) {
            String j;
            j = Integer.toString((int) (Math.random() * 10));
            result = result + j;
        }
        return result;
    }

    public void buying(MobilePhone mobilePhone, Client client) {
        System.out.println(client.getFirstName() + " " + client.getSurname() + ", you've purchased the phone - " + mobilePhone.toString());
        System.out.println("The IMEI of this phone is - " + imei);
    }

    public static void purchased() {
        System.out.println("\n" + "Number of phones purchased today: " + purchasedMobile);
    }

    public MobileStore(MobilePhone mobilePhone) {
        imei = createImei();
        mobilePhone.setImei(imei);
        purchasedMobile++;
    }


}

