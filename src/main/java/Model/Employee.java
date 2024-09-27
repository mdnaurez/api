package Model;

public class Employee {
    private String id;   //which is given to the employee

    private String name;

    private int age;
    private Department department;
    private Address address;


    public Employee(){

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Department getDepartment() {
        return department;
    }

    public Address getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
