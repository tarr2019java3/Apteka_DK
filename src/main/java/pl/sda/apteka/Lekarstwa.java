package pl.sda.apteka;

public class Lekarstwa {

    private String[] nazwa = {"Paracetamol", "Gripex", "Apap", "Antybiotyk"};
    private double[] cena = {15, 10, 8, 30};
    private double[] refundacja = {0.3, 0.2, 0.5, 0};



    public double cena(String lek, boolean ubezpieczony){
        double cenaLeku = 0;
        double poziomRefundacji = 0;
        for(int i = 0; i < nazwa.length; i++){
            if(lek == nazwa[i]){
                  cenaLeku = cenaLeku + cena[i];
                  if(ubezpieczony){
                      poziomRefundacji = cenaLeku * refundacja[i];
                      cenaLeku = cenaLeku - poziomRefundacji;
                  }
            }
        }
        System.out.println(cenaLeku);
        return cenaLeku;
    }

    public String maksymalnaRefundacja() {

        double tymczasowyWynik = 0;
//      double nastepnyWynik = 0;
        double maxWynik = 0;
        String max = null;

        for (int i = 0; i < refundacja.length; i++) {
            tymczasowyWynik = cena[i] * refundacja[i];

            if (tymczasowyWynik > maxWynik) {
                maxWynik = tymczasowyWynik;
                max = nazwa[i];
            }
//            else {                            //jeżeli tymczasowy jest mniejszy od następnego
//                nastepnyWynik = tymczasowyWynik;
//            }
        }
        System.out.println(max);
        return max;
    }


    public double kosztCalkowity(){
        double suma = 0;
        double cenaLeku = 0;
        for (int i = 0; i < cena.length; i++) {
            cenaLeku = cena[i];
            suma = suma + cenaLeku;
        }
        System.out.println(suma);
        return suma;
    }

    public void wyswietl(String lek){
        for (int i = 0; i < cena.length; i++) {
            if(lek == nazwa[i]){
                System.out.println(nazwa[i] + ", " + cena[i] + ", " + refundacja[i]);
            }
        }
    }


}
