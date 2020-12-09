
package Astrid07221_Model;
import Astrid07221_Entity.Astrid07221_PetugasEntity;
import java.util.ArrayList;
public class Astrid07221_PetugasModel implements Astrid07221_ModeIinterfaces{ //inhiritence mewariskan interface=hanya mengandung deklarasi method 
    private  ArrayList <Astrid07221_PetugasEntity> PetugasEntityArrayList;
    
    public Astrid07221_PetugasModel(){
    PetugasEntityArrayList = new ArrayList<Astrid07221_PetugasEntity>();
    }
    public void insertPetugas(Astrid07221_PetugasEntity petugas){
        PetugasEntityArrayList.add(petugas);
    }
     @Override
     
      public void view(){
        for (Astrid07221_PetugasEntity PetugasEntity : PetugasEntityArrayList){
        System.out.print(PetugasEntity.getId());
        System.out.print(PetugasEntity.getnama());
        System.out.print(PetugasEntity.getalamat());
        System.out.print(PetugasEntity.getnoIdentitas());
        System.out.print(PetugasEntity.getnotelp());
        System.out.println();
        }
    }
    
    public int cekData(String id, String nama){
        int loop = 0;
        for(Astrid07221_PetugasEntity petugasEntity : PetugasEntityArrayList){
            if(petugasEntity.getId().equals(id) && petugasEntity.getnama().equals(nama)){
            break;
            }else{
                loop++;
            }
        }
        return loop;
   }
    public Astrid07221_PetugasEntity showDataPetugas(int index){
        return PetugasEntityArrayList.get(index);
    }
}
