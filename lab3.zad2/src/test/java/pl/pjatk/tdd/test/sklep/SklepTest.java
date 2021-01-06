package pl.pjatk.tdd.test.sklep;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.pjatk.tdd.sklep.KartaKlienta;
import pl.pjatk.tdd.sklep.Sklep;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SklepTest {

    @Parameterized.Parameter (value = 0)
    public double kwotaZakupu;

    @Parameterized.Parameter (value = 1)
    public int oczekiwanaIloscKuponow;

    @Parameterized.Parameter (value = 2)
    public int oczekiwanaIloscKuponowPoZnice;

    @Parameterized.Parameter (value = 3)
    public int oczekiwanaIloscKuponowPoZniceDlaStalychKlientow;

    private KartaKlienta karta;

    @Parameterized.Parameters (name = "[{index}] Przy zakupie za kwotę {0} oczekiwana ilość kuponów powinna wynieść {1}")
    public static Collection<Object[]> dataProvider(){
        return Arrays.asList(new Object[][]{
                //TODO: Dokończ wypisanie przypadków brzegowych dla 80 zł i 120 zł
                {39.99, 0, 0, 10},
                {40.00, 1, 1, 10},
                {79.99, 1, 1, 11},
                {80.00, 2, 1, 11},
                {119.99, 2, 2, 12},
                {120.00, 3, 2, 12}
        });
    }

    @Before
    public void setup(){
        karta = Sklep.wydajNowaKarte();
    }

    @Test
    public void klientPowinienDostacOdpowiedniaIloscKuponow(){
        Sklep.dokonajZakupu(karta, kwotaZakupu);
        assertEquals(oczekiwanaIloscKuponow, karta.pobierzIloscDostepnychKuponow());
    }

    @Test
    public void klientPowinienDostacOdpowiedniaIloscKuponowPoZnizce(){
        Sklep.dokonajZakupuPoZnizce(karta,kwotaZakupu);
        assertEquals(oczekiwanaIloscKuponowPoZnice, karta.pobierzIloscDostepnychKuponow());
    }

    @Test
    public void klientPowinienDostacOdpowiedniaIloscKuponowPoZnizceDlaStalychKlientow(){
        karta.dodajKupony(10);
        Sklep.dokonajZakupuPoZnizceDlaStalychKlientow(karta,kwotaZakupu);
        assertEquals(oczekiwanaIloscKuponowPoZniceDlaStalychKlientow, karta.pobierzIloscDostepnychKuponow());
    }
}
