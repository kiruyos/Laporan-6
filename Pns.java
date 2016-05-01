
package karyawan;


public class Pns extends Karyawan {
protected int bonus=setLama();
protected int lama=2016-tahunMasuk;
protected int tunjangan=setTunjangan();
protected int tunjanganIstri=setTunjanganIstri();
protected int tunjanganAnak=setTunjanganAnak();

    public Pns(String nama, String idKerja, String jabatan, boolean status, int anak, int tahunMasuk,int gaji) {
        super(nama, idKerja, jabatan, status, anak, tahunMasuk,gaji);
        
    }

   

    
    public int setLama(){
        if(lama<=5){
            return 0;
        }
        else if (lama>5 && lama <=10){
            return (int) (lama*0.05*gaji);
        }
        else{
            return (int)(lama*0.1*gaji);
        }
    }
    public int setTunjangan(){
        if(lama>=10){
            return(int)(lama*0.1*gaji);
            
        }
        else{
            return 0;
        }
        
            
    }
    public int setTunjanganIstri(){
        if(status==true){
            return (int)(gaji+setLama()+tunjangan);
        }
        else{
            return 0;
        }
    }
    public int setTunjanganAnak(){
        if(anak>3){
            return (int)((3*0.15)*(gaji+bonus+tunjangan));
        }
        else{
            return(int)((anak*0.15)*gaji+bonus+tunjangan);
        }
    }
    public void display(){
        System.out.println("Rincian Gaji Anda");
        System.out.println("Gaji "+gaji);
        System.out.println("Tunjangan : "+setTunjangan());
        System.out.println("Tunjangan Istri "+setTunjanganIstri());
        System.out.println("Tunjangan Anak  "+setTunjanganAnak());
        System.out.println("Bonus Anda "+bonus);
    }
    
    
}
