package Creational.Factory;

import Creational.Factory.User;

public interface INotify {
    void SendNotification(User user);
}

/*
* interface ler içinde sadece boş metotlar barındırna yapılardır extends edilemez implment edilir
* içindeki tüm metotlar implements edilen class ta kullanılmak zorundadır
* */