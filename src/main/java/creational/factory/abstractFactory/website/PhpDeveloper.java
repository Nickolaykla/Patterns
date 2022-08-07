package creational.factory.abstractFactory.website;

import creational.factory.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
