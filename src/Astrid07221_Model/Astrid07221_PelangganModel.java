package Astrid07221_Model;
import Astrid07221_Entity.Astrid07221_CameraEntity;
import Astrid07221_Entity.Astrid07221_PelangganEntity;
import Astrid07221_Model.Astrid07221_DaftarPelangganModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Astrid07221_PelangganModel implements Astrid07221_ModeIinterfaces { 
    private ArrayList<Astrid07221_PelangganEntity> pelangganEntityArrayList;
     
     public Astrid07221_PelangganModel(){
        pelangganEntityArrayList = new ArrayList<Astrid07221_PelangganEntity>();
    }
public void insert(Astrid07221_PelangganEntity pelangganEntity){
    pelangganEntityArrayList.add(pelangganEntity);  
}
public void hapusPelangganModel(int index) {
        pelangganEntityArrayList.remove(pelangganEntityArrayList.get(index));
    }
 public int size() {
        return pelangganEntityArrayList.size();
    }
 @Override
    public int cekData(String id, String nama){
        int loop = 0;
        while (!pelangganEntityArrayList.get(loop).getId().equals(id) && 
                !pelangganEntityArrayList.get(loop).getnama().equals(nama)){
            loop++;
        }
        return loop;
    }
    public Astrid07221_PelangganEntity getpelangganEntityArrayList(int index){
        return pelangganEntityArrayList.get(index);
    }
}
