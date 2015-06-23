package pe.gob.pj.sinoe.ws.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import pe.gob.pj.sinoe.service.ConfParametroService;
import pe.gob.pj.sinoe.ws.service.NoviceService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


/**
 * Created by CSERRANOCA on 19/06/2015.
 */

@WebService(serviceName="novice")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class NoviceServiceImpl extends SpringBeanAutowiringSupport implements NoviceService  {

    @Override
    @WebMethod(operationName="saludo")
    public String saludo(String nombre) {
        return "Hola dicipulo " + nombre;
    }
}
