package creational.factory.abstractFactory.banking;

import creational.factory.abstractFactory.Developer;
import creational.factory.abstractFactory.ProjectManager;
import creational.factory.abstractFactory.ProjectTeamFactory;
import creational.factory.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
