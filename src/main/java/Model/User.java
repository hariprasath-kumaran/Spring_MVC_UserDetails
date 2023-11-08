package Model;

public class User {
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    private  static  String username;
    private static String password;
    private static String language;
    private static String country;
    private static String state;
    private static String gender;

    public static String getLanguage() {
        return language;
    }

    public static void setLanguage(String language) {
        User.language = language;
    }

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        User.state = state;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        User.gender = gender;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        User.country = country;
    }

    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
