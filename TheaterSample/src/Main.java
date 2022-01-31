import Exception.*;

public class Main {
    public static void main(String[] args) {
        Theatre theatre1 = new Theatre("Bosko Buha");
        Repertoire repertoire1 = new Repertoire(theatre1);
        Director director1 = new Director("Milena", theatre1);
        Director director2 = new Director("Srdjan", theatre1);
        Performance performance1 = new Performance("Kosa", theatre1, director1);
        Performance performance2 = new Performance("Labudovo jezero", theatre1, director2);

        Actor actor1 = new Actor("Mina", theatre1);
        Actor actor2 = new Actor("Pera", theatre1);
        Actor actor3 = new Actor("Ivan", theatre1);
        CostumeDesigner costumeDesigner1 = new CostumeDesigner("Karlo", theatre1);
        CostumeDesigner costumeDesigner2 = new CostumeDesigner("Jovan", theatre1);
        try {
            performance1.addEmployee(actor1);
            performance1.addEmployee(actor2);
            performance1.addEmployee(costumeDesigner1);
            performance2.addEmployee(actor3);
            performance2.addEmployee(costumeDesigner2);

        } catch (Alerts alerts) {
            System.out.println(alerts.getAlert1());
        }

        repertoire1.addPerformance(performance1);
        repertoire1.addPerformance(performance2);

        System.out.println(repertoire1);
        repertoire1.removePerformance("Kosa");
        System.out.println(repertoire1);
    }
}
