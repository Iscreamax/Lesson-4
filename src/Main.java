import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Memory memory = new Memory("Profit",256);
        Battery batteryIphone = new Battery("Apple",3300);
        Display displayIphone = new Display("Samsung","Oled",6.1);
        Cpu cpuIphone = new Cpu("Bionic",2.7);
        Battery batterySamsung = new Battery("Samsung",4300);
        Display displaySamsung = new Display("Samsung","Oled",6.4);
        Cpu cpuSamsung = new Cpu("Exynos",2.9);
        Client firstClient = new Client("Jack ","Vorobey ","Aleksandrovich");
        Client secondClient= new Client("Valet ","Kozirny ","Albertovich");
        Message message = new Message("I'm going to be late for work, I'm sorry!");
        Iphone iphone = new Iphone(13,"Pro",memory,batteryIphone,displayIphone,cpuIphone,1350,true);
        Samsung samsung = new Samsung(21,"S",memory,batterySamsung,displaySamsung,cpuSamsung,1270);
        System.out.println(iphone.toString());
        System.out.println(memory.toString());
        System.out.println(batteryIphone.toString());
        System.out.println(displayIphone.toString());
        System.out.println(cpuIphone.toString());
        System.out.println("");
        System.out.println("Sending a message:");
        iphone.sendMessage(message,firstClient,secondClient);
        System.out.println("Making a call:");
        iphone.makeCall(firstClient,secondClient);
        System.out.println("We change names and make a call:");
        firstClient.setFirstName("Max ");
        secondClient.setFirstName("Oleg ");
        iphone.makeCall(firstClient,secondClient);
        //Включаем Iphone
        //Устанавливаем соединение Iphone  со спутник
        //Устанавливаем интернет соединение Iphone
        //Регистрируем пользователя
        //Установка приложение в App store
        //Обновляем Iphone
        //Делаем фото на Iphone
        //Снимаем видео на Iphone
        //Звонок с службу 911 с Iphone
        System.out.println("\n"+"Iphone manipulation"+"\n");
        iphone.turnOnMobile();
        iphone.satelliteConnection();
        iphone.internetConnection();
        iphone.registration(firstClient);
        iphone.update();
        iphone.installingApplication();
        iphone.makePhoto();
        iphone.makeVideo();
        iphone.alarmCall();
        //Включаем Samsung
        //Устанавливаем соединение Samsung  со спутник
        //Устанавливаем интернет соединение Samsung
        //Регистрируем пользователя
        //Установка приложение в Play Market
        //Обновляем Samsung
        //Делаем фото на Samsung
        //Снимаем видео на Samsung
        //Звонок с службу 911 с Samsung
        System.out.println("\n"+"Samsung manipulation "+"\n");
        samsung.turnOnMobile();
        samsung.satelliteConnection();
        samsung.internetConnection();
        samsung.registration(secondClient);
        samsung.installingApplication();
        samsung.update();
        samsung.makePhoto();
        samsung.makeVideo();
        samsung.alarmCall();

    }
}
