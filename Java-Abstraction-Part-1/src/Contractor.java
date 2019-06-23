public class Contractor extends Employee {


    public  int workingHours;

    public Contractor (String name, int salary, int workingHours){
        super(name, salary);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }


    @Override
    public int calculateSalary(){
        return workingHours * getSalary();
    }
}
