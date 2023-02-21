package com.javarush.task.task29.task2909.user;

import java.util.concurrent.atomic.AtomicInteger;

public class UserHelper {
    private User userAnya = new User("Аня", "Смирнова", 10);
    private User userRoma = new User("Рома", "Виноградов", 30);

//    private boolean isManAnya = false;
//    private boolean isManRoma = true;


    public void printUsers() {
        userAnya.printInfo();
//        System.out.println("Имя: " + userAnya.getName());
//        System.out.println("Фамилия: " + userAnya.getSurname());
        userAnya.printAdditionalInfo();

        userRoma.printInfo();
//        System.out.println("Имя: " + userRoma.getName());
//        System.out.println("Фамилия: " + userRoma.getSurname());
        userRoma.printAdditionalInfo();
    }

//    public void printAdditionalInfo(User user) {
//        if (user.getAge() < 16)
//            System.out.println("Пользователь моложе 16 лет");
//        else
//            System.out.println("Пользователь старше 16 лет");
//    }

//    private boolean ageLessThan16(User user) {
//        if (user.getAge() < 16) {
//            return true;
//        }
//        return false;
//    }

    public int calculateAverageAge() {
        // int age = 28;
        User userUra = new User("Юра", "Карп", 28);
        return (userAnya.getAge() + userRoma.getAge() + userUra.getAge()) / 3;
    }

    public int calculateRate(AtomicInteger base, int age, boolean hasWork, boolean hasHouse) {
        int result = base.get() + age / 100;
        result *= hasWork ? 1.1 : 0.9;
        result *= hasHouse ? 1.1 : 0.9;
        return result;
    }

    public String getBossName(User user) {
//        Work work = user.getWork();
//        return work.getBoss();
        return user.getBoss();
    }
}