package Dto;

import Model.Address;
import Model.Department;
import Model.Employee;

import java.util.UUID;

public class cretateEmployeeRequest {
    private String name;

    private int age;
    private Department department;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //conversion from dto to model.

    public Employee to() {

        Employee employee=new Employee();
        employee.setName(this.name);
        employee.setAge(this.age);
        employee.setDepartment(this.department);
        employee.setAddress(this.address);

        employee.setId(UUID.randomUUID().toString());

        return employee;
    }
}
