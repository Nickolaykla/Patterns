package creational.factory.abstractFactory;

import creational.factory.abstractFactory.banking.BankingTeamFactory;

public class BankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating banking system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
