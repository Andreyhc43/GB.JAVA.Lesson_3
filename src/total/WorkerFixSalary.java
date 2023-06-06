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
}
