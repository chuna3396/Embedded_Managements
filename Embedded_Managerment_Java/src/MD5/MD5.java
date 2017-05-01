/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MD5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.BASE64Encoder;

public class MD5 {

    public static String getMD5Hash(String s) throws NoSuchAlgorithmException {
        String result = s;
        if (s != null) {
            MessageDigest md = MessageDigest.getInstance("MD5"); // or "SHA-1"
            md.update(s.getBytes());
            BigInteger hash = new BigInteger(1, md.digest());
            result = hash.toString(16);
            while (result.length() < 32) { // 40 for SHA-1
                result = "0" + result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            String clearText = "1234";
//        String encryptedHash1 = null, encryptedHash2 = null;
//        try {
//            MD5 app = new MD5();
//            encryptedHash1 = app.encode(clearText);
//        } catch (Exception e) {
//        }
//        System.err.println(encryptedHash1);
//        Scanner inp = new Scanner(System.in);
//        String s = inp.nextLine();
//        try {
//            MD5 app = new MD5();
//            encryptedHash2 = app.encode(s);
//        } catch (Exception e) {
//        }

//        String result;
//        result = (encryptedHash1.equals(encryptedHash2)) ? "Đúng" : "Sai";
            String hexa = MD5.getMD5Hash(clearText);
            System.err.println(hexa);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MD5.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
