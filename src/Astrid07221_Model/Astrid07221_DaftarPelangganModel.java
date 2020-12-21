package Astrid07221_Model; 
import Astrid07221_Entity.Astrid07221_DaftarPelangganEntity;
import Astrid07221_Entity.Astrid07221_CameraEntity;
import Astrid07221_Entity.Astrid07221_PetugasEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.ArrayList; 
public class Astrid07221_DaftarPelangganModel implements Astrid07221_ModeIinterfaces { 
    private ArrayList<Astrid07221_DaftarPelangganEntity> daftarpelangganArrayList;
    public Astrid07221_DaftarPelangganModel(){
    daftarpelangganArrayList = new ArrayList<Astrid07221_DaftarPelangganEntity>();
        }
    public void insertDataPelanggan(Astrid07221_DaftarPelangganEntity daftarpelanggan){
        daftarpelangganArrayList.add(daftarpelanggan);
    }
    public ArrayList<Astrid07221_DaftarPelangganEntity> getdaftarpelangganArrayList(){
        return daftarpelangganArrayList;
    }
    @Override 
    public void view(){ 
        for(Astrid07221_DaftarPelangganEntity daftarpelanggan : daftarpelangganArrayList){
        System.out.println("===========================================");
        System.out.print("ID : "+daftarpelanggan.getPelanggan().getId()+"\n Nama : "
        +daftarpelanggan.getPelanggan().getnama()+"\n Alamat "+daftarpelanggan.getPelanggan().getalamat()+
        "\n No Identitas "+daftarpelanggan.getPelanggan().getnoIdentitas()+
        "\n No Telepon "+daftarpelanggan.getPelanggan().getnotelp()+
        "\n Camera: "+Astrid07221_CameraEntity.merk[daftarpelanggan.getIndexCamera()]+
        "\n Tanggal Lahir : "+new SimpleDateFormat("dd-MM-yyyy").format(daftarpelanggan.getPelanggan().getTgl_sewa())+
         "\n Tanggal Lahir : "+new SimpleDateFormat("dd-MM-yyyy").format(daftarpelanggan.getPelanggan().getTgl_kembali())+
        "\n IsVerified : ");
        if(daftarpelanggan.isIsVerified() == false){
        System.out.println("Belum Di Verifikasi Petugas");
        }else{
        System.out.println("Telah Di Verifikasi");
            }
        System.out.println("===========================================");
        }
    }
    public int cekData(String id, String nama){
        int loop = 0;
        if(daftarpelangganArrayList.size() ==0){
            loop = -1;//data kosong
        }else{
            for(int i = 0; i <daftarpelangganArrayList.size(); i++){
            if(daftarpelangganArrayList.get(i).getPelanggan().getId().equals(id)){
                loop = i;
                break;
            }else{
                loop = -2;
                }
            }
        }   return loop;
    }
    public Astrid07221_DaftarPelangganEntity showDaftarPelanggan(int index){
        return daftarpelangganArrayList.get(index);
    }
    public void updateIsVerified(int index,Astrid07221_DaftarPelangganEntity daftarpelanggan){
    daftarpelangganArrayList.set(index, daftarpelanggan);
    } }
