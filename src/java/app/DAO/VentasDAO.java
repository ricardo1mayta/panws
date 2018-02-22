/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.DAO;

import app.conexion.Conexion;
import app.pojos.bean.DLVentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sistemas05
 */
public class VentasDAO {

    public static String insertarVentas(DLVentas v) {
         String sql = "EXEC spa_insertar_ventaWS '" + v.getInvfec() + "','" + v.getCodalm() + "','" + v.getCuscod() + "','" + v.getCusnam() + "','" + v.getCusruc() + "','" + v.getCusadr() + "'," + v.getDestot() + "," + v.getDestot_n() + "," + v.getNetord() + "," + v.getTotord() + "," + v.getTotdto() + "," + v.getIgvord() + ",'" + v.getTpacod() + "','" + v.getDocpag() + "','" + v.getNumcmp() + "'," + v.getUsecaj() + ",'" + v.getInvsta() + "'," + v.getNumdoc() + ",'" + v.getTdofac() + "','" + v.getCodstd() + "','" + v.getTipcli() + "'," +v.getPrfnum()+ ",'" + v.getMedcod() + "','" + v.getPlnnum() + "','" + v.getDestot_p() + "','" + v.getCodpre() + "','" + v.getTipkar() + "','" + v.getTarcod() + "'," + v.getInvgnc() + "," + v.getInvppac() + "," +v.getInvpseg()+ "," + v.getInvcoa() + "," + v.getInvigv() + ",'" + v.getMednam() + "','" + v.getFecanu() + "'," + v.getUseanu() + "," + v.getSiscod() + "," + v.getCoscom_t() + "," + v.getCospro_t() + "," + v.getMondol() + "," + v.getTipcam() + "," + v.getInvuti_c() + "," + v.getInvuti_r() + "," + v.getInvuti_p() + ",'" + v.getEstado() + "','" + v.getFeccre() + "','" + v.getFecumv() + "'," + v.getUsecod() + ",'" + v.getUsenam() + "','" + v.getHostname() + "'," + v.getInvmmax() + ",'" + v.getPlnemmfa() + "','" + v.getInverd() + "'," + v.getTdoidser() + "," + v.getTotpuntos() + "," + v.getTotcompro() + ",'" + v.getTippln() + "'," + v.getTotdto_a() + ",'" + v.getMeddir() + "','" + v.getUbicod() + "'," + v.getInvnum_est() + ",'" + v.getCodanu() + "','" + v.getObsanu() + "','" + v.getDiacod() + "','" + v.getDirrep() + "','" + v.getObsrep() + "'," + v.getInvnum_cot() + "," + v.getInvnum_cen() + ",'" + v.getStaproc() + "','" + v.getMoncod() + "','" + v.getFecdoc() + "','" + v.getFktienda()+ "';";

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
            
            return "error en la venta ::"+v.getFktienda()+"<br>";
        }

    }
     public static int ultimoRegVentas(int idsede) {
        String sql = "select top 1 fkTienda from fa_ventas_cabeceraNueva where siscod="+idsede+" order by fkTienda desc ";
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
            id=rs.getInt("fktienda");
            }
            stm.close();
            rs.close();
            cn.close();
            return id;
        } catch (Exception ex) {
            
            return id ;
            
        }
        
    }
      public static void main(String[] args) {
      
          System.out.println(ultimoRegVentas(15));
    }
}
