package abstractfactory;

public class AbstractFactoryRunner {

    public static void main(String[] args) {
        /*
        * here to get android developer object
        * */

        Employee employee=EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        employee.name();

        System.out.println( employee.name());
    }
}
