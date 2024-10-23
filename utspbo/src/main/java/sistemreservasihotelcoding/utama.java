/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistemreservasihotelcoding;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.Scanner;

public class utama {
    private static ArrayList<Reservasi> daftarReservasi = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nSistem Reservasi Hotel");
            System.out.println("1. Tambah Reservasi");
            System.out.println("2. Lihat Reservasi");
            System.out.println("3. Edit Reservasi");
            System.out.println("4. Hapus Reservasi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    tambahReservasi();
                    break;
                case 2:
                    lihatReservasi();
                    break;
                case 3:
                    editReservasi();
                    break;
                case 4:
                    hapusReservasi();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahReservasi() {
        System.out.println("=== Tambah Reservasi ===");
        System.out.print("Nama Pelanggan: ");
        String nama = scanner.nextLine();
        System.out.print("Nomor Identitas: ");
        String nomorIdentitas = scanner.nextLine();
        System.out.print("Nomor Telepon: ");
        String nomorTelepon = scanner.nextLine();

        // Pilihan jenis kelamin
        System.out.println("Pilih Jenis Kelamin:");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        System.out.print("Pilihan (1-2): ");
        int pilihanJenisKelamin = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String jenisKelamin = pilihJenisKelamin(pilihanJenisKelamin);

        // Pilihan tipe kamar
        System.out.println("Pilih Tipe Kamar:");
        System.out.println("1. Standard");
        System.out.println("2. Deluxe");
        System.out.println("3. Superior");
        System.out.println("4. Suite");
        System.out.println("5. Executive");
        System.out.print("Pilihan (1-5): ");
        int tipePilihan = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String tipeKamar = pilihTipeKamar(tipePilihan);

        // Pilihan status
        System.out.println("Pilih Status:");
        System.out.println("1. Check In");
        System.out.println("2. Check Out");
        System.out.print("Pilihan (1-2): ");
        int statusPilihan = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String status = pilihStatus(statusPilihan);

        Kamar kamar = new Kamar(tipeKamar);
        Reservasi reservasi = new Reservasi(nama, nomorIdentitas, nomorTelepon, jenisKelamin, kamar, status);
        daftarReservasi.add(reservasi);
        System.out.println("Reservasi berhasil ditambahkan.");
    }

    private static void lihatReservasi() {
        if (daftarReservasi.isEmpty()) {
            System.out.println("Tidak ada reservasi yang tersedia.");
        } else {
            System.out.println("=== Daftar Reservasi ===");
            for (int i = 0; i < daftarReservasi.size(); i++) {
                System.out.println("Reservasi " + (i + 1) + ":");
                daftarReservasi.get(i).printDetailReservasi();
                System.out.println();
            }
        }
    }

    private static void editReservasi() {
        lihatReservasi();
        System.out.print("Masukkan nomor reservasi yang ingin diedit: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        if (index >= 0 && index < daftarReservasi.size()) {
            Reservasi reservasi = daftarReservasi.get(index);
            
            System.out.println("Pilih data yang ingin diubah:");
            System.out.println("1. Nama");
            System.out.println("2. Nomor Identitas");
            System.out.println("3. Nomor Telepon");
            System.out.println("4. Jenis Kelamin");
            System.out.println("5. Tipe Kamar");
            System.out.println("6. Status");
            System.out.print("Pilihan (1-6): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama baru: ");
                    String namaBaru = scanner.nextLine();
                    reservasi.setNama(namaBaru);
                    break;
                case 2:
                    System.out.print("Masukkan Nomor Identitas baru: ");
                    String identitasBaru = scanner.nextLine();
                    reservasi.setNomorIdentitas(identitasBaru);
                    break;
                case 3:
                    System.out.print("Masukkan Nomor Telepon baru: ");
                    String teleponBaru = scanner.nextLine();
                    reservasi.setNomorTelepon(teleponBaru);
                    break;
                case 4:
                    System.out.println("Pilih Jenis Kelamin baru:");
                    System.out.println("1. Laki-laki");
                    System.out.println("2. Perempuan");
                    System.out.print("Pilihan (1-2): ");
                    int pilihanJenisKelamin = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    String jenisKelaminBaru = pilihJenisKelamin(pilihanJenisKelamin);
                    reservasi.setJenisKelamin(jenisKelaminBaru);
                    break;
                case 5:
                    System.out.println("Pilih Tipe Kamar baru:");
                    System.out.println("1. Standard");
                    System.out.println("2. Deluxe");
                    System.out.println("3. Superior");
                    System.out.println("4. Suite");
                    System.out.println("5. Executive");
                    System.out.print("Pilihan (1-5): ");
                    int tipeBaru = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    String tipeKamarBaru = pilihTipeKamar(tipeBaru);
                    reservasi.getKamar().setTipeKamar(tipeKamarBaru);
                    break;
                case 6:
                    System.out.println("Pilih Status baru:");
                    System.out.println("1. Check In");
                    System.out.println("2. Check Out");
                    System.out.print("Pilihan (1-2): ");
                    int statusBaru = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    String statusReservasiBaru = pilihStatus(statusBaru);
                    reservasi.setStatus(statusReservasiBaru);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println("Reservasi berhasil diperbarui.");
        } else {
            System.out.println("Nomor reservasi tidak ditemukan.");
        }
    }

    private static void hapusReservasi() {
        lihatReservasi();
        System.out.print("Masukkan nomor reservasi yang ingin dihapus: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        if (index >= 0 && index < daftarReservasi.size()) {
            daftarReservasi.remove(index);
            System.out.println("Reservasi berhasil dihapus.");
        } else {
            System.out.println("Nomor reservasi tidak ditemukan.");
        }
    }

    // Method untuk memilih tipe kamar berdasarkan input angka
    private static String pilihTipeKamar(int pilihan) {
        switch (pilihan) {
            case 1: return "Standard";
            case 2: return "Deluxe";
            case 3: return "Superior";
            case 4: return "Suite";
            case 5: return "Executive";
            default: return "Unknown";
        }
    }

    // Method untuk memilih status berdasarkan input angka
    private static String pilihStatus(int pilihan) {
        switch (pilihan) {
            case 1: return "Check In";
            case 2: return "Check Out";
            default: return "Unknown";
        }
    }

    // Method untuk memilih jenis kelamin berdasarkan input angka
    private static String pilihJenisKelamin(int pilihan) {
        switch (pilihan) {
            case 1: return "Laki-laki";
            case 2: return "Perempuan";
            default: return "Unknown";
        }
    }
}
