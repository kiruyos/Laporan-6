
package karyawan;


public class NonPns extends Karyawan{
protected int jamKerja;
protected int jamLembur;
    public NonPns(String nama, String idKerja, String jabatan, boolean status, int anak, int tahunMasuk, int gaji) {
        super(nama, idKerja, jabatan, status, anak, tahunMasuk, gaji);
        this.jamKerja=jamKerja;
    }
    
    public int BonusGajiLembur(){
         if(jamKerja>=0){
             return (int)(10.000*jamLembur);
         }
         else
             return 0;
    }
    public void Display(){
        System.out.println("Bonus Anda "+BonusGajiLembur());
    }
}
