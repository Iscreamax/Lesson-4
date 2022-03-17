public class Iphone extends MobilePhone implements IMakePhoto,IMakeVideo,IUpdate,IInstallingApplication,ISendMessage{
    private boolean waterProof;

    public Iphone(int model, String version, Memory memory, Battery battery, Display display, Cpu cpu, int price,boolean waterProof) {
        super(model, version, memory, battery, display, cpu, price);
        this.waterProof = waterProof;
    }

    @Override
    public String toString() {
        return("Iphone "+ getModel() + "/" + getVersion()+"/"+getMemory().getCapacity()  + "Gb/"
                + getBattery().getCapacity()+ "mah/"+getDisplay().getInch()+"inh/"+getCpu().getFrequency()+
                "Ggz/price -"+getPrice() + "$"+" WaterProof - "+ waterProof);
    }

    @Override
    public void turnOnMobile() {
        System.out.println("Iphone enabled");
    }

    @Override
    public void registration(Client client) {
        System.out.println("The user "+client.getFirstName()+" "+client.getSurname() +" is registered via Iphone");
    }

    @Override
    public void installingApplication() {
        System.out.println("Install application via App store");
    }

    @Override
    public void update() {
        System.out.println("iOs updated");
    }

    @Override
    public void sendMessage(Message message,Client firstClient,Client secondClient) {
        System.out.println("Dear "+ secondClient.getFirstName()+secondClient.getSurname()+secondClient.getPatronymic()+", "+
                "It's "+ firstClient.getFirstName()+firstClient.getSurname()+firstClient.getPatronymic()+", "+message.getLetterField());
    }

    @Override
    public void makeVideo() {
            System.out.println("Shot a video in 4K");
    }

    @Override
    public void makePhoto() {
        System.out.println("The photo was taken on a 12 Mp, 26mm camera");
    }

    @Override
    public void internetConnection() {
        System.out.println("5G works here");;
    }

}