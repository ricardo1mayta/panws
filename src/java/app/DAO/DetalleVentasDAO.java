/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.DAO;

import app.conexion.Conexion;
import app.pojos.bean.DLDetalleVentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Sistemas05
 */
public class DetalleVentasDAO {
    public static String insertarDetalleVentas(DLDetalleVentas v) {
         String sql = "EXEC spa_insertarDetalleventas '"+v.getCoditm()+"','"+v.getCodalm()+"','"+v.getCodpro()+"','"+v.getDespro()+"','"+v.getQtypro()+"','"+v.getQtypro_m()+"','"+v.getPripro()+"','"+v.getPrisal()+"','"+v.getCostod()+"','"+v.getStkalm()+"','"+v.getStkalm_m()+"','"+v.getDtopro()+"','"+v.getTotpar()+"','"+v.getTotdto_p()+"','"+v.getStkfra()+"','"+v.getCoapro()+"','"+v.getIgvpro()+"','"+v.getTipkar()+"','"+v.getCoscom()+"','"+v.getCospro()+"','"+v.getDestot_n()+"','"+v.getTotppac()+"','"+v.getTotpseg()+"','"+v.getPromo_sta()+"','"+v.getIgvpar()+"','"+v.getDtopro_a()+"','"+v.getCompro()+"','"+v.getPuntos()+"','"+v.getTotdto_ap()+"','"+v.getDtopro_ant()+"','"+v.getPrisal_u()+"','"+v.getPripro_u()+"','"+v.getInvnum_est()+"','"+v.getCompri()+"','"+v.getInvnum()+"'";
        //para ejecutar la instrucion sql con parametro ?,?
        PreparedStatement stm;

        //abrimos la ejecucion
        Connection cn = Conexion.abrir();
        //objeto que alamcena los datos en memoria
        ResultSet rs;
        String res="";
        
        try {
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            if(rs.next()){
            res= rs.getString("sms");
            }
            stm.close();
            rs.close();
            cn.close();
            
            
            return res+"<br>";
        } catch (Exception ex) {
            
            return "error en la venta ::"+v.getFkdetalle()+"<br>";
        }

    }
     public static int ultimoRegDetalleVentas(int idsede) {
        String sql = "select top 1 fkTienda from fa_ventas_detalleNueva where siscod="+idsede+" order by fkdetalle desc ";
        //para ejecutar la instrucion sql con parametro ?,?
        PreparedStatement stm;

        //abrimos la ejecucion
        Connection cn = Conexion.abrir();
        //objeto que alamcena los datos en memoria
        ResultSet rs;
        int id=0;
        try {
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            if(rs.next()){
            id=rs.getInt("fkdetalle");
            }
            stm.close();
            rs.close();
            cn.close();
            return id;
        } catch (Exception ex) {
            
            return id ;
            
        }
        
    }
    
}
