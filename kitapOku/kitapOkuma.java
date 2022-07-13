package kitapOku;


interface Okuma{
    default String Oku() {
        return Oku();
    }
}
class  metinMesaj implements Okuma{
    String gonderen;
    String icerik;

    metinMesaj(String gonderen, String icerik){
        this.gonderen=gonderen;
        this.icerik=icerik;
        System.out.println("Gonderen: "+ getGonderen() + " İçerik: " + icerik);
    }

    @Override
    public String Oku(){
        return icerik;
    }
    String getGonderen() {
        return gonderen;
    }
}

class eKitap implements Okuma{
    String isim;
    int sayfano;
    int[] sayfalar = {1,2,3};

    public String getIsim() {
        return isim;
    }

    eKitap(String isim, int sayfano) {
        this.isim=isim;
        this.sayfano=sayfano;
        System.out.println("Kitap İsmi: " + getIsim() + "  Okunan Sayfa No: " + sayfano + " Sayfa Toplamları: " + sayfaSayisi());

    }
    int sayfaSayisi() {
        int toplamSayfaSayisi = 0;
        for (int j : sayfalar) {
            toplamSayfaSayisi = toplamSayfaSayisi + j;
        }
        return  toplamSayfaSayisi;
    }
    void sonrakiSayfa(){
        sayfano=sayfano+1;

        if (sayfalar[sayfalar.length-1]<sayfano) {
            sayfano=sayfalar[0];

        }

        System.out.println("Yeni Sayfa: " + sayfano);
    }
    @Override
    public String Oku(){
        return  "sayfa no: " + sayfano;
    }

}

public class kitapOkuma {
    public static void main(String[] args) {

        new metinMesaj("cengiz", "roman");

        eKitap eKitap = new eKitap("cengiz",2);
        eKitap.sonrakiSayfa();
        eKitap.sonrakiSayfa();



    }
}
