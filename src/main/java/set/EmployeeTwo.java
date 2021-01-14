package set;

public class EmployeeTwo implements Comparable{
    private String name;
    private int salary;
    public EmployeeTwo(String name,int salary) {
        this.name = name;
        this.salary = salary;
    }
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
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
}