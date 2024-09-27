package Service;

import Dto.cretateEmployeeRequest;
import Model.Employee;
import Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service  // we can write also component annotation
public class EmployeeService {
    //its your how you handle the code , there are multiple ways,
    //now we do

    EmployeeRepository employeeRepository;  ////for data layer interaction we need repo class

    public Employee create(cretateEmployeeRequest cretateEmployeeRequest){

        Employee employee = cretateEmployeeRequest.to();

        return employeeRepository.create(employee);
    }
    public Employee get(String id){
        return employeeRepository.get(id);
    }
    public List<Employee> get(){
        return employeeRepository.get();
    }

}
