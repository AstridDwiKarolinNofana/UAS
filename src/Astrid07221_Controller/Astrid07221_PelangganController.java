package Astrid07221_Controller;
import Astrid07221_Entity.Astrid07221_DaftarPelangganEntity;
import Astrid07221_Entity.Astrid07221_PelangganEntity;
import Astrid07221_Model.Astrid07221_PelangganModel;
import java.util.ArrayList;
import java.util.Date;
public class Astrid07221_PelangganController implements Astrid07221_ControllerInterface{
    int indexLogin = 0;
    
    public Astrid07221_PelangganController() {
    }
    
    public Astrid07221_PelangganEntity getData() {
        return Astrid07221_AllObjectModel.pelangganModel.getpelangganEntityArrayList(indexLogin);
    }
    
    public void Astrid07221_DaftarCamera(int indexCamera,  Astrid07221_PelangganEntity pelanggan,
            boolean isVerified) {
        Astrid07221_AllObjectModel.daftarPelangganmodel.insertDataPelanggan(new 
        Astrid07221_DaftarPelangganEntity (indexCamera,pelanggan, isVerified));
    }
    
    @Override
    public void login(String id, String nama) {
        indexLogin = Astrid07221_AllObjectModel.pelangganModel.cekData(id, nama);
    }
    
    public void insert(String id,String nama,
    String alamat, String noIdentitas,String notelp,Date tgl_sewa,Date tgl_kembali) {
        Astrid07221_PelangganEntity pelangganModel = new Astrid07221_PelangganEntity();
        pelangganModel.setid(id);
        pelangganModel.setnama(nama);
        pelangganModel.setalamat(alamat);
        pelangganModel.setnoIdentitas(noIdentitas);
        pelangganModel.setnotelp(notelp);
        pelangganModel.setTgl_sewa(tgl_sewa);
        pelangganModel.setTgl_kembali(tgl_kembali);
        Astrid07221_AllObjectModel.pelangganModel.insert(pelangganModel);
    }
    
    public int cekDaftarPelanggan(String id) {
        int cek = Astrid07221_AllObjectModel.daftarPelangganmodel.cekData(id, null);
        return cek;
    }
    
    public Astrid07221_DaftarPelangganEntity showDaftarPelanggan(int index) {
        return Astrid07221_AllObjectModel.daftarPelangganmodel.showDaftarPelanggan(index);
    }
    public void deleteDataPelanggan(int index) {
        Astrid07221_AllObjectModel.daftarPelangganmodel.hapusPelangganModel(index);
    }
    public ArrayList<Astrid07221_DaftarPelangganEntity> cekDaftarPelangganModel() {
        return Astrid07221_AllObjectModel.daftarPelangganmodel.getdaftarpelangganArrayList();
    }
}
