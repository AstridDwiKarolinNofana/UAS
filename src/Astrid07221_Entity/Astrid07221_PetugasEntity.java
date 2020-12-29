package Astrid07221_Entity;
import java.util.Date;
public class Astrid07221_PetugasEntity extends Astrid07221_Rentalcamera{ 
    public Astrid07221_PetugasEntity(String id,String nama,
    String alamat, String noIdentitas,String notelp){
        super(id,nama,alamat,noIdentitas,notelp); 
}
    
 @Override 
    public String getId() {
        return id;
    }
}

