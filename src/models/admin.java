package models;

import java.io.Serializable;

public class admin extends Account implements Serializable {
    private String permission;

    public admin(String permission) {
        this.permission = permission;
    }

    public admin(String name, String userName, String passWord, String email, String permission) {
        super(name, userName, passWord, email);
        this.permission = permission;
    }

    public admin() {
    }

    public admin(String viet, String viet1234, String s, String s1) {
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "admin{" +
                "permission='" + permission + '\'' +
                '}';
    }
}
