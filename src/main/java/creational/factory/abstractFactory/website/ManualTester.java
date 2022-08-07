package creational.factory.abstractFactory.website;

import creational.factory.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website");
    }
}
