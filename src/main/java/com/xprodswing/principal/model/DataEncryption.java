/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xprodswing.principal.model;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Paul EDIDE
 */
public class DataEncryption {
    private static String convertToHex(byte[] data){
    StringBuffer buf = new StringBuffer(); //La classe StringBuffer en Java est identique 
                                            //à la classe String, sauf qu’elle peut être modifiée
     for(int i=0; i< data.length; i++){
         int halfbyte = (data[i] >>> 4) & 0x0F;  //L'opérateur >>> est l'opérateur de décalage de bits 
                                                //vers la droite non signé en Java. Il divise effectivement l'opérande par 4 
                                                //à la puissance de l'opérande droit, ou juste 4 ici.
         int two_halfs = 0;
         
         do{
             if((0 <= halfbyte) && (halfbyte <= 9)){
             buf.append((char)('0'+halfbyte));
              } else{
                 buf.append((char)('a'+(halfbyte -10)));
             }
             halfbyte = data[i]&0x0F;
         }while(two_halfs++<1);
     } 
     return buf.toString();
    }
    
   public static String getSHA1(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException{
       MessageDigest md;  //La classe MessageDigest fournit aux applications la fonctionnalité d'un 
                          //algorithme de résumé de message, tel que SHA-1 ou SHA-256. 
       md = MessageDigest.getInstance("SHA-1");  //Je prend un algorithme
       byte[] sha1hash = new byte[40];
       md.update(text.getBytes("iso-8859-1"), 0, text.length());
       sha1hash = md.digest(); //Termine le calcul de hachage en effectuant des opérations finales 
                              //telles que le remplissage. Le résumé est réinitialisé après cet appel. 
       return convertToHex(sha1hash);
   } 
    
}
