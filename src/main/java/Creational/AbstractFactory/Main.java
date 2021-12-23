package Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        CustomOperation customOperation = new CustomOperation(new OracleDatabaseFactor());
        customOperation.RemoveById(1);
    }
}
/**
 * Bu tasarım kalıbın amacı factor deki gib aynı class tan soyutlanmımş class ları tek bir çatı altında toplamak ama burada daha büyük bir organizosyon vardır
 */
