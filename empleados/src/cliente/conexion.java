/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;


//import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;


public class conexion {
    

 Connection cn;
public Connection conectar(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/BD_SAS","root","");
        System.out.println("CONECTADO");
        
    } catch (Exception e){
        System.out.println("ERROR"+e);
}
    return cn;
    
    
}

}