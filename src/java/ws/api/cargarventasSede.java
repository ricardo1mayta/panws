/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.api;

import app.DAO.VentasDAO;
import app.pojos.bean.DLVentas;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrador
 */
@WebService(serviceName = "cargarventasSede")
public class cargarventasSede {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "InsertarVentasTienda")
    public String InsertarVentasTienda(@WebParam(name = "invfec") String invfec, @WebParam(name = "codalm") String codalm, @WebParam(name = "cuscod") String cuscod, @WebParam(name = "cusnam") String cusnam, @WebParam(name = "cusruc") String cusruc, @WebParam(name = "cusadr") String cusadr, @WebParam(name = "destot") double destot, @WebParam(name = "destot_n") double destot_n, @WebParam(name = "netord") double netord, @WebParam(name = "totord") double totord, @WebParam(name = "totdto") double totdto, @WebParam(name = "igvord") double igvord, @WebParam(name = "tpacod") String tpacod, @WebParam(name = "docpag") String docpag, @WebParam(name = "numcmp") String numcmp, @WebParam(name = "usecaj") String usecaj, @WebParam(name = "invsta") String invsta, @WebParam(name = "numdoc") int numdoc, @WebParam(name = "tdofac") String tdofac, @WebParam(name = "codstd") String codstd, @WebParam(name = "tipcli") String tipcli, @WebParam(name = "prfnum") int prfnum, @WebParam(name = "medcod") String medcod, @WebParam(name = "plnnum") String plnnum, @WebParam(name = "destot_p") String destot_p, @WebParam(name = "codpre") String codpre, @WebParam(name = "tipkar") String tipkar, @WebParam(name = "tarcod") String tarcod, @WebParam(name = "invgnc") double invgnc, @WebParam(name = "invppac") double invppac, @WebParam(name = "invpseg") double invpseg, @WebParam(name = "invcoa") String invcoa, @WebParam(name = "invigv") String invigv, @WebParam(name = "mednam") String mednam, @WebParam(name = "fecanu") String fecanu, @WebParam(name = "useanu") int useanu, @WebParam(name = "siscod") int siscod, @WebParam(name = "coscom_t") String coscom_t, @WebParam(name = "cospro_t") String cospro_t, @WebParam(name = "mondol") String mondol, @WebParam(name = "tipcam") String tipcam, @WebParam(name = "invuti_c") String invuti_c, @WebParam(name = "invuti_r") String invuti_r, @WebParam(name = "invuti_p") String invuti_p, @WebParam(name = "estado") String estado, @WebParam(name = "feccre") String feccre, @WebParam(name = "fecumv") String fecumv, @WebParam(name = "usecod") int usecod, @WebParam(name = "usenam") String usenam, @WebParam(name = "hostname") String hostname, @WebParam(name = "invmmax") String invmmax, @WebParam(name = "plnemmfa") String plnemmfa, @WebParam(name = "inverd") String inverd, @WebParam(name = "tdoidser") String tdoidser, @WebParam(name = "totpuntos") String totpuntos, @WebParam(name = "totcompro") String totcompro, @WebParam(name = "tippln") String tippln, @WebParam(name = "totdto_a") String totdto_a, @WebParam(name = "meddir") String meddir, @WebParam(name = "ubicod") String ubicod, @WebParam(name = "invnum_est") String invnum_est, @WebParam(name = "codanu") String codanu, @WebParam(name = "obsanu") String obsanu, @WebParam(name = "diacod") String diacod, @WebParam(name = "dirrep") String dirrep, @WebParam(name = "obsrep") String obsrep, @WebParam(name = "invnum_cot") int invnum_cot, @WebParam(name = "invnum_cen") int invnum_cen, @WebParam(name = "staproc") String staproc, @WebParam(name = "moncod") String moncod, @WebParam(name = "fecdoc") String fecdoc,@WebParam(name = "fktienda") int fktienda) {
        DLVentas v = new DLVentas();
        v.setInvfec(invfec);
        v.setCodalm(codalm);
        v.setCuscod(cuscod);
        v.setCusnam(cusnam);
        v.setCusruc(cusruc);
        v.setCusadr(cusadr);
        v.setDestot(destot);
        v.setDestot_n(destot_n);
        v.setNetord(netord);
        v.setTotord(totord);
        v.setTotdto(totdto);
        v.setIgvord(igvord);
        v.setTpacod(tpacod);
        v.setDocpag(docpag);
        v.setNumcmp(numcmp);
        v.setUsecaj(usecaj);
        v.setInvsta(invsta);
        v.setNumdoc(numdoc);
        v.setTdofac(tdofac);
        v.setCodstd(codstd);
        v.setTipcli(tipcli);
        v.setPrfnum(prfnum);
        v.setMedcod(medcod);
        v.setPlnnum(plnnum);
        v.setDestot_p(destot_p);
        v.setCodpre(codpre);
        v.setTipkar(tipkar);
        v.setTarcod(tarcod);
        v.setInvgnc(invgnc);
        v.setInvppac(invppac);
        v.setInvpseg(invpseg);
        v.setInvcoa(invcoa);
        v.setInvigv(invigv);
        v.setMednam(mednam);
        v.setFecanu(fecanu);
        v.setUseanu(useanu);
        v.setSiscod(siscod);
        v.setCoscom_t(coscom_t);
        v.setCospro_t(cospro_t);
        v.setMondol(mondol);
        v.setTipcam(tipcam);
        v.setInvuti_c(invuti_c);
        v.setInvuti_r(invuti_r);
        v.setInvuti_p(invuti_p);
        v.setEstado(estado);
        v.setFeccre(feccre);
        v.setFecumv(fecumv);
        v.setUsecod(usecod);
        v.setUsenam(usenam);
        v.setHostname(hostname);
        v.setInvmmax(invmmax);
        v.setPlnemmfa(plnemmfa);
        v.setInverd(inverd);
        v.setTdoidser(tdoidser);
        v.setTotpuntos(totpuntos);
        v.setTotcompro(totcompro);
        v.setTippln(tippln);
        v.setTotdto_a(totdto_a);
        v.setMeddir(meddir);
        v.setUbicod(ubicod);
        v.setInvnum_est(invnum_est);
        v.setCodanu(codanu);
        v.setObsanu(obsanu);
        v.setDiacod(diacod);
        v.setDirrep(dirrep);
        v.setObsrep(obsrep);
        v.setInvnum_cot(invnum_cot);
        v.setInvnum_cen(invnum_cen);
        v.setStaproc(staproc);
        v.setMoncod(moncod);
        v.setFecdoc(fecdoc);
        v.setFktienda(fktienda);
        String m = VentasDAO.insertarVentas(v);
        String ms;
        if (m != null) {
           return m ;
        } else {
            return  "algo fallo";
        }
        
         
    }
}
