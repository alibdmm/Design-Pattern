package Creational.Factory;

public class SmsNotify implements INotify{
    private String type;
    @Override
    public void SendNotification(User user) {
        //sms gönderme işlemleri
    }

    public SmsNotify(String type){
        this.type =type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
