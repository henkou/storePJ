package org.example.store.dto;

public class TestDTO {
    private String username;
    private String password;
    private String etc;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", etc='" + etc + '\'' +
                '}';
    }
}
