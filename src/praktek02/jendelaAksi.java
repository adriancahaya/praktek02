package praktek02;

public class jendelaAksi {
    public static void main(String[] args) {
        Jendela r1 = new Jendela();
        r1.panjang = 5;
        r1.lebar = 9;
   
        r1.cetakinfo();
        System.out.println("Luas jendela = "+r1.hitungluas());
        r1.cetakluas();
        
        Jendela r2 = new Jendela();
        r2.cetakinfo();
   
        Jendela r3 = new Jendela(14,45);
        r3.cetakinfo();
    }
            
}
