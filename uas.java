# tugasuas
package UAS;


import java.util.ArrayList;
import java.util.Scanner;

public class belanja {

    
    private String namabarang;
    private int  hargabarang;
    private int jumlabelanja;

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public int getHargabarang() {
        return hargabarang;
    }

    public void setHargabarang(int hargabarang) {
        this.hargabarang = hargabarang;
    }

    public int getJumlabelanja() {
        return jumlabelanja;
    }

    public void setJumlabelanja(int jumlabelanja) {
        this.jumlabelanja = jumlabelanja;
    }

    


    
    
    public belanja (){
        
        int jum = 4;
        ArrayList <belanja>p =new ArrayList<>();
        for (int index=0;index<jum; index++){
            belanja s= new belanja();
            Scanner sc = new Scanner(System.in);
            System.out.println("type item name = ");
            s.setNamabarang(sc.nextLine());
            System.out.println("type item price = ");
            s.setHargabarang(sc.nextInt());
            System.out.println("type item qty =");
        }
        
    }


}
