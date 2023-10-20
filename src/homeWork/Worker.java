package homeWork;/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников
 - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник
 */

import java.util.ArrayList;
import java.util.List;

class Worker {
    private int Id;
    private String phoneNumber;
    private String name;
    private int experience;

    public Worker(int personnelNumber, String phoneNumber, String name, int experience) {
        this.Id = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getId() {
        return Id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }


    public void setId(int id) {
        this.Id = id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Справочник сотрудников{" +
               "Табельный номер" + Id +
               ", номер телефон" + phoneNumber +
               ", Имя'" + name + '\'' +
               ", Стаж" + experience +
               '}';
    }






}






