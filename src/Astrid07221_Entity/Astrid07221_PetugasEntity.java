package Astrid07221_Entity;
import java.util.Date;
public class Astrid07221_PetugasEntity extends Astrid07221_AbstractRentalCamera{ //menerapkan inheritence/pewarisan, dimana petugas mewarisi data abstract, subclass
                                                        //superclass
    public Astrid07221_PetugasEntity(String id,String nama,
    String alamat, String noIdentitas,String notelp){
        super(id,nama,alamat,noIdentitas,notelp); //memanggil construktor dari superclass
}
 @Override   //pendefinisian ulang method yang sama pada subclass
    public String getId() {
        return id;
    }
}

