package Astrid07221_View;
import Astrid07221_Controller.Astrid07221_AllObjectModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class Astrid07221_PetugasGUI extends Astrid07221_Komonen{
     public Astrid07221_PetugasGUI(){
        setSize(1500,700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.ORANGE);
        
        admin.setBounds(600, 30, 800, 50);
        admin.setFont(font);
        add(admin);
        
        scrollpetugas.setBounds(50, 100, 1200, 200);
        tabelpelanggan.setModel(Astrid07221_Allobjctrl.Pelanggan.daftarpel());
        add(scrollpetugas);
        
        idlabel.setBounds(450, 320, 100, 30);
        add(idlabel);
        idtext.setBounds(450, 350, 100, 30);
        add(idtext);
        
        namalabel.setBounds(600, 320, 100, 30);
        add(namalabel);
        namatext.setBounds(600, 350, 100, 30);
        add(namatext);
        
        verif.setBounds(750, 350, 100, 30);
        verif.setBackground(Color.GRAY);
        add(verif);
        
        back.setBounds(450, 410, 100, 30);
        back.setBackground(Color.GRAY);
        add(back);
        
        hapus.setBounds(750, 410, 100, 30);
        hapus.setBackground(Color.GRAY);
        add(hapus);
        
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                dispose();
                Astrid07221_GUI men = new Astrid07221_GUI();//nama objek men
            }
        });
        
        verif.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ //untuk verifikasi id, dan nama
                String id = idtext.getText();
                String nama = namatext.getText();
                int index = Astrid07221_AllObjectModel.daftarPelangganmodel.cekData(id, nama); //dicek
                Astrid07221_Allobjctrl.petugas.updateIsVerified(index, Astrid07221_Allobjctrl.Pelanggan.showDaftarPelanggan(index)
                        .getIndexCamera(),Astrid07221_Allobjctrl.Pelanggan.showDaftarPelanggan(index).getPelanggan());
                tabelpelanggan.setModel(Astrid07221_Allobjctrl.Pelanggan.daftarpel());
            }
        });
        
        hapus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ //untuk verifikasi id, dan nama
                String id = idtext.getText();
                String nama = namatext.getText();
                int index=Astrid07221_AllObjectModel.daftarPelangganmodel.cekData(id, nama);
                Astrid07221_AllObjectModel.daftarPelangganmodel.hapusPelangganModel(index); //dicek
                tabelpelanggan.setModel(Astrid07221_Allobjctrl.Pelanggan.daftarpel());
            }
        });
        
        tabelpelanggan.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){  //method
                int i = tabelpelanggan.getSelectedRow();
                idtext.setText(Astrid07221_Allobjctrl.Pelanggan.daftarpel().getValueAt(i, 0).toString());
                namatext.setText(Astrid07221_Allobjctrl.Pelanggan.daftarpel().getValueAt(i, 1).toString());
            }
        });
     }
}
