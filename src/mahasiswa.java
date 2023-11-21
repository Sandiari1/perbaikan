/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SANDI
 */
public class mahasiswa {
    private static Connection mahasiswa;
    
    public static Connection getKoneksi(){
        if (mahasiswa == null){
            try{
                String url ="jdbc:mysql://localhost/mahasiswa";
                String user="root";
                String pass="";
                mahasiswa = DriverManager.getConnection(url, user, pass);             
                System.out.println("Koneksi berhasil;");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return mahasiswa;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection = getKoneksi();
        if (connection != null) {
            JOptionPane.showMessageDialog(null, "Koneksi sukses!");
        }
    }
    
}
