public class Main {
    public static void main(String[] args) {

        Memory memory = new Memory("Profit", 256);
        Battery batteryIphone = new Battery("Apple", 3300);
        Display displayIphone = new Display("Samsung", "Oled", 6.1);
        Cpu cpuIphone = new Cpu("Bionic", 2.7);
        Battery batterySamsung = new Battery("Samsung", 4300);
        Display displaySamsung = new Display("Samsung", "Oled", 6.4);
        Cpu cpuSamsung = new Cpu("Exynos", 2.9);
        Client firstClient = new Client("Jack ", "Vorobey ", "Aleksandrovich");
        Client secondClient = new Client("Valet ", "Kozirny ", "Albertovich");
        Message message = new Message("I'm going to be late for work, I'm sorry!");
        Iphone iphone = new Iphone(13, "Pro", memory, batteryIphone, displayIphone, cpuIphone, 1350, true);
        Samsung samsung = new Samsung(21, "S", memory, batterySamsung, displaySamsung, cpuSamsung, 1270);


        System.out.println(iphone.toString());
        System.out.println(memory.toString());
        System.out.println(batteryIphone.toString());
        System.out.println(displayIphone.toString());
        System.out.println(cpuIphone.toString());
        System.out.println("");
        System.out.println("Sending a message:");
        iphone.sendMessage(message, firstClient, secondClient);
        System.out.println("Making a call:");
        iphone.makeCall(firstClient, secondClient);
        System.out.println("We change names and make a call:");
        firstClient.setFirstName("Max ");
        secondClient.setFirstName("Oleg ");
        iphone.makeCall(firstClient, secondClient);

        //buy new Iphone
        //turn on Iphone
        //establish an iPhone connection with a satellite
        //registering a user
        //setting up an Iphone Internet connection
        //registering an account
        //installing the app in the App store
        //updating the Iphone
        //taking photos on Iphone
        //shooting a video on an Iphone
        //a call to the 911 service from an Iphone

        MobileStore newIphone = new MobileStore(iphone, firstClient);
        iphone.turnOnMobile();
        iphone.satelliteConnection();
        iphone.internetConnection();
        iphone.registration(firstClient);
        iphone.update();
        iphone.installingApplication();
        iphone.makePhoto();
        iphone.makeVideo();
        iphone.alarmCall();
        System.out.println("");

        //buy new Samsung
        //turn on Samsung
        //establish a Samsung connection with a satellite
        //registering a user
        //setting up a Samsung Internet connection
        //registering an account
        //installing the app in the Play Market
        //updating the Samsung
        //taking photos on Samsung
        //shooting a video on a Samsung
        //a call to the 911 service from a Samsung

        MobileStore newSamsung = new MobileStore(samsung, secondClient);
        samsung.turnOnMobile();
        samsung.satelliteConnection();
        samsung.internetConnection();
        samsung.registration(secondClient);
        samsung.installingApplication();
        samsung.update();
        samsung.makePhoto();
        samsung.makeVideo();
        samsung.alarmCall();
        MobileStore.purchased();


    }
}
