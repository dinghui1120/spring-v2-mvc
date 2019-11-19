package delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader implements Employee {

    Map<String, Employee> employeeMap = new HashMap<>();

    public Leader(){
        employeeMap.put("加密", new EmployeeA());
        employeeMap.put("登陆", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        employeeMap.get(command).doing(command);
    }
}
