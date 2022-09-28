public class Main {
    public static void main(String[] args) {
        boolean resultat = Validator.check("Номе_957153", "Q_jiytrm_187", "Q_jiytrm_187");
        if (resultat) {
            System.out.println("Логин и пароль корректные");

        } else {
            System.out.println("Логин и/или пароль не корректные");
        }
    }
}