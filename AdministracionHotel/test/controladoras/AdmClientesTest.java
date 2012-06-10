/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CARLOS
 */
public class AdmClientesTest {
    
    
    @Test
    
    public void SiStatusEsCeroNoExistenClientesRegistrados(){
        AdmCliente admCliente=new AdmCliente();
        assertEquals(0, admCliente.getClientes().size());
    }
    
    @Test
    
    public void SiStatusNoEsCeroExistenClientesRegistrados(){
        AdmCliente admCliente=new AdmCliente();
        admCliente.registrarCliente("001","Carlos","Vera","4039972","5402532","masculino","carlosvera@hotmail.com","av. peru 1232","lima"," ","peru","08/04/1984","Cliente Frecuente");
        assertEquals(1, admCliente.getClientes().size());
    }
    
    @Test
    
    public void SiStatusEsCeroNoExistenAgenciasRegistradas(){
        AdmAgencia admAgencia=new AdmAgencia();
        assertEquals(0, admAgencia.getAgencias().size());
    }
    
    @Test
    
    public void SiStatusNoEsCeroExistenAgenciasRegistradas(){
        AdmAgencia admAgencia=new AdmAgencia();
        admAgencia.registrarAgencia("100","Chazqui Wasi","2102532","chazquiwasi@gmail.com","av.primavera 1232","lima"," ","peru");
        assertEquals(1, admAgencia.getAgencias().size());
    }
    
    @Test
    
    public void SiStatusEsCeroNoExistenEmpresasRegistradas(){
        AdmEmpresa admEmpresa=new AdmEmpresa();
        assertEquals(0, admEmpresa.getEmpresas().size());
    }
    
    @Test
    
    public void SiStatusNoEsCeroExistenEmpresasRegistradas(){
        AdmEmpresa admEmpresa=new AdmEmpresa();
        admEmpresa.registrarEmpresa("200","Peru express","3879878","peruexpress@yahoo.com","av. lima 123","trujillo"," ","peru");
        assertEquals(1, admEmpresa.getEmpresas().size());
    }
}