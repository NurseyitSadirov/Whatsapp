import enums.Status;
import exception.MyException;
import model.Group;
import model.Profile;
import service.impl.ServiceImpl.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        ArrayList<Status>statuses = new ArrayList<>();
        List<Group> groups = new ArrayList<>();
        ServiceImpl service = new ServiceImpl();
        List<Profile> profiles = new ArrayList<>();

        while (true){
            System.out.println("""
                    1 -> Install whatsapp
                    2 -> Go to profile
                    3 -> Get all whatsapp status
                    4 -> Change profile photo
                    5 -> Change whatsapp status
                    6 -> Add contact
                    7 -> Send message
                    8 -> Delete whatsapp""");
            int a = new Scanner(System.in).nextInt();
            switch (a){
                case 1-> System.out.println(service.insTalWhatsapp());
                case 2-> System.out.println(service.goToProfile());
                case 3-> System.out.println(service.getAllWhatsappStatus(List.of(Status.values())));
                case 4-> service.changeProfilePhoto(profiles);
                case 5-> service.changeWhatsappStatus(statuses);
                case 6-> System.out.println(service.addContact());
                case 7-> System.out.println(service.sendMessage());
                case 8-> service.deleteWhatsapp(groups);
            }
        }
    }
}