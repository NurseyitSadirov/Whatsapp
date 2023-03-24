package model;

import enums.Status;

import javax.management.loading.MLet;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Profile {
    private int id;
    private String phoNumber;
    private String userName;
    private String password;
    private String image = "HI im computer";
    private Status status = Status.HELLO_I_LOVE_YOU;
    private List<String> massage;
    private List<Profile> profiles;

    public Profile(int id, String phoNumber, String userName, String password, String image, Status status, List<String> massage, List<Profile> profiles) {
        this.id = id;
        this.phoNumber = phoNumber;
        this.userName = userName;
        this.password = password;
        this.image = image;
        this.status = status;
        this.massage = massage;
        this.profiles = profiles;
    }

    public Profile(List<String> massage, List<Profile> profiles) {
        this.massage = massage;
        this.profiles = profiles;
    }

    public Profile() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoNumber() {
        return phoNumber;
    }

    public void setPhoNumber(String phoNumber) {
        this.phoNumber = phoNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<String> getMassage() {
        return massage;
    }

    public void setMassage(List<String> massage) {
        this.massage = massage;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @Override
    public String toString() {
        return "Profile{ " +
                "\nid: " + id +
                "\nphoNumber: " + phoNumber + '\'' +
                "\nuserName: " + userName + '\'' +
                "\npassword: " + password + '\'' +
                "\nimage: " + image + '\'' +
                "\nmassage: " + massage +
                "\nprofiles: " + profiles +
                "\nstatus: "+ status +
                '}';
    }


}
