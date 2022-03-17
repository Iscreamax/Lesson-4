public class Samsung extends MobilePhone implements IInstallingApplication,IUpdate,IMakePhoto,IMakeVideo,ISendMessage {
    public Samsung(int model, String version, Memory memory, Battery battery, Display display, Cpu cpu, int price) {
        super(model, version, memory, battery, display, cpu, price);
    }

    public String toString() {
        return ("Samsung " + getModel() + "/" + getVersion() + "/" + getMemory().getCapacity() + "Gb/"
                + getBattery().getCapacity() + "mah/" + getDisplay().getInch() + "inh/" + getCpu().getFrequency() +
                "Ggz/price -" + getPrice() + "$");
    }
    @Override
    public void turnOnMobile() {
        System.out.println("Samsung enabled");
    }

    @Override
    public void registration(Client client) {
        System.out.println("The user "+client.getFirstName()+" "+client.getSurname() +" is registered via Samsung");
    }

    @Override
    public void installingApplication() {
        System.out.println("Install application via Play Market");
    }

    @Override
    public void update() {
        System.out.println("Android updated");
    }

    @Override
    public void sendMessage(Message message,Client firstClient,Client secondClient) {
        System.out.println("Dear "+ secondClient.getFirstName()+secondClient.getSurname()+secondClient.getPatronymic()+", "+
                "It's "+ firstClient.getFirstName()+firstClient.getSurname()+firstClient.getPatronymic()+", "+message.getLetterField());
    }

    @Override
    public void makeVideo() {
        System.out.println("Shot a video in FullHD");
    }

    @Override
    public void makePhoto() {
        System.out.println("The photo was taken on a 15 Mp, 22mm camera");
    }

    @Override
    public void internetConnection() {
        System.out.println("5G works here");;
    }

}
