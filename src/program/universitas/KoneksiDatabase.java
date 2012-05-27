/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program.universitas;

/**
 *
 * @author Nda Edogawa
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        
        //cek apakah koneksi null
        if(koneksi==null){
            try{
                String url = "jdbc:mysql://localhost:3306/universitas";
                String user = "root";
                String password = "nda";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                koneksi = DriverManager.getConnection(url, user, password);
                
            }catch(SQLException t){
                System.out.println("Error membuat koneksi");
            }
        }
        return koneksi;
    }
}
