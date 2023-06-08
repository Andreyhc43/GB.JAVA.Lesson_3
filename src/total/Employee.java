package total;

public abstract class Employee {

    public String name;

    float monthlySalary;

//    /**
//     * Метод расчёта месячной зарплаты
//     * Результат зависит от типа работника
//     * @param worker - работник
//     */
//    public static float calculateMonthlySalary(Employee worker){
//        if(worker instanceof WorkerHourSalary){
//            worker.monthlySalary = (float) (20.8 * 8 * ((WorkerHourSalary) worker).hourlyRate);
//        }else {
//            worker.monthlySalary = ((WorkerFixSalary) worker).fixSalary;
//        }
//        System.out.printf("\nРаботник: %s ; среднемесячная зарплата: %s", worker.name, worker.monthlySalary);
//        return (float) worker.monthlySalary;
//    }

    /**
     * Абстрактный метод расчета месячной зарплаты.
     * @param worker
     * @return
     */
    protected abstract float calculateMonthlySalary(Employee worker);


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = (float) monthlySalary;
    }



    @Override
    public String toString() {
        return "\nEmployee [имя сотрудника=" + name
                + ", среднемесячная зарплата =" + monthlySalary+ "]";
    }
}
