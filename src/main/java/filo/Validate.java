package filo;

public class Validate {
    public static boolean checkUser(String user, String pass) {
        boolean result = false;

        try {
            if ((user != null && !user.isEmpty()) && (pass != null && !pass.isEmpty())) {
                result = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
