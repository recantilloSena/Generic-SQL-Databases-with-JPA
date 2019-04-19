///Reposirotrio

public class DataService {
    
    ConexionModelo conexion = ConexionModelo.getConexion(); 
	
	
	//Declaración de Servicios de Acceso a Datos//
    private EntidadDao entidadService;
	
	//Mapeo de Controllers//
     public EntidadDao entidadService(){
                entidadService = new  EntidadDao(conexion.getEntityManagerFactory());
		return entidadService ;
	}
	
	
	
	}