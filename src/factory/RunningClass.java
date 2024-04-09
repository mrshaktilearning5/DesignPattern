package factory;

public class RunningClass {

    public static void main(String[] args) {
        Employ employ=EmployFactory.getEmploye("web");
        System.out.println("employee salary "+employ.salary());
    }
}
