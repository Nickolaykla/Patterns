package creational.factory.factoryMethod;

public class EconomistFactory implements SpecialistFactory {
    @Override
    public Specialist createSpecialist() {
        return new Economist();
    }
}
