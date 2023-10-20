package homeWork;

import java.util.ArrayList;
import java.util.List;

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
}
