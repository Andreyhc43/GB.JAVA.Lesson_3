package total;

public class WorkerFixSalary extends Employee{

    float fixSalary;

    public WorkerFixSalary(String nameSalary, float fixSalary){
        this.setName(nameSalary);
        this.setFixSalary(fixSalary);
        setMonthlySalary(calculateMonthlySalary(this));
    }


    public void setFixSalary(float fixSalary) {
        this.fixSalary = fixSalary;
    }

    public float getFixSalary() {
        return fixSalary;
    }


    /**
     * Переопределение абстрактного метода рассчета для сотрудника с фиксированной ставкой
     * @param worker
     * @return
     */
    @Override
    protected float calculateMonthlySalary(Employee worker) {
        worker.monthlySalary = ((WorkerFixSalary) worker).fixSalary;
        System.out.printf("\nРаботник: %s ; среднемесячная зарплата: %s", worker.name, worker.monthlySalary);
        return worker.monthlySalary;
    }
}
