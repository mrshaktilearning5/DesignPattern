package factory;

public class EmployFactory {

    public static Employ getEmploye(String empType){
        if(empType.trim().equalsIgnoreCase("android")){
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("web")) {
            return new WebDeveloper();
        }else {
            return null;
        }
    }
}
