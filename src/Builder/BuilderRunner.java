package Builder;

public class BuilderRunner {

    public static void main(String[] args) {
       User user= new User.UserBuiller().setUserName("test name").setUserId("3443-3434").setEmailId("testemailid@gmail.com").build();


        System.out.println(user);
    }
}
