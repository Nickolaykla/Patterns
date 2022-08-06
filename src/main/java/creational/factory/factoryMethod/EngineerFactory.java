package creational.factory.factoryMethod;

public class EngineerFactory implements SpecialistFactory {
    @Override
    public Specialist createSpecialist() {
        return new Engineer();
    }
}
