package creational.factory.abstractFactory.banking;

import creational.factory.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code");
    }
}
