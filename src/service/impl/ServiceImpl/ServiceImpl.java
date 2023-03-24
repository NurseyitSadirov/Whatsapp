package service.impl.ServiceImpl;

import db.db.DoaImpl;
import enums.Status;
import exception.MyException;
import model.Group;
import model.Profile;
import service.Service;

import java.util.*;

public class ServiceImpl implements Service {
    DoaImpl doa = new DoaImpl();

    @Override
    public String insTalWhatsapp() throws MyException {
        return doa.insTalWhatsapp();
    }

    @Override
    public Profile goToProfile() {
        return doa.goToProfile();
    }

    @Override
    public String getAllWhatsappStatus(List<Status> statusList) {
        return doa.getAllWhatsappStatus(statusList);
    }

    @Override
    public void changeProfilePhoto(List<Profile> people) {
        doa.changeProfilePhoto(people);
    }

    @Override
    public void changeWhatsappStatus(List<Status> statusList) {
        doa.changeWhatsappStatus(statusList);
    }

    @Override
    public String addContact() {
        return doa.addContact();
    }

    @Override
    public String sendMessage() {
        return doa.sendMessage();
    }

    @Override
    public void deleteWhatsapp(List<Group> groups) {
       doa.deleteWhatsapp(groups);
    }
}
