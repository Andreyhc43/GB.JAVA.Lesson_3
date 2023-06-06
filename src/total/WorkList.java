package total;

import javax.lang.model.element.Element;
import java.util.Arrays;
import java.util.Comparator;

public class WorkList extends EmploeeList implements Comparator<Employee> {



    public  WorkList(String nameList){
        this.nameList = nameList;

    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getMonthlySalary() != o2.getMonthlySalary()){
            return (int) (o1.getMonthlySalary() - o2.getMonthlySalary());
        }
        return 0;
    }

    /**
     * Метод, сортирующий список работников по среднемесячной зарплате, по возрастанию.
     */
    public void sortEmploee(){

        Arrays.sort(this.emploeeArray, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getMonthlySalary() != o2.getMonthlySalary()){
                    return (int) (o1.getMonthlySalary() - o2.getMonthlySalary());
                }
                else return 0;
            }
        });

    }




}
