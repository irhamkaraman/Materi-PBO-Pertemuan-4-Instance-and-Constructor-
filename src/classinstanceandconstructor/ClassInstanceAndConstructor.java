/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classinstanceandconstructor;

/**
 *
 * @author User
 */
public class ClassInstanceAndConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Lazuardi Irham Karaman", "123456789");
        dosen1.tampilkanInfo();
        System.out.println();
       
        Sekolah batuPermai = new Sekolah("Sekolah Batu Permai", "Jl. Batu Permai", "Jakarta");

        System.out.println("Informasi Sekolah Sebelum Diperbarui:");
        batuPermai.tampilkanInfo();
        System.out.println();

        batuPermai.setAlamatSekolah("Jl. Batu Permai No. 10");
        batuPermai.setKotaSekolah("Bandung");

        System.out.println("Informasi Sekolah Setelah Diperbarui:");
        batuPermai.tampilkanInfo();

    }
    
}
