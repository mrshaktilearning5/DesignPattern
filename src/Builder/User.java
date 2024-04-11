package Builder;

public class User {


    private final String userName;

    private String userId;

    private String emailId;

    private User(UserBuiller userBuiller){
        this.userId=userBuiller.userId;
        this.userName=userBuiller.userName;
        this.emailId=userBuiller.emailId;

    }


    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }


    //now create a inner static class to create object

    static class UserBuiller{


        public UserBuiller(){

        }
        private  String userName;

        private String userId;

        private String emailId;

        public UserBuiller setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuiller setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuiller setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build(){
            User user=new User(this);
            return user;
        }
    }
}
