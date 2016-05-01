
package karyawan;


public class Manager extends Pns {
    protected int tunjanganManager=(int) 0.1*(gaji+bonus+tunjangan);
    public Manager(String nama, String idKerja, String jabatan, boolean status, int anak, int tahunMasuk,int gaji) {
        super( nama, idKerja, jabatan, status, anak, tahunMasuk, gaji);
    }

    

   
   
   

    
    
}
