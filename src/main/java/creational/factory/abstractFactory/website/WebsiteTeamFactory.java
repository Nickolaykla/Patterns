package creational.factory.abstractFactory.website;

import creational.factory.abstractFactory.Developer;
import creational.factory.abstractFactory.ProjectManager;
import creational.factory.abstractFactory.ProjectTeamFactory;
import creational.factory.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
