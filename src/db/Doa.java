package db;

import enums.Status;
import exception.MyException;
import model.Group;
import model.Profile;

import java.util.List;

public interface Doa {
    String insTalWhatsapp() throws MyException;

    Profile goToProfile();

    String getAllWhatsappStatus(List<Status> statusList);

    void changeProfilePhoto(List<Profile> people);

    void changeWhatsappStatus(List<Status> statusList);

    String addContact();

    String sendMessage();

    void deleteWhatsapp(List<Group> groups);
}
