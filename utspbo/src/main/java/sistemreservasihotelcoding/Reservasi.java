/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemreservasihotelcoding;

/**
 *
 * @author ACER
 */

public class Reservasi extends Pelanggan {
    private Kamar kamar;
    private String status;
    private String jenisKelamin;

    public Reservasi(String nama, String nomorIdentitas, String nomorTelepon, String jenisKelamin, Kamar kamar, String status) {
        super(nama, nomorIdentitas, nomorTelepon);
        this.kamar = kamar;
        this.status = status;
        this.jenisKelamin = jenisKelamin;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void printDetailReservasi() {
        System.out.println("Nama Pelanggan: " + getNama());
        System.out.println("Nomor Identitas: " + getNomorIdentitas());
        System.out.println("Nomor Telepon: " + getNomorTelepon());
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tipe Kamar: " + kamar.getTipeKamar());
        System.out.println("Status: " + status);
    }
}
