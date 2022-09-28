public class Validator {
    public static boolean check(String login,
                                String password,
                                String confirmPassword) {
        try {
            validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    private  static void validate(String login,
                                  String password,
                                  String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.length() > 20) {
            throw new WrongLoginException("Длинна логина должна быть меньше или ровна 20");
        }
        if (password == null || password.length() >= 20) {
            throw new WrongLoginException("Длинна пароля должна быть меньше 20");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongLoginException("Пароли должны совпадать");
        }
        if (!login.matches("\\w")) {
            throw new WrongLoginException("Влогине содержиться не корректный символ");
        }
        if (!password.matches("\\w")) {
            throw new WrongPasswordException(" В пароле содержиться не коррекный символ");
        }
    }
}
