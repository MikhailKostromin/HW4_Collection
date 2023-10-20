package homeWork;

import java.util.List;

public class Main {
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
