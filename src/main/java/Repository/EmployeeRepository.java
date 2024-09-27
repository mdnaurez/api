package Repository;

import Model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
@Repository // this class is a repository component in spring aplication
public class EmployeeRepository {
    //we use local memory currently we use hashmap structure. this is just for understanding (structure depends on use case)
    private HashMap<String, Employee> Map = new HashMap<>();


    public Employee create(Employee employee){
       return Map.put(employee.getId(), employee);
    }


    public Employee get(String id) {
       // return Map.getOrDefault(id, null);
        return Map.get(id);//line no 18 & 19 are same.
    }
    public List<Employee> get(){
        ArrayList<Employee> employees = new ArrayList<>(Map.values().stream().collect(Collectors.toList()));
        return employees;
    }
}
