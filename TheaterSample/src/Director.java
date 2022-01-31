public class Director extends Employee {

    public Director(String name, Theatre theatre) {
        super(name, theatre);
    }

    public String getTypeOfProfession() {
        return "Director";
    }
}
