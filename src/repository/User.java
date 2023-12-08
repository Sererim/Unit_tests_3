package src.repository;

public class User {

    private String name;
    private String password;

    private boolean isAuthenticate = false;
    private boolean isAdmin = false;


    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
    }

    public boolean authenticate(String name, String password) {
        return false;
    }

    // Let's make getters.

    public String getUserName() {
        return this.name;
    }

    public boolean getAuthData() {
        return this.isAuthenticate;
    }

    public boolean getUserGroup() {
        return this.isAdmin;
    }

    // And setter for user group.

    public void setUserGroup (boolean isAdminGroup) {
        this.isAdmin = isAdminGroup;
    }
}
