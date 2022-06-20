package data;

public class UserData {

    private static String firstName;
    private static String lastName;
    private static String email;
    private static String password;
    private static String address;
    private static String mobilePhone;
    private static String zip;
    private static String state;

    public static void setFirstName(String firstName) {
        UserData.firstName = firstName;
    }

    public static void setLastName(String lastName) {
        UserData.lastName = lastName;
    }

    public static void setEmail(String email) {
        UserData.email = email;
    }

    public static void setPassword(String password) {
        UserData.password = password;
    }

    public static void setAddress(String address) {
        UserData.address = address;
    }

    public static void setMobilePhone(String mobilePhone) {
        UserData.mobilePhone = mobilePhone;
    }

    public static void setZip(String zip) {
        UserData.zip = zip;
    }

    public static void setState(String state) {
        UserData.state = state;
    }

    public static void setCity(String city) {
        UserData.city = city;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return password;
    }

    public static String getAddress() {
        return address;
    }

    public static String getMobilePhone() {
        return mobilePhone;
    }

    public static String getZip() {
        return zip;
    }

    public static String getState() {
        return state;
    }

    public static String getCity() {
        return city;
    }

    private static String city;

}
