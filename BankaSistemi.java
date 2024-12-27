import java.util.HashMap;

import java.util.Map;


public class BankaSistemi {

    public static void main(String[] args) {

        // Sorumluluk Zinciri olusturma

        Departman krediDepartmani = new KrediDepartmani();

        Departman transferDepartmani = new TransferDepartman();



        krediDepartmani.setSonraki(transferDepartmani);



        // Islem olusturma

        Islem islem1 = new Islem("Kredi Basvurusu", "50000 TL kredi basvurusu");

        Islem islem2 = new Islem("Para Transferi", "1000 TL transfer");

        Islem islem3 = new Islem("Hesap Acma", "Yeni mevduat hesabi acma");



        // Islemleri isleme

        krediDepartmani.islemYap(islem1);

        krediDepartmani.islemYap(islem2);

        krediDepartmani.islemYap(islem3);



        // Ziyaretci ile analiz

        IZiyaretci riskAnalizi = new RiskAnaliziZiyaretci();

        islem1.kabulEt(riskAnalizi);

        islem2.kabulEt(riskAnalizi);

    }

}
