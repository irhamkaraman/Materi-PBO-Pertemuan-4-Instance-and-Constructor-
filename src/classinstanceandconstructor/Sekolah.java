package classinstanceandconstructor;

public class Sekolah {
  public String namaSekolah;
  private String alamatSekolah; 
  protected String kotaSekolah;
  String negaraSekolah = "Indonesia";

  public Sekolah(String namaSekolah, String alamatSekolah, String kotaSekolah) {
    this.namaSekolah = namaSekolah;
    this.alamatSekolah = alamatSekolah;
    this.kotaSekolah = kotaSekolah;
  }

  
  public void setAlamatSekolah(String alamatSekolah) {
    this.alamatSekolah = alamatSekolah;
  }
  
  public void setKotaSekolah(String kotaSekolah) {
    this.kotaSekolah = kotaSekolah;
  }

  public void tampilkanInfo() {
    System.out.println("Nama Sekolah: " + namaSekolah);
    System.out.println("Alamat Sekolah: " + alamatSekolah);
    System.out.println("Kota Sekolah: " + kotaSekolah);
    System.out.println("Negara Sekolah: " + negaraSekolah);
  }
}
