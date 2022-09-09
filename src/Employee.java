
public class Employee {
    private String fullName;
    private int department;
   private int salary;
  private int id;
  private static int counter;


    public Employee( String fullName,int department, int salary){

        this.fullName=fullName;
        this.department=department;
        this.salary=salary;
        this.id= 1+counter++;
    }



    public String getFullName(){return this.fullName;}
    public int getDepartment(){return this.department;}
    public int getSalary(){return this.salary;}
    public int setDepartment(){return this.department;}
    public int setSalary(){return this.salary;}
    public int getId() {return this.id;}

    @Override
    public String toString() {
        return id+"."+" Имя- " + fullName +
                " отдел- " + department +
                " зп- " + salary;
    }
}
