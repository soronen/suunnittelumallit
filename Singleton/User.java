package Singleton;

public class User {
    // create singleton
    private static User instance = null;
    private String username;
    private Long userId;
    private String information;

    // private constructor
    private User() {
        this.username = "tony the tiger";
        this.userId = 47L;
    }

    // getInstance method
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
