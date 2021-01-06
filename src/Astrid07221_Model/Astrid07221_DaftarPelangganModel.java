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
        return daftarpelangganArrayList.get(index); //menampilkan data pelanggan
    }
    public void hapusPelangganModel(int index) {
        daftarpelangganArrayList.remove(daftarpelangganArrayList.get(index)); //mengapus data pelanggan
    }
    public void hapusPelangganGui(String id, String nama) { //hapus data pelanggan 
        daftarpelangganArrayList.remove(daftarpelangganArrayList);
    }
    public void updateIsVerified(int index,Astrid07221_DaftarPelangganEntity daftarpelanggan){
    daftarpelangganArrayList.set(index, daftarpelanggan); 
    }
    public ArrayList <Astrid07221_DaftarPelangganEntity> alldatapelanggan(){
        return  daftarpelangganArrayList;
    }
}
