package abstractfactory;

public class WebDeveloperFactory extends EmployeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
