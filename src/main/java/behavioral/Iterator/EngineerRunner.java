package behavioral.Iterator;

public class EngineerRunner {
    public static void main(String[] args) {
        String[] skills = {"Constructing", "Building", "Design"};
        Engineer engineer = new Engineer("Vasiliy", skills);
        Iterator iterator = engineer.getIterator();

        System.out.println("Engineer: " + engineer.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
