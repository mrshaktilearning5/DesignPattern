package abstractfactory;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeAbstractFactory employeAbstractFactory){
        return employeAbstractFactory.createEmployee();
    }
}
