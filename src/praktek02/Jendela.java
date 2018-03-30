
package praktek02;
public class Jendela {
    double panjang;
    double lebar;

    public Jendela() {
        panjang=5;
        lebar=9;
        lebar=10;
    }

    public Jendela(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    
    void cetakinfo(){
          System.out.println("====================");
          System.out.println("panjang :"+panjang);
          System.out.println("lebar :"+lebar);
          System.out.println("====================");
    }
    
    double hitungluas(){
        double luas;
        luas=panjang*lebar;
        return luas;
      }
    void cetakluas(){
        System.out.println("luasnya adalah:"+hitungluas());
    
    }
    
    }
