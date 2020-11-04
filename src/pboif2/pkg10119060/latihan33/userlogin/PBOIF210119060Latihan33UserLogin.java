/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan33.userlogin;
import java.util.Scanner;
import UserLogin.UserLogin;
/**
 *
 @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Daftar Film
 */
public class PBOIF210119060Latihan33UserLogin {
       private static String UsName;
       private static String password;
    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        UserLogin UsLog = new UserLogin();
        System.out.print("Masukan Username = ");
        UsName = input.next();
        System.out.print("Masukan Password = ");
        password = input.next();
        UsLog.pengecekanLogin(UsName, password);
    }
    
}
