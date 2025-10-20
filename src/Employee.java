public class Employee {

    private int id;
    private String firstName, lastName;
    private int salary;

    public Employee(int id, String fn, String ln, int salary) {
        this.id = id;
        firstName = fn;
        lastName = ln;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int sal) {
        this.salary = sal;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent){
        salary = salary + (salary * (percent/100));
        return salary;
    }
}
