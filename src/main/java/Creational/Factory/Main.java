package Creational.Factory;

public class Main {
    public static void main(String[] args) {
        SmsNotify smsNotify = (SmsNotify) new NotifyFActory().CreateNotfiy("SMS");
        System.out.println(smsNotify.getType());

        INotify notify = new SmsNotify("test"); //poliymorphism örnegi sayılır üst nesne kullanılarak alt nesne refere edilerek oluşturlulan nesne
    }
}
/**
 * Bu tasarım kalıbın amacı aynı class tan soyutlanmış classları tek bir noktada create etektir
 * avantajlarından bir tanesi kod kısalmaya yarar
 */
