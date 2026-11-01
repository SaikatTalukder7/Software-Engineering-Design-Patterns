public class MainAfter {

    public static void main(String[] args) {

        User user = new User("Saikat", "saikat60@gmail.com");

        EmailValid validator = new EmailValid();

        UserDetails details = new UserDetails();

        if (validator.isValidEmail(user.getEmail())) {
            details.saveToDatabase(user);
        }
    }
}