package Singleton;

public class SaveInformation {

    public static String saveInfo(String info) {
        User u = User.getInstance();
        u.setInformation(info);
        return "Saved string to user: " + u.getInformation();
    }


}
