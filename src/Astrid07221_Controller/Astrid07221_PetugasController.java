package Astrid07221_Controller;
import Astrid07221_Entity.Astrid07221_PetugasEntity;
import Astrid07221_Entity.Astrid07221_DaftarPelangganEntity;
import Astrid07221_Entity.Astrid07221_PelangganEntity;
import java.util.Date;
import java.util.ArrayList;
public class Astrid07221_PetugasController implements Astrid07221_ControllerInterface{
    int indexLogin = 0;
    public Astrid07221_PetugasController() {    
    }
    
    public void datapetugas(){
        String id[] = {"01","02","03"};
        String nama [] = {"astrid","sabrina","alex"};
        String alamat [] = {"mojokerto","mojokerto","sidoarjo"};
        String noIdentitas [] = {"01","02","03"};
        String notelp [] = {"01","02","03"};
              for(int i=0;i<id.length;i++){
                Astrid07221_AllObjectModel.petugasModel.insertPetugas(new 
                Astrid07221_PetugasEntity(id[i],nama[i],alamat[i],
                noIdentitas[i],notelp[i]));
            }
    }
    
    public void view() {
        Astrid07221_AllObjectModel.petugasModel.view();
    }
    
    public void listDaftarCamera() {
        Astrid07221_AllObjectModel.daftarPelangganmodel.view();
    }
    
    @Override
    public void login(String id, String nama) {
        indexLogin =  Astrid07221_AllObjectModel.petugasModel.cekData(id, nama);
    }
    
    public Astrid07221_PetugasEntity Astrid07221_PetugasEntity() {
        return Astrid07221_AllObjectModel.petugasModel.showDataPetugas(indexLogin);
    }
    
    public void updateIsVerified(int index,int indexCamera,Astrid07221_PelangganEntity pelanggan ) {
        Astrid07221_AllObjectModel.daftarPelangganmodel.updateIsVerified(index, new Astrid07221_DaftarPelangganEntity(indexCamera, pelanggan,true));
    }
    
    public ArrayList<Astrid07221_DaftarPelangganEntity> cekDaftarPelangganModel() {
        return Astrid07221_AllObjectModel.daftarPelangganmodel.getdaftarpelangganArrayList();
    }
}
