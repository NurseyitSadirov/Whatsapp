package model;

import java.util.List;

public class Group {
    List<Profile> profiles;

    public Group(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @Override
    public String toString() {
        return "Group{" +
                "profiles=" + profiles +
                '}';
    }
}
