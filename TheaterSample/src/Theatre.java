public class Theatre {

    private String theatreName;
    private static int idGenerator = 1;
    private int theatreID = idGenerator++;

    public Theatre(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public int getTheatreID() {
        return theatreID;
    }

    @Override
    public String toString() {
        return theatreName + ":" + theatreID;
    }
}
