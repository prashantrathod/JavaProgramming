public abstract class Employee extends SalaryCalculator{

    private String name;
    private int salary;

    public Employee (String name, int salary){

        this.name = name;
        this.salary = salary;
    }

    public abstract int calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
