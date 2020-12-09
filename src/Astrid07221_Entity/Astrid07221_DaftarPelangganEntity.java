package Astrid07221_Entity;
public class Astrid07221_DaftarPelangganEntity {
   private Astrid07221_PelangganEntity pelanggan; //atribut
    private boolean isVerified;
    private int indexCamera; 
    
     public Astrid07221_DaftarPelangganEntity(int indexCamera,Astrid07221_PelangganEntity pelanggan, boolean isVerified) { //konstruktor
         this.indexCamera = indexCamera;
        this.pelanggan = pelanggan;
        this.isVerified = isVerified;
    }

    public Astrid07221_PelangganEntity getPelanggan() {
        return pelanggan;
    }

    public boolean isIsVerified() {
        return isVerified;
    }


    public int getIndexCamera() {
        return indexCamera;
    }

    public void setPelanggan(Astrid07221_PelangganEntity pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public void setIndexCamera(int indexCamera) {
        this.indexCamera = indexCamera;
    }
     
}
