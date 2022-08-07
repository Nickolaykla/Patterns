package creational.factory.abstractFactory.banking;

import creational.factory.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM manages banking project");
    }
}
