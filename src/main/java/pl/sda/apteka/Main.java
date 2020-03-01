package pl.sda.apteka;

public class Main {

    public static void main(String[] args) {


        Lekarstwa lekarstwa = new Lekarstwa();

        lekarstwa.cena("Paracetamol", false);

        lekarstwa.cena("Gripex", true);

        lekarstwa.cena("Apap", true);


        lekarstwa.maksymalnaRefundacja();

        lekarstwa.kosztCalkowity();

        lekarstwa.wyswietl("Antybiotyk");
    }
}
