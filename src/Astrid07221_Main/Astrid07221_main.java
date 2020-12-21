package Astrid07221_Main;
import Astrid07221_Entity.Astrid07221_PetugasEntity;
import Astrid07221_Entity.Astrid07221_PelangganEntity;
import Astrid07221_Entity.Astrid07221_DaftarPelangganEntity;
import Astrid07221_Entity.Astrid07221_CameraEntity;
import Astrid07221_Model.Astrid07221_DaftarPelangganModel;
import Astrid07221_Model.Astrid07221_PelangganModel;
import Astrid07221_Model.Astrid07221_PetugasModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner; 
public class Astrid07221_main {
    private static Astrid07221_PetugasModel petugasModel = new Astrid07221_PetugasModel(); 
    private static Astrid07221_PelangganModel pelangganModel = new Astrid07221_PelangganModel();
    private static Astrid07221_DaftarPelangganModel daftarPelangganmodel = new Astrid07221_DaftarPelangganModel();
    private static Scanner input = new Scanner (System.in);
    int pilCamera;
    int cekpelanggan;
    int cekPetugas;
 
    
    public static void main(String[] args) { 
        Astrid07221_main data = new Astrid07221_main();
        data.viewMenu(); 
    }
    
    void viewMenu(){
        datapetugas(); 
        int loop=0;
        do{
           int pilih = 0;
           System.out.print("Selamat Datang Di RENTAL CAMERA !!" +
                            "\n 1. Login" +
                            "\n 2. Daftar Pelanggan" +
                            "\n 3. Lihat Data Petugas" +
                            "\n 4. Lihat Data Camera" +
                            "\n 0. Stop" +
                            "\n Masukkan Pilihan Anda : ");
                        pilih = input.nextInt();
                        if(pilih == 1){
                            int pilLogin = 0;
            System.out.print("1. Login petugas" + "\n2. Login pelanggan" + "\n Pilih : ");
                pilLogin = input.nextInt();
                if(pilLogin == 1){
                    loginPetugas();
                   
                   
                    
                }else{
                    loginPelanggan();
                }
            }else if(pilih == 2){
                register();
            }else if(pilih == 3){
                petugasModel.view();
            }else if (pilih == 4){
               for(int i=0;i<Astrid07221_CameraEntity.merk.length;i++){
                    System.out.println(i+". "+Astrid07221_CameraEntity.merk[i]);
               }
            }else{
                break;
            }
        }while (loop != 1);
    }

        void datapetugas(){
        String id[] = {"01","02","03"};
        String nama [] = {"astrid","sabrina","alex"};
        String alamat [] = {"mojokerto","mojokerto","sidoarjo"};
        String noIdentitas [] = {"01","02","03"};
        String notelp [] = {"01","02","03"};
              for(int i=0;i<id.length;i++){
                petugasModel.insertPetugas(new Astrid07221_PetugasEntity(id[i],nama[i],alamat[i],
                noIdentitas[i],notelp[i]));
            }
    }
        void register(){
        System.out.print("Input ID = ");
        String id = input.next();
        System.out.print("Input nama = ");
        String nama = input.next();
        System.out.print("Input Alamat = ");
        String alamat = input.next();
        System.out.print("Input no Identitas = ");
        String noIdentitas =  input.next();
        System.out.print("Input no Telepon = ");
        String notelp =  input.next();
        System.out.print("Input Tgl sewa (dd/mm/yyyy) = ");
        Date Tgl_sewa = new Date(input.next());
        System.out.print("Input Tgl kembali (dd/mm/yyyy) = ");
        Date Tgl_kembali = new Date(input.next());
        pelangganModel.insert(new Astrid07221_PelangganEntity(id,nama,alamat,noIdentitas,notelp,
        Tgl_sewa,Tgl_kembali));
    }
        void loginPelanggan(){
        System.out.print("ID : ");
        String id = input.next();
        System.out.print("Nama : ");
        String nama = input.next();
        cekpelanggan = pelangganModel.cekData(id, nama);
        System.out.println("Selamat datang "+pelangganModel.getpelangganEntityArrayList(cekpelanggan)
        .getnama());
        int cekppelanggan = daftarPelangganmodel.cekData(id, nama);
        if (cekppelanggan == -1){
            System.out.println("Anda belum memilih kamera");
                daftarcamera();
        }else if(cekppelanggan == -2){
            System.out.println("Anda belum memilih kamera");
                daftarcamera();
        }else{
        System.out.println("Nama = "+daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getnama());
        System.out.println("id = "+daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getId());
        System.out.println("No identitas = "+daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getnoIdentitas());
        System.out.println("No telp = "+daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getnotelp());
        System.out.println("camera = "+Astrid07221_CameraEntity.merk[daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getIndexCamera()]);
        System.out.println("Tgl sewa           : "+new SimpleDateFormat(" dd - MM - yyyy").format(daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getTgl_sewa()));
        System.out.println("Tgl sewa           : "+new SimpleDateFormat(" dd - MM - yyyy").format(daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getTgl_kembali()));
        System.out.println("isVerified = "+daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).isIsVerified());
        
        }
    }
        void daftarcamera(){
        System.out.print("Pilih Camera = \n");
        for(int i=0;i<Astrid07221_CameraEntity.merk.length;i++){
        System.out.println(i+". "+Astrid07221_CameraEntity.merk[i]);
        }
        System.out.print("Pilih Camera = ");
            pilCamera = input.nextInt();
        daftarPelangganmodel.insertDataPelanggan(new Astrid07221_DaftarPelangganEntity(pilCamera,
                pelangganModel.getpelangganEntityArrayList(cekpelanggan),false));
    }
        void loginPetugas(){
        System.out.print("id : ");
        String id = input.next();
        System.out.print("nama: ");
        String nama = input.next();
        cekPetugas = petugasModel.cekData(id,nama);
        System.out.println("Selamat Datang "+petugasModel.showDataPetugas(cekPetugas).getnama());
        pelangganModel.view();
        updateIsverified();
    }
        void updateIsverified(){
        System.out.print("id : ");
        String id = input.next();
        System.out.print("nama: ");
        String nama = input.next();
        System.out.println("========================================");
        int cekpelanggan = daftarPelangganmodel.cekData(id, nama);
        System.out.println("Nama = "+daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getnama());
        System.out.println("id = "+daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getId());
        System.out.println("No identitas = "+daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getnoIdentitas());
        System.out.println("No telp = "+daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getnotelp());
        System.out.println("camera = "+Astrid07221_CameraEntity.merk[daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getIndexCamera()]);
        System.out.println("Tgl sewa           : "+new SimpleDateFormat(" dd - MM - yyyy").format(daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getTgl_sewa()));
        System.out.println("Tgl sewa           : "+new SimpleDateFormat(" dd - MM - yyyy").format(daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).getPelanggan().getTgl_kembali()));
        System.out.println("isVerified = "+daftarPelangganmodel.showDaftarPelanggan(cekpelanggan).isIsVerified());
        daftarPelangganmodel.updateIsVerified(cekpelanggan, new Astrid07221_DaftarPelangganEntity(pilCamera,
        pelangganModel.getpelangganEntityArrayList(cekpelanggan),true));
    }
}