import total.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        WorkList wl2023 = new WorkList("Список сотрудников № 2023");

        System.out.println();

        wl2023.sortEmploee();

        System.out.println("\nОтсортированный по среднемесячной зарплате список работников:\n" + Arrays.toString(wl2023.emploeeArray));

        wl2023.printEmployeesForEach(wl2023.emploeeArray);

    }

}