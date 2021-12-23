package Creational.AbstractFactory;

public abstract class Command {
    public abstract void ExecuteCommand(String query);

    public void testMetot(String test){
        System.out.println(test);
    }

}

/*
* Abstract class lar interface alternatif olarak oluşturulmuştur
* içinde hem boş metot olur hemde dolu metot
* içindeki abstrack metotlar alt class larda kullanılmak zorundadır diger metotlar için bu zorunluluk yoktur
* abstract metotların içi dolu olmamlıdır, diger metotlarında içi dolu olmalıdır
* abstract classlar extends edilebilir implements edilemez
* */