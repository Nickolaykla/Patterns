package creational.factory.factoryMethod;

public class Work {
    public static void main(String[] args) {
        SpecialistFactory specialistFactory = createSpecialistBySpecialty("engineer");
        specialistFactory.createSpecialist().doJob();
    }
    static SpecialistFactory createSpecialistBySpecialty(String specialty) {
        if(specialty.equalsIgnoreCase("economist")) {
            return new EconomistFactory();
        } else if (specialty.equalsIgnoreCase("engineer")) {
            return new EngineerFactory();
        } else throw new RuntimeException(specialty + " does not exist");
    }
}
