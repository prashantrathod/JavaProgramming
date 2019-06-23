public class PartTimeEmployee extends Employee {

    private int partTimeHoursWorked;

    public PartTimeEmployee(String name, int salary, int partTimeHoursWorked) {
        super(name, salary);
        this.partTimeHoursWorked = partTimeHoursWorked;
    }


    @Override
    public int calculateSalary() {
        return partTimeHoursWorked * getSalary();
    }

    public int getPartTimeHoursWorked() {
        return partTimeHoursWorked;
    }

    public void setPartTimeHoursWorked(int partTimeHoursWorked) {
        this.partTimeHoursWorked = partTimeHoursWorked;
    }
}
