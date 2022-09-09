public class Main {

        private static Employee[] employees= new Employee[10];

    public static void main(String[] args) {
        Employee one = new Employee("Иванов Иван Иванович",1,80_000);
        Employee two = new Employee("Иванова Лариса Ивановна",2,100_000);
        Employee three = new Employee("Степанов Степан Степанович",1,60_000);

        employees[0]=one;
        employees[1]=two;
        employees[2]=three;

        System.out.println(employees[0]);
        System.out.println(employees[1]);

    }
        public static void printEmployees() {
            for (Employee employee: employees){
                System.out.println(employee);
            }
        }

            public static int calculateSalary() {
        int sum= 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
            }

    public static Employee maxMinSalary() {
        Employee result=employees[0];
        int maxSalary =employees[0].getSalary();
        for (Employee employee: employees){
            if (employee.getSalary()>maxSalary){
                maxSalary = employee.getSalary();
                result= employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary(){
            return calculateSalary()/(float) employees.length; }

public static void printFullName(){
            for (Employee employee: employees){
                System.out.println(employee.getFullName());
            }
            }
        }

