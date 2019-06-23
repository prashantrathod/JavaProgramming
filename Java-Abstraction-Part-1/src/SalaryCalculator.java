public class SalaryCalculator {

    public static void main (String[] args){

    Contractor a = new Contractor("Sam", 20,6);
    PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Alex", 15, 4);


    System.out.println(a.calculateSalary());
    System.out.println(partTimeEmployee.calculateSalary());




    }

}
