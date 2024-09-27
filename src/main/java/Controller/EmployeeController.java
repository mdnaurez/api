package Controller;

import Model.Employee;
import Service.EmployeeService;
import Dto.cretateEmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {




    //MVC architecture
    //controller -->service-->repository-->(datalayer/model)
    @Autowired
    EmployeeService employeeService;


    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody cretateEmployeeRequest request){
       return employeeService.create(request);

    }

    @GetMapping("/employee/employeeid")
    public Employee getEmployee(@PathVariable("employeeid") String id){
        return employeeService.get(id);
    }
    //getting all employee
    @GetMapping("/employee/all")
    public List<Employee> getEmployee(){
        return employeeService.get();
    }
}
