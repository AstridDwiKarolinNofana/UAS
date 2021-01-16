package Astrid07221_View;
import Astrid07221_Entity.Astrid07221_CameraEntity;
import java.awt.Font;
import javax.swing.*;
public class Astrid07221_Komonen extends JFrame{
    JFrame GUI = new JFrame();
    JFrame petugas = new JFrame();
    JFrame pelanggan = new JFrame();
    Font font = new Font("Times New Roman",Font.BOLD,30);
    
    JLabel judulGui = new JLabel("====RENTAL CAMERA====");
    JLabel labellogin = new JLabel("login");
    JRadioButton radioPetugas = new JRadioButton("petugas");
    JRadioButton radiopelanggan = new JRadioButton("pelanggan");
    JLabel labelidlogin = new JLabel("id");
    JLabel labelnamalogin = new JLabel("Nama");
    JLabel labeliddaftar = new JLabel("id");
    JLabel labelnamadaftar = new JLabel("Nama");
    JLabel labelalamat = new JLabel("Alamat");
    JLabel labelnoidentitas = new JLabel("No Identitas");
    JLabel labelnotelp = new JLabel("No Telepon");
    JLabel labeltglsewa = new JLabel("Tanggal sewa (dd/mm/yyyy");
    JLabel labeltglkembali = new JLabel("Tanggal kembali (dd/mm/yyyy");
    JButton btnlogin = new JButton("Login");
    JButton reg = new JButton("Daftar");
    JLabel daftar = new JLabel("Daftar");
    JTextField textidlogin = new JTextField();
    JTextField textnamalogin = new JTextField();
    JTextField textiddaftar = new JTextField();
    JTextField textnamadaftar = new JTextField();
    JTextField textalamat = new JTextField();
    JTextField textnoidentitas = new JTextField();
    JTextField textnotelp = new JTextField();
    JTextField texttglsewa = new JTextField();
    JTextField texttglkembali = new JTextField();
    
    
    JLabel datadiri = new JLabel("Data Pelanggan");
    JTextArea area = new JTextArea();
    JLabel daftarcamera = new JLabel("Daftar Camera");
    JComboBox pilcamera = new JComboBox(Astrid07221_CameraEntity.merk);
    JButton daftarbtn = new JButton("Daftar");
    JButton back = new JButton("Back");
    
    
    JLabel admin = new JLabel("Petugas");
    JTable tabelpelanggan = new JTable();
    JScrollPane scrollpetugas = new JScrollPane(tabelpelanggan);
    JLabel idlabel = new JLabel("Id");
    JLabel namalabel = new JLabel("Nama");
    JTextField idtext = new JTextField();
    JTextField namatext = new JTextField();
    JButton verif = new JButton("verif");
    JButton hapus = new JButton("Hapus");
    
    
    
    
   
    
}
