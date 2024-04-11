package abstractfactory;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        return 100000;
    }

    @Override
    public String name() {
        return "web developer";
    }
}
