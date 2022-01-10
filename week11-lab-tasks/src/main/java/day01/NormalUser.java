package day01;

public class NormalUser implements User{

    private String email;
    private String password;

    public NormalUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getUserEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }


}
