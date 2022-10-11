package assesmentOct11;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void print() {
        System.out.println(this.getUsername());
    }

    @Override
    public String toString() {
        return "Admin's name is : " + getUsername();
    }
}
