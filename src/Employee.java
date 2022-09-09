
public class Employee {
    private String fullName;
    private int department;
   private int salary;
  private int id;


    public Employee( String fullName,int department, int salary){

        this.fullName=fullName;
        this.department=department;
        this.salary=salary;
    }
    public static int id(){
        int id=0;
        id++;
        System.out.println(id);
        return id;

    }


    public String getFullName(){return this.fullName;}
    public int getDepartment(){return this.department;}
    public int getSalary(){return this.salary;}
    public int setDepartment(){return this.department;}
    public int setSalary(){return this.salary;}

    @Override
    public String toString() {
        return " Имя- " + fullName +
                " отдел- " + department +
                " зп- " + salary;
    }
}
