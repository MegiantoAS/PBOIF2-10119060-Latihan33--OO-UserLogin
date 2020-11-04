/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserLogin;

/**
 *
 @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Daftar Film
 */
public class UserLogin {
    private String username;
    private String password;
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        statusAkun = ("RizkiAdam".equals(parUserName))&&("terbaikselalu".equals(parPassword));
        return statusAkun;
    }
    private void hasilLogin(boolean status, String parUserName){
        if (status == true) {
            System.out.println("*****HALLO"+parUserName+"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else{
            System.out.println("ooops, Username atau Password anda salah");
        }
    }
    public void pengecekanLogin(String parUserName, String parPassword){
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
    
}
