import java.util.LinkedList;

import Exception.*;

public class Performance {
    private String performanceName;
    private Theatre theatreWherePerformanceCanBeWatched;
    private LinkedList<Employee> listOfEmployees;
    private int numberOfCoustumeDesigners;


    public Performance(String performanceName, Theatre theatreWherePerformanceCanBEWatched, Director director) {
        this.performanceName = performanceName;
        this.theatreWherePerformanceCanBeWatched = theatreWherePerformanceCanBEWatched;
        listOfEmployees = new LinkedList<Employee>();
        listOfEmployees.add(director);
    }

    public void addEmployee(Employee employee) throws Alerts {
        if (employee instanceof Director) throw new Alerts();
        else if (employee instanceof CostumeDesigner) {
            if (numberOfCoustumeDesigners < 2) {
                listOfEmployees.add(employee);
                numberOfCoustumeDesigners++;
            } else throw new Alerts();
        } else if (employee instanceof Actor && employee.getTheatreWhereEmployeeWorks().equals(theatreWherePerformanceCanBeWatched))
            listOfEmployees.add(employee);
    }

    public String getPerformanceName() {
        return performanceName;
    }

    public Theatre getTheatreWherePerformanceCanBeWatched() {
        return theatreWherePerformanceCanBeWatched;
    }

    @Override
    public String toString() {
        String list = "";
        for (int i = 0; i < listOfEmployees.size(); i++) {
            list += listOfEmployees.get(i).toString() + "\n";
        }
        return performanceName + ":" + theatreWherePerformanceCanBeWatched + "\n" + list;
    }
}
