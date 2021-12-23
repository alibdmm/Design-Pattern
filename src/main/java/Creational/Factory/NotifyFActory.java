package Creational.Factory;

public class NotifyFActory {
    public INotify CreateNotfiy(String notifyType){
        if(notifyType == "SMS"){
            return  new SmsNotify("sms");
        }
        if(notifyType == "MAIL"){
            return  new MailNotify();
        }
        return null;
    }
}
