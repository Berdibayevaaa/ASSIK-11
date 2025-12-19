public class Main {
    public static void main(String[] args) {

        Patient p = new Patient(1, "Aruzhan", 16, "O+");

        System.out.println(p);

        System.out.println("Age: " + p.getAge());

        System.out.println("Is minor: " + p.isMinor());

        System.out.println("Age category: " + p.getAgeCategory());
    }
}