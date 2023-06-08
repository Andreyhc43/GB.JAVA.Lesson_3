package total;

public class WorkerHourSalary extends  Employee{

    float hourlyRate;

    public WorkerHourSalary(String nameSalary, float hourlyRate){
        this.setName(nameSalary);
        this.setHourlyRate(hourlyRate);
        setMonthlySalary(calculateMonthlySalary(this));
    }


    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }


    /**
     * Переопределение абстрактного метода рассчета для сотрудника с почасовой ставкой
     * @param worker
     * @return
     */
    @Override
    protected float calculateMonthlySalary(Employee worker) {
        worker.monthlySalary = (float) (20.8 * 8 * ((WorkerHourSalary) worker).hourlyRate);
        System.out.printf("\nРаботник: %s ; среднемесячная зарплата: %s", worker.name, worker.monthlySalary);
        return worker.monthlySalary;
    }
}
