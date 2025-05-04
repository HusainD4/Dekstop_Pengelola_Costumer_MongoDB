package com.mycompany.myappstoragedata;

public class MainClass {
    public static void main(String[] args) {
        // Mengubah connect() agar return boolean
        boolean connected = connection.connect(); 
        
        // Cek apakah koneksi berhasil
        if (connected) {
            // Jika berhasil, tampilkan JFrame
            MyAppStorageDashboard frame = new MyAppStorageDashboard();
            frame.setVisible(true); // Menampilkan JFrame
        } else {
            // Jika gagal, tampilkan pesan di konsol
            System.out.println("Tidak dapat melanjutkan karena koneksi gagal.");
        }
    }
}
