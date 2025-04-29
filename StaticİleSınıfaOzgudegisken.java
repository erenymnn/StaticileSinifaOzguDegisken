package Nesneye_Yönelik_Programlama;

import org.w3c.dom.ls.LSOutput;

public class StaticİleSınıfaOzgudegisken {
    public static void main(String[] args) {
    Memur m1 = new Memur();
    m1.setIsim("Eren yaman");
    m1.setMaas(60000);
    m1.BilgileriYazdir();
    Memur.kanunuSoyle();
    Memur m2 = new Memur();
    m2.setIsim("Sevil yaman");
    m2.setMaas(55000);
    m2.BilgileriYazdir();
    m1.kanunuSoyle();
        System.out.println("Oluşturulan Memur Sayisi="+Memur.getOlusturulanMemurNesnesi());

    }


}
 class Memur {
    //private yapma sebebimiz diğer insanlar ile kütüphanemizi paylaşacağımz zaman insanlar ulaşmalarını istemediğimiz verilerimize ulaşamasın diye private kullanırız.
    private String isim;
    private int maas;
    private static int olusturulanMemurNesnesi=0;

    public  Memur() {
        olusturulanMemurNesnesi++;

    }

     public static int getOlusturulanMemurNesnesi() {
         return olusturulanMemurNesnesi;
     }

     public static void setOlusturulanMemurNesnesi(int olusturulanMemurNesnesi) {
         Memur.olusturulanMemurNesnesi = olusturulanMemurNesnesi;
     }

     public String getIsim() {
         return isim;
     }

     public void setIsim(String isim) {
         this.isim = isim;
     }

     public int getMaas() {
         return maas;
     }

     public void setMaas(int maas) {
         if(maas<0){
             System.out.println("Maas degeri negatif olamaz");
         }else{
         this.maas = maas;
     } }
     public void BilgileriYazdir(){

         System.out.println("isim : " + isim+" maas : " + maas);

     }
     public static void kanunuSoyle(){
         System.out.println("657 NOLU KANUN GEÇERLİ");
     }
     NOT:static metotlar static olmayan metotlara ulaşamaz.
}
