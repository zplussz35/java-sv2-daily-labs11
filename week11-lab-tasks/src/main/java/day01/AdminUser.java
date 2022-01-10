package day01;

public class AdminUser implements User{
    private String email;
    private String password;


    public AdminUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getUserEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        StringBuilder sb = new StringBuilder();
        sb.append("*".repeat(password.length()));
        return sb.toString();
    }
}
