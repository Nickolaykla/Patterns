package creational.prototype;

public class VersionControl {
    public static void main(String[] args) {
        Project project1 = new Project(1, "Project 1", "SourceCode sc = new SourceCode();");
        System.out.println(project1);

        ProjectFactory factory = new ProjectFactory(project1);
        Project project1Clone = factory.cloneProject();

        System.out.println(project1Clone);

    }
}
