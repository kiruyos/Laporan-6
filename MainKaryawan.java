
package karyawan;

import java.util.Scanner;


public class MainKaryawan {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // input = input angka
        Scanner in = new Scanner(System.in);        // in = input huruf
        int pil, n, temp, temp2, temp3, i, j, jumManager, jumPNS, jumNonPNS;
        int pil2 = 0, jumDataManager = 0, jumDataPNS = 0, jumDataNonPNS = 0;
        String nama, idKerja, punyaIstri;
        boolean istri;
        int jumAnak, tahunKerja, jamLembur,gaji;
        Manager maneo[] = new Manager[99];
        Pns pns[] = new Pns[99];
        NonPns nonpns[] = new NonPns[99];
        do {
            System.out.println("Data karyawan perusahaan");
            System.out.println("1. Input data");
            System.out.println("2. Lihat data");
            System.out.println("3. Keluar");
            System.out.print("Masukan Gaji Anda : ");
            gaji=input.nextInt();
            do {
                    System.out.print("Masukkan pilihan : ");
                    pil = input.nextInt();
                    System.out.println();
                    if (pil<1 || pil>3)
                        System.out.println("Masukan salah..\n");
            }
            while (pil<1 || pil>3);
            switch(pil){
                case 1  :
                    System.out.println("Isi data karyawan");
                    System.out.println("1. Data untuk manager");
                    System.out.println("2. Data untuk karyawan PNS");
                    System.out.println("3. Data untuk karyawna non-PNS");
                    do{
                        System.out.print("Masukkan pilihan : ");
                        pil2 = input.nextInt();
                        System.out.println();
                        if (pil2<1 || pil2>3)
                            System.out.println("Masukan salah..\n");
                    }
                    while (pil2<1 || pil2>3);
                    do {
                        switch(pil2){
                            case 1  :
                                System.out.print("Masukkan jumlah data : ");
                                jumManager = input.nextInt();
                                temp = jumManager + jumDataManager;
                                j = 1;
                                for (i=jumDataManager; i<temp; i++){
                                    System.out.println("Masukkan data "+j);
                                    System.out.print("Nama                : ");
                                    nama = in.nextLine();
                                    System.out.print("ID Kerja            : ");
                                    idKerja = in.nextLine();
                                    System.out.print("Kawin               : ");
                                    punyaIstri = in.nextLine();
                                    if(punyaIstri.equalsIgnoreCase("iya") || punyaIstri.equalsIgnoreCase("ya") || punyaIstri.equalsIgnoreCase("y")){
                                        istri = true;
                                        System.out.print("Jumlah anak         : ");
                                        jumAnak = input.nextInt();                                   
                                    }
                                    else{
                                        istri = false;
                                        jumAnak = 0;
                                    }
                                    System.out.print("Tahun awal bekerja  : ");
                                    tahunKerja = input.nextInt();
                                    maneo[i] = new Manager(nama, idKerja, "Manager", istri, jumAnak, tahunKerja,gaji);
                                    System.out.println();
                                    jumDataManager++;
                                    j++;
                                }
                                System.out.println("Data berhasil di input..");
                                System.out.println(); break;
                            case 2  :
                                System.out.print("Masukkan jumlah data : ");
                                jumPNS = input.nextInt();
                                temp2 = jumPNS + jumDataPNS;
                                j = 1;
                                for (i=jumDataPNS; i<temp2; i++){
                                    System.out.println("Masukkan data "+j);
                                    System.out.print("Nama                : ");
                                    nama = in.nextLine();
                                    System.out.print("ID Kerja            : ");
                                    idKerja = in.nextLine();
                                    System.out.print("Kawin               : ");
                                    punyaIstri = in.nextLine();
                                    if(punyaIstri.equalsIgnoreCase("iya") || punyaIstri.equalsIgnoreCase("ya") || punyaIstri.equalsIgnoreCase("y")){
                                        istri = true;
                                        System.out.print("Jumlah anak         : ");
                                        jumAnak = input.nextInt();                                   
                                    }
                                    else{
                                        istri = false;
                                        jumAnak = 0;
                                    }
                                    System.out.print("Tahun awal bekerja  : ");
                                    tahunKerja = input.nextInt();
                                    pns[i] = new Pns(nama, idKerja, "Karyawan tetap", istri, jumAnak, tahunKerja,gaji);
                                    System.out.println();
                                    jumDataPNS++;
                                    j++;
                                }
                                System.out.println("Data berhasil di input..");                            
                                System.out.println(); break;
                            case 3  :
                                System.out.print("Masukkan jumlah data : ");
                                jumNonPNS = input.nextInt();
                                temp3 = jumNonPNS + jumDataNonPNS;
                                j = 1;
                                for (i=jumDataNonPNS; i<temp3; i++){
                                    System.out.println("Masukkan data "+j);
                                    System.out.print("Nama                : ");
                                    nama = in.nextLine();
                                    System.out.print("ID Kerja            : ");
                                    idKerja = in.nextLine();
                                    System.out.print("Kawin               : ");
                                    punyaIstri = in.nextLine();
                                    if(punyaIstri.equalsIgnoreCase("iya") || punyaIstri.equalsIgnoreCase("ya") || punyaIstri.equalsIgnoreCase("y")){
                                        istri = true;
                                        System.out.print("Jumlah anak         : ");
                                        jumAnak = input.nextInt();                                   
                                    }
                                    else{
                                        istri = false;
                                        jumAnak = 0;
                                    }
                                        System.out.print("Tahun awal bekerja  : ");
                                    tahunKerja = input.nextInt();
                                    System.out.print("Jam lembur          : ");
                                    jamLembur = input.nextInt();
                                    nonpns[i] = new NonPns(nama, idKerja, "Karyawan tidak tetap", istri, jumAnak, tahunKerja, jamLembur);
                                    System.out.println();
                                    jumDataNonPNS++;
                                    j++;
                                }
                                System.out.println("Data berhasil di input..");                            
                                System.out.println(); break;
                            default :
                                System.out.println("Masukan salah..");
                        }
                    }
                    while (pil2<1 || pil2>3);
                    break;
                case 2  :
                    System.out.println("Data karyawan perusahaan");
                    i=1;
                    for (j=0; j<maneo.length; j++){
                        if (maneo[j] != null){
                            System.out.println("Karyawan "+i);
                            maneo[j].display();
                            System.out.println();
                            i++;
                        }
                    }
                    for (j=0; j<pns.length; j++){
                        if (pns[j] != null){
                            System.out.println("Karyawan "+i);
                            pns[j].display();
                            System.out.println();
                            i++;
                        }
                    }
                    for (j=0; j<nonpns.length; j++){
                        if (nonpns[j] != null){
                            System.out.println("Karyawan "+i);
                            nonpns[j].Display();
                            System.out.println();
                            i++;
                        }
                    }
                    if (pil2 == 0)
                        System.out.println(" - belum ada data - \n");
                    break;
                case 3  :
                    System.out.println("Terima kasih..");
                    break;
                default :
                    System.out.println("Masukan salah..");
            }
        }
        while (pil>0 && pil<3);
    }
}
