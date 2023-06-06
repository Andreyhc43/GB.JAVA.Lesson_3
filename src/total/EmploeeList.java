package total;

public abstract class EmploeeList {
    String nameList;
    public Employee[] emploeeArray = {
            new WorkerHourSalary("Алексей(почасовщик)", 1350),
            new WorkerFixSalary("Виталий(Окладчик)", 80000),
            new WorkerFixSalary("Олег(Окладчик)", 120000),
            new WorkerHourSalary("Иван(почасовщик)", 1270),
            new WorkerFixSalary("Антон(Окладчик)", 140000),
            new WorkerHourSalary("Александр(почасовщик)", 1100),
    };


    public void printEmployeesForEach(Employee[] array){
        System.out.println("\nВывод массива при помощи ForEach:\n");
        for (Employee emploees : emploeeArray) {
            System.out.println(emploees.name + "|" + emploees.monthlySalary);
        }


    }
}
