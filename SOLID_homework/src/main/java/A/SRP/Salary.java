package A.SRP;

public class Salary {

    private Employee employee;
    private int baseSalary;

    public Salary(Employee employee, int baseSalary) {
        this.employee = employee;
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.13);
        return baseSalary - tax;
    }

}
