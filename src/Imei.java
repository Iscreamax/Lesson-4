public final class Imei {
    public String IMEI ;

    public void getImei(MobilePhone mobilePhone){
        String result="";
        for (int i = 0; i < 15; i++) {
            String j;
            j = Integer.toString((int) (Math.random()*10));
            result=result+j;
        }
        IMEI=result;
        System.out.println("The IMEI of this "+mobilePhone+": is - "+IMEI );
    }
}
