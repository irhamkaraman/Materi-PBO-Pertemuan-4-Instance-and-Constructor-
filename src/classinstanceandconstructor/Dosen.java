/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classinstanceandconstructor;

/**
 *
 * @author User
 */
public class Dosen {
    public String nama;
    protected String nip;
    private String mataKuliah;
    
    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    public Dosen(String nama, String nip, String mataKuliah) {
        this.nama = nama;
        this.nip = nip;
        this.mataKuliah = mataKuliah;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Dosen: " + nama);
        System.out.println("NIP Dosen: " + nip);
        if ( mataKuliah != null ) {
            System.out.println("Mata Kuliah: " + mataKuliah);
        }
    }
    
    public void tampilkanInfo(boolean format) {
        if (format) {
            System.out.printf("Dosen: %s (NIP: %s)\n", nama, nip);
        } else {
            tampilkanInfo();
        }
    }
}
