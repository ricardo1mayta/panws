/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.api;

import app.DAO.UsuariosDAO;
import app.pojos.bean.DLUsuarios;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrador
 */
@WebService(serviceName = "login")
public class login {

    /**
     * This is a sample web service operation
     */
     @WebMethod(operationName = "logear")
    public int logear(@WebParam(name = "user") String user, @WebParam(name = "pass") String pass, @WebParam(name = "key") String key) {
        //TODO write your implementation code here:
        try {
            if (key.equals("fd5748gdfg86")) {
                
                    DLUsuarios usuario = UsuariosDAO.validar_usuario(user, pass);
                    return usuario.getUsersiscod();
                
                                
            } else {
                return 0;

            }
        } catch (Exception e) {
            return 0;
        }
            
        

    }
}
