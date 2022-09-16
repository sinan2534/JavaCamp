public class Main {

    public static void main(String[] args) {
        String ogrenci1="Ahmet";
        String ogrenci2="Şevval";
        String ogrenci3="Sinan";
        String ogrenci4="Deniz";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------------");

        String[] ogrenciler=new String[4];
        ogrenciler[0]="Ahmet";
        ogrenciler[1]="Şevval";
        ogrenciler[2]="Sinan";
        ogrenciler[3]="Deniz";
        for (int i=0 ; i< ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
