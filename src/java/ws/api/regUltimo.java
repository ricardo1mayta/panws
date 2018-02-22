/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.api;

import app.DAO.VentasDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrador
 */
@WebService(serviceName = "regUltimo")
public class regUltimo {

    /**
     * This is a sample web service operation
     */
   @WebMethod(operationName = "ultimo")
    public  int ultimo(@WebParam(name = "siscod") int siscod) {
        try {
           return VentasDAO.ultimoRegVentas(siscod);
       } catch (Exception e) {
           return 0;
       }
 
    }
}
