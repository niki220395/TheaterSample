public class Actor extends Employee {

    public Actor(String name, Theatre theatre) {
        super(name, theatre);
    }

    public String getTypeOfProfession() {
        return "Actor";
    }
}
