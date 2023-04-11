public class Programmer {
    String name, company, position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "Senior";
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Juan", "MTS");
        programmer.work();
    }

    public String getPosition() {
        return this.position;
    }

    public void work() {
        if (position == "Intern") {
            System.out.println("Position: " + "Junior");
        } else if (position == "Junior") {
            System.out.println("Position: " + "Middle");
        } else if (position == "Middle") {
            System.out.println("Position: " + "Senior");
        } else {
            System.out.println("Position: " + "Lead");
        }
    }
}


