package pl.pjatk.tdd.sklep;

public class Sklep {
    public static void dokonajZakupu(KartaKlienta karta, double kwotaZakupu) {
        //TODO: dodaj algorytm na liczenie ilości kuponów jakie należą się za zakup
        if (kwotaZakupu >= 40.00 && kwotaZakupu < 80.00){
            karta.dodajKupony(1);
        } else if (kwotaZakupu >= 80.00 && kwotaZakupu < 120.00){
            karta.dodajKupony(2);
        } else if (kwotaZakupu >= 120.00){
            karta.dodajKupony(3);
        }
    }

    public static void dokonajZakupuPoZnizce(KartaKlienta karta, double kwotaZakupu) {

        if (kwotaZakupu >= 50.00 && kwotaZakupu < 100.00) {
            kwotaZakupu = (kwotaZakupu * 0.95);
        } else if (kwotaZakupu >= 100.00) {
            kwotaZakupu = (kwotaZakupu * 0.9);
        }
        dokonajZakupu(karta, kwotaZakupu);
    }

    public static void dokonajZakupuPoZnizceDlaStalychKlientow(KartaKlienta karta, double kwotaZakupu) {

        if (karta.pobierzIloscDostepnychKuponow() >= 10) {
            if (kwotaZakupu < 50.00) {
                kwotaZakupu = kwotaZakupu * 0.97;
            }

            double znizkaPowyzej50 = 0.92;
            double znizkaPowyzej100 = 0.87;

            if (kwotaZakupu >= 50.00 && kwotaZakupu < 100.00) {
                kwotaZakupu = (kwotaZakupu * znizkaPowyzej50);
            } else if (kwotaZakupu >= 100.00) {
                kwotaZakupu = (kwotaZakupu * znizkaPowyzej100);
            }

            dokonajZakupu(karta, kwotaZakupu);
        }
    }

    public static KartaKlienta wydajNowaKarte(){
        return new KartaKlienta();
    }
}
