/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.DAO;

import app.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import app.pojos.bean.DLUsuarios;

/**
 *
 * @author Sistemas05
 */
public class UsuariosDAO {
    public static DLUsuarios validar_usuario( String us,String pw){
        String sql="select usepas,usenam,useusr,siscod from usuarios where usepas=? and useusr=? " ;
        //para ejecutar la instrucion sql con parametro ?,?
       PreparedStatement stm;
       
       //abrimos la ejecucion
        Connection cn=Conexion.abrir();
        //objeto que alamcena los datos en memoria
       ResultSet rs;
      
      
            //
       DLUsuarios  usuario=null;
       
        try {
            //asociar sql con objeto stm
            stm=cn.prepareStatement(sql);
        //asignar valor a los parametros ?,?
            stm.setString(1, pw);
            stm.setString(2, us);
            //esjecutar ojetos stm y asignar datos rs
            rs=stm.executeQuery();
            
            //leer
            if(rs.next()){
                //crear objeto usuario
                usuario=new DLUsuarios();
                //asignar datos a propiedades del objeto
                usuario.setUserPass(rs.getString(1));
                usuario.setUserName(rs.getString(2));
                usuario.setUserUsuario(rs.getString(3));
                usuario.setUsersiscod(rs.getInt(4));
               
            }
              
            
            
            stm.close();
            rs.close();
            cn.close();
        } catch (Exception ex) {
            System.out.println("error en la lista"+ex);
            return null; 
        }
       
       
      return usuario; 
    }
}
