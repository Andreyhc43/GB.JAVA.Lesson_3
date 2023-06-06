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
}
