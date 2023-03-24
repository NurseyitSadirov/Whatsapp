package db.db;

import db.Doa;
import enums.Status;
import exception.MyException;
import model.Group;
import model.Profile;

import java.util.*;

public class DoaImpl implements Doa {
    private static final List<Profile> profiles = new ArrayList<>();
    public static int idCounter = 0;

    @Override
    public String insTalWhatsapp() throws MyException {


        try {
            System.out.println("userName: ");
            String userName = new Scanner(System.in).nextLine().trim();
            System.out.println("password: ");
            String password = new Scanner(System.in).nextLine();
            System.out.println("phoneNumber: : ");
            String phoneNumber = new Scanner(System.in).nextLine().toLowerCase();

            ArrayList<Profile> contacts = new ArrayList<>();
            ArrayList<String> message = new ArrayList<>();


            for (Profile profile : profiles) {
                profile.setId(++idCounter);
                if (profile.getUserName().equals(userName)) {
                    throw new Exception("Your userName is incorrect!");
                }
                if (profile.getPassword().equals(password)) {
                    throw new Exception("Your password is incorrect!");
                }
                if (profile.getPhoNumber().equals(phoneNumber)) {
                    throw new Exception("Your phoneNumber is incorrect!");
                }
            }
            Profile profile = new Profile();
            profiles.add(profile);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return "Successfully WhatsApp!";
    }

    @Override
    public Profile goToProfile() {
        System.out.println("Enter your password: ");
        String password = new Scanner(System.in).nextLine();
        try {
            for (Profile profile : profiles) {
                if (profile.getPassword().equals(password)) {
                    return profile;
                }
                throw new MyException("No such password");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String getAllWhatsappStatus(List<Status> statusList) {
        for (Status status : statusList) {
            System.out.println(status);
        }
        return " ";
    }

    @Override
    public void changeProfilePhoto(List<Profile> people) {

    }

    @Override
    public void changeWhatsappStatus(List<Status> statusList) {
        try {
            System.out.println("Enter your userName: ");
            String userName = new Scanner(System.in).nextLine();
            System.out.println("Enter your password: ");
            String password = new Scanner(System.in).nextLine();

            for (Profile profile : profiles) {
                if (profile.getUserName().contains(userName) && profile.getPassword().contains(password)) {
                    System.out.println("STATUS LIST: " + Arrays.toString(Status.values()));
                    System.out.println("Enter your status: ");
                    String statuss = new Scanner(System.in).nextLine();
                    profile.setStatus(Status.valueOf(statuss.toUpperCase()));
                    System.out.println(profile.getStatus());
                }
            }

        } catch (NullPointerException e) {
            System.out.println("Cannot invoke is null");
        }

    }

    @Override
    public String addContact() {
        System.out.println("Enter your userName: ");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("Enter your password: ");
        String password = new Scanner(System.in).nextLine();

        for (Profile profile : profiles) {
            if (profile.getUserName().equals(userName) && profile.getPassword().equals(password)) {
                System.out.println("Enter a phoneNumber: ");
                String phoneNumber = new Scanner(System.in).nextLine();
                System.out.println("Enter a contact userName: ");
                String contactUserName = new Scanner(System.in).nextLine();


                for (Profile profile1 : profiles) {
                    if (profile1.getUserName().equals(contactUserName) && profile1.getPhoNumber().equals(phoneNumber)) {
                        List<Profile> contacts = new ArrayList<>();
                        contacts.add(profile1);
                        profile.setProfiles(contacts);
                    }
                }
            }
        }
        return "contact added!";
    }

    @Override
    public String sendMessage() {
        try {
            System.out.println("Enter your userName: ");
            String userName = new Scanner(System.in).nextLine();
            System.out.println("Enter your password: ");
            String password = new Scanner(System.in).nextLine();

            for (Profile profile : profiles) {
                if (profile.getUserName().equals(userName) && profile.getPassword().equals(password)) {
                    System.out.println("Write message: ");
                    while (true) {
                        String message = new Scanner(System.in).nextLine();
                        System.out.println("Will send a message? YES/NO");
                        if (message.equals("YES")){
                            profile.setMassage(Collections.singletonList(message));
                        }
                        return "MESSAGE SENT!";
                    }

                }

            }
        } catch (Exception e) {
            System.out.println("MESSAGE FAILED TO BE SENT!");
        }
        return null;
    }

    @Override
    public void deleteWhatsapp(List<Group> groups) {
        String delete = new Scanner(System.in).nextLine();
        for (Group group : groups) {
            for (Profile profile : group.getProfiles()) {
                if (profile.getUserName().equals(delete))
                    System.out.println(groups.remove(group));
            }
        }
    }
}
