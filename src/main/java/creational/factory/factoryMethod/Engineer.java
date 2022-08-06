package creational.factory.factoryMethod;

public class Engineer implements Specialist {
    @Override
    public void doJob() {
        System.out.println("Engineer doing his job");
    }
}
