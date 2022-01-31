import java.util.LinkedList;

public class Repertoire {
    private Theatre repertoiresTheatre;
    private LinkedList<Performance> repertoire;


    public Repertoire(Theatre repertoiresTheatre) {
        this.repertoiresTheatre = repertoiresTheatre;
        repertoire = new LinkedList<Performance>();
    }

    public void addPerformance(Performance performance) {
        repertoire.add(performance);
    }

    public void removePerformance(String nameOfPerformance) {
        for (int i = 0; i < repertoire.size(); i++) {
            if (repertoire.get(i).getPerformanceName().equals(nameOfPerformance)) repertoire.remove(i);
        }
    }

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < repertoire.size(); i++) {
            text += repertoire.get(i).getPerformanceName() + ":" + repertoire.get(i).getTheatreWherePerformanceCanBeWatched().getTheatreName() + "\n";
        }
        return text;
    }
}
