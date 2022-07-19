package entities;

public class Employee {

    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseSalary(double percentage){
        this.salary += this.salary*percentage/100.0;
    }

    public String toString(){
        return id +
                ", " +
                name +
                ", " +
                String.format("%.2f", salary);
    }

}
