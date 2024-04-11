package abstractfactory;

public class AndroidDeveloperFactory extends EmployeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
