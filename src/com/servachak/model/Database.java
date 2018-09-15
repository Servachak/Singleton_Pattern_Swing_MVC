package com.servachak.model;

public class Database {
/*Перший спосіб створити Singleton*/
    private static Database instance = new Database();

    public Database() {
    }

    public static Database getInstance() {
        return instance;
    }

    /*Другий спосіб створити Singleton*/
    private static Database instanceNew;

/*Такий метод називається Lazy Initialization (лінива ініціалізація)
 *тому що створення нового обєкта названо визначенням яке не відбувається
  *  до того моменту до поки не викликається метод getInstanceNew()*/
    public static Database getInstanceNew() {

        if (instanceNew == null){
            instanceNew = new Database();
        }
        return instanceNew;
    }
}
