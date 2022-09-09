import java.util.Arrays;

public class Main {

    private static Employee[] employees = new Employee[3];

    public static void main(String[] args) {
        Employee one = new Employee("Иванов Иван Иванович", 1, 80_000);
        Employee two = new Employee("Иванова Лариса Ивановна", 2, 100_000);
        Employee three = new Employee("Степанов Степан Степанович", 1, 60_000);

        employees[0] = one;
        employees[1] = two;
        employees[2] = three;


        //printEmployees(); //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        //System.out.println("Сумма затрат на зарплаты в месяц "+calculateSalary());
        //System.out.println("Найти сотрудника с максимальной зарплатой "+maxSalary());
        //System.out.println("Найти сотрудника с минимальной зарплатой "+minSalary());
        //System.out.println("Подсчитать среднее значение зарплат "+calculateAverageSalary());
        //printFullName(); //Получить Ф. И. О. всех сотрудников (вывести в консоль).


    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee maxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
                return result;
            }
        }
        return result;
    }

    public static Employee minSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
                return result;
            }
        }
        return result;
    }


    public static float calculateAverageSalary() {
        return calculateSalary() / (float) employees.length;
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}

