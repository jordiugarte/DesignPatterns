package mediator.ejercicio;

public class Client {


    public static void main (String [] arg) {
        Skype skypeUpbTeam = new Skype();

        QA QA1 = new QA(skypeUpbTeam);
        QA1.setName("jose");
        QA QA2 = new QA(skypeUpbTeam);
        QA2.setName("juan");
        QA QA3 = new QA(skypeUpbTeam);
        QA3.setName("maria");

        Dev dev1 = new Dev(skypeUpbTeam);
        dev1.setName("dev1");
        Dev dev2 = new Dev(skypeUpbTeam);
        dev2.setName("dev2");
        Dev dev3 = new Dev(skypeUpbTeam);
        dev3.setName("dev3");
        Dev dev4 = new Dev(skypeUpbTeam);
        dev4.setName("dev4");
        Dev dev5 = new Dev(skypeUpbTeam);
        dev5.setName("dev5");

        ScrumMaster sm1= new ScrumMaster(skypeUpbTeam);
        sm1.setName("upb sm1");

        skypeUpbTeam.addColleague(QA1);
        skypeUpbTeam.addColleague(QA2);
        skypeUpbTeam.addColleague(QA3);

        skypeUpbTeam.addColleague(dev1);
        skypeUpbTeam.addColleague(dev2);
        skypeUpbTeam.addColleague(dev3);
        skypeUpbTeam.addColleague(dev4);
        skypeUpbTeam.addColleague(dev5);

        skypeUpbTeam.addColleague(sm1);


        QA1.send("hello QA Team");
        QA3.send("Hi All");


        dev1.send("hello DEV Team");
        dev4.send("hello world");

        sm1.send("Hello ALL !!! Dev and QA, Sprint Start Today");

    }

}
