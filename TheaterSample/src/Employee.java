public abstract class Employee {

    private String employeeName;
    private Theatre theatreWhereEmployeeWorks;

    public Employee(String employeeName, Theatre theatreWhereEmployeeWorks) {
        this.employeeName = employeeName;
        this.theatreWhereEmployeeWorks = theatreWhereEmployeeWorks;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Theatre getTheatreWhereEmployeeWorks() {
        return theatreWhereEmployeeWorks;
    }

    public abstract String getTypeOfProfession();

    @Override
    public String toString() {
        return employeeName + ":" + theatreWhereEmployeeWorks + ":" + getTypeOfProfession();
    }
}
