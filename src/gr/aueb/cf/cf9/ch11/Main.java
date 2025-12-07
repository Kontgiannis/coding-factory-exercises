package gr.aueb.cf.cf9.ch11;

public class Main {
    public static void main(String[] args) {
        User test = new User(101L, "Nikolaos","Papadopoulos");
        System.out.println("{" +
                test.getID() + "," +
                test.getFirstname()+ "," +
                test.getLastname()+ "}");
    }
}
