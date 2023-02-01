package model;

public class User {
    String user_name;
    String mail;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public User(String user_name, String mail) {
        this.user_name = user_name;
        this.mail = mail;
    }


}
