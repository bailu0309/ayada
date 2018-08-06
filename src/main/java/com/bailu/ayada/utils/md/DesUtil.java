package com.bailu.ayada.utils.md;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


/**
 * 字符串工具集合
 *
 * @author Liudong
 */
public class DesUtil {

    private static final String PASSWORD_CRYPT_KEY = "CREATING!@#$%&";

    // 解密数据
    public static String decrypt(String message, String key) throws Exception {
        byte[] bytesrc = convertHexString(message);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        DESKeySpec desKeySpec = new DESKeySpec(JavaMD5.getMD5ofStr(key)
                .substring(0, 8).getBytes("UTF-8"));
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
        IvParameterSpec iv = new IvParameterSpec(JavaMD5.getMD5ofStr(key)
                .substring(0, 8).getBytes("UTF-8"));
        cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);
        byte[] retByte = cipher.doFinal(bytesrc);
        return new String(retByte, "UTF-8");
    }
    // 解密数据
    public static String decrypt(String message) throws Exception {
        byte[] bytesrc = convertHexString(message);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        DESKeySpec desKeySpec = new DESKeySpec(JavaMD5.getMD5ofStr(PASSWORD_CRYPT_KEY)
                .substring(0, 8).getBytes("UTF-8"));
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
        IvParameterSpec iv = new IvParameterSpec(JavaMD5.getMD5ofStr(PASSWORD_CRYPT_KEY)
                .substring(0, 8).getBytes("UTF-8"));
        cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);
        byte[] retByte = cipher.doFinal(bytesrc);
        return new String(retByte, "UTF-8");
    }

    public static String encrypt(String message, String key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        DESKeySpec desKeySpec = new DESKeySpec(JavaMD5.getMD5ofStr(key)
                .substring(0, 8).getBytes("UTF-8"));
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
        IvParameterSpec iv = new IvParameterSpec(JavaMD5.getMD5ofStr(key)
                .substring(0, 8).getBytes("UTF-8"));
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
        return toHexString(cipher.doFinal(message.getBytes("UTF-8")));
    }

    public static byte[] convertHexString(String ss) {
        byte digest[] = new byte[ss.length() / 2];
        for (int i = 0; i < digest.length; i++) {
            String byteString = ss.substring(2 * i, 2 * i + 2);
            int byteValue = Integer.parseInt(byteString, 16);
            digest[i] = (byte) byteValue;
        }
        return digest;
    }

    public static String toHexString(byte b[]) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            String plainText = Integer.toHexString(0xff & b[i]);
            if (plainText.length() < 2) {
                plainText = "0" + plainText;
            }
            hexString.append(plainText);
        }
        return hexString.toString();
    }

    public static void main(String[] args) throws Exception {
        String value = "01";
        // System.out.println(encrypt("124D7754F64C3E9C2C5B2DC0A92FD9F0",
        // PASSWORD_CRYPT_KEY));
        // System.out.println(encrypt("4AFB1EA187D2D82F", PASSWORD_CRYPT_KEY)
        // .toUpperCase());
        // System.out.println(decrypt("5EDC9A0ABF9167F4", PASSWORD_CRYPT_KEY));
        // System.out.println("加密数据:"+value);
        // System.out.println("密码为:");
        // DesUtil desUtil = new DesUtil();
        System.out.println("密码:");
        DesUtil desUtil = new DesUtil();
        System.out.println(encrypt("cf8f7b0e91cd42149c37eedef8efd0f2", "CREATING!@CDMS"));
        System.out.println(encrypt("padid=EB3A5A7D-31AE-492D-B28A-03DC1AF5228B&yid=9EA959F376ECCCE5577C3FC44207AAA28D6611D3DC049CE0CC24DCD8F2F28B4B4E052D5C12F3669E&fileadd=E:/TASKFILE/4/4.16/4.16.1/4.16.1.1/4.16.1.1.1/C/1/周报个人任务_20171212093608.xlsx&filename=周报个人任务.xlsx", PASSWORD_CRYPT_KEY).toUpperCase());
        System.out.println(decrypt("C9D4DB56501630516DFA80502E13079B55F55087A7BF4A11964A68C7C98DE76B7A205EF98852BACDEA0653FE832A2922509C20A598C17A9937EE92F098C047CB9633D647F091D38683399892EC95E1A4E43E017652E82A84E9F4144F35381DBFE8F7288A9AC6E439D709BF4A67F152BD49A618F5EED37EC960E1A594CAC817C8F3535CBDD3DF0E3BB006B4D81BE98A0758EE1C3E79F49F182754F1B438530A578564B1FB56B01A29D66913A279DB69917EA03A18E33F45EAF2011563235EC01A6E74FCF9456FD28F8E0598E74FB87D2324486EB4F41DBBF14C25CDF3B144521B7054159DA5A0367D4CAC781F10F30C6218F6C61B81FBA2C30CCA5AE8FB926DC8780D6B57213E7EAF", PASSWORD_CRYPT_KEY));
    }
}