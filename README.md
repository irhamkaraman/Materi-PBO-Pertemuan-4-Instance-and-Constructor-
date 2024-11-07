# Sekolah Management System

Sistem manajemen sekolah dalam bahasa Java dengan konsep Object-Oriented Programming (OOP). Proyek ini menggunakan enkapsulasi untuk menjaga data dan memberikan akses yang terkontrol untuk mengelola informasi sekolah.

## Deskripsi Proyek

Proyek ini merupakan contoh implementasi kelas `Sekolah` yang mencakup pengelolaan informasi sekolah seperti nama, alamat, kota, dan negara. Kelas ini dilengkapi dengan konstruktor, setter, dan metode untuk menampilkan informasi sekolah.

## Fitur Utama

- **Enkapsulasi**: Menggunakan akses modifier untuk melindungi variabel sensitif.
- **Konstruktor**: Memudahkan pengaturan informasi saat objek `Sekolah` dibuat.
- **Setter**: Memungkinkan perubahan informasi tanpa mengakses data langsung.
- **Informasi Kelas**: Menampilkan informasi lengkap tentang sekolah melalui metode.

## Struktur Kode

### Kelas Sekolah

java package classinstanceandconstructor;

public class Sekolah { public String namaSekolah; private String alamatSekolah; protected String kotaSekolah; String negaraSekolah = "Indonesia";

public Sekolah(String namaSekolah, String alamatSekolah, String kotaSekolah) {
this.namaSekolah = namaSekolah;
this.alamatSekolah = alamatSekolah;
this.kotaSekolah = kotaSekolah;
}

public void setAlamatSekolah(String alamatSekolah) {
this.alamatSekolah = alamatSekolah;
}

public void tampilkanInfo() {
System.out.println("Nama Sekolah: " + namaSekolah);
System.out.println("Alamat Sekolah: " + alamatSekolah);
System.out.println("Kota Sekolah: " + kotaSekolah);
System.out.println("Negara Sekolah: " + negaraSekolah);
}

java package classinstanceandconstructor;

public class Sekolah { public String namaSekolah; private String alamatSekolah; protected String kotaSekolah; String negaraSekolah = "Indonesia";

java public class Main { public static void main(String[] args) { Sekolah batuPermai = new Sekolah("Sekolah Batu Permai", "Jl. Batu Permai", "Jakarta");

    batuPermai.tampilkanInfo();

    batuPermai.setAlamatSekolah("Jl. Batu Permai No. 10");
    batuPermai.setKotaSekolah("Bandung");

    System.out.println();
    batuPermai.tampilkanInfo();

}
}

## Instalasi

1. Clone repositori ini:
   bash git clone https://github.com/username/repo-name.git
2. Navigasi ke direktori proyek:
   bash cd repo-name
3. Kompilasi kode Java:
   bash javac Sekolah.java Main.java
4. Jalankan program:
   bash java Main

## Kontribusi

Jika Anda ingin berkontribusi pada proyek ini, silakan ikuti langkah-langkah berikut:

1. Fork repositori ini.
2. Buat cabang baru (`git checkout -b feature-branch`).
3. Lakukan perubahan dan commit (`git commit -m 'Add new feature'`).
4. Push perubahan Anda (`git push origin feature-branch`).
5. Buat pull request.

## Lisensi

Proyek ini dilisensikan di bawah [MIT License](LICENSE).

## Penulis

- **Nama Anda** - [Profil GitHub](https://github.com/username)

---

Terima kasih telah mengunjungi proyek ini! Jika Anda memiliki pertanyaan, silakan membuka isu atau menghubungi saya.
