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

class WorkerDirectory {
    private List<Worker> workers;

    public WorkerDirectory() {
        workers = new ArrayList<>();
    }

    public void addWorkers(int Id, String phoneNumber, String name, int experience) {
        Worker worker = new Worker(Id, phoneNumber, name, experience);
        workers.add(worker);
    }

    /*
    Добавить метод, который ищет сотрудника по стажу
    (может быть список)
    */
    public List<Worker> findByExperience(int experience) {
        List<Worker> matchingWorkers = new ArrayList<>();
        for (Worker worker : workers) {
            if (worker.getExperience() == experience) {
                matchingWorkers.add(worker);
            }
        }
        return matchingWorkers;
    }

    /*
    Добавить метод, который выводит номер телефона сотрудника
    по имени (может быть список)
     */
    public List<Worker> findPhoneNumberByName(String name) {
        List<Worker> matchingName = new ArrayList<>();
        for (Worker worker : workers) {
            if (worker.getName().equals(name)) {
                matchingName.add(worker);
            }
        }
        return matchingName;
    }

    /*
    Добавить метод, который ищет сотрудника по табельному номеру
     */
    public Worker findWorkerById(int Id) {
        for (Worker worker : workers) {
            if (worker.getId() == Id) {
                return worker;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        WorkerDirectory directory = new WorkerDirectory();

        // Добавление новых сотрудников
        directory.addWorkers(1, "123-456-7890", "Иван", 5);
        directory.addWorkers(2, "987-654-3210", "Мария", 3);
        directory.addWorkers(2, "987-554-33333", "Мария", 3);
        directory.addWorkers(3, "555-555-5555", "Петр", 5);

        // Поиск сотрудников по стажу
        System.out.println();
        List<Worker> workersWithExperience5 = directory.findByExperience(5);
        System.out.println("Сотрудники со стажем 5 лет:");
        for (Worker worker : workersWithExperience5) {
            System.out.println("Табельный номер: " + worker.getId() +
                               ", Номер телефона: " + worker.getPhoneNumber() +
                               ", Имя: " + worker.getName() +
                               ", Стаж: " + worker.getExperience());
        }

        // Поиск номера телефона по имени
        System.out.println();
        System.out.println("Номер телефона сотрудника Мария:");
        List<Worker> findPhone = directory.findPhoneNumberByName("Мария");
        for (Worker worker : findPhone) {
            System.out.println(" Номер телефона: " + worker.getPhoneNumber());
        }

        // Поиск сотрудника по табельному номеру
        System.out.println();
        System.out.println("Сотрудник с табельным номером 1");
        Worker worker1 = directory.findWorkerById(1);
        System.out.println("Имя: " + worker1.getName() + "\n" +
                           "Номер телефона: " + worker1.getPhoneNumber() + "\n" +
                           "Стаж: " + worker1.getExperience()
        );

    }
}






