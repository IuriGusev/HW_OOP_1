import com.sun.jdi.CharType;

public class Main {

    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Harry", "Potter", 25, 25,
                80,25, 25);
        Griffindor germiona = new Griffindor("Germiona", "Greynger", 30, 25,
                80,25,20);
        Griffindor ron = new Griffindor("Ron", "Wuizly", 20, 20,
                80, 20,20);

        Sleaserin draco = new Sleaserin("Draco", "Malfoy", 25,20,
                30,20, 15,15);
        Sleaserin grehem = new Sleaserin("Grehem", "Montegu", 10,10,
                30,10,15,15);
        Sleaserin gregory = new Sleaserin("Gregory", "Goyl", 10, 10,
                30,15, 10,10);

        Puffenduy zaharia = new Puffenduy("Zaharia", "Smit", 20,20,
                60,15,20);
        Puffenduy sedrick = new Puffenduy("Sedrick", "Diggory", 20,20,
                60,20,15);
        Puffenduy jastin = new Puffenduy("Justin", "FinchFletchee", 20, 15,
                60, 20,20);

        Kogtevrun chgou = new Kogtevrun("Chgou", "Chang", 20,20,
                65,25,20,20);
        Kogtevrun padma = new Kogtevrun("Padma", "Patil", 20,20,
                65, 30,20,25);
        Kogtevrun marcus = new Kogtevrun("Marcus", "Belby", 20, 20,
                70,25,25,25);

        System.out.println(ron);
        System.out.println(grehem);
        System.out.println(jastin);
        System.out.println(chgou);
        System.out.println();
        harry.compareTo(germiona);
        draco.compareTo(gregory);
        zaharia.compareTo(sedrick);
        padma.compareTo(marcus);
        System.out.println();
        harry.compareTo(draco);
    }
}