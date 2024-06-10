package model;

public class testEntrenadores {

	public static void main(String[] args) {
		 CRUD ope = new CRUD();  
         
		// prueba de listado       
		        for (Entrenadores e1 : ope.seleccionarTodo()) {
		            System.out.println(e1);
		        }
		        
		// prueba de insertar     
		        Entrenadores e1 = new Entrenadores();
		        e1.setApellido("Chuquiano");
		        e1.setEdad(Integer.parseInt("30"));
		        e1.setNacionalidad("Venezolana");
		        e1.setNombre("Jose");
		        ope.insertar(e1);     
		        
		// prueba de actualizar      
		        ope.actualizar(new Entrenadores(6,"Mendoza", Integer.parseInt("32"),"Brasileño","Diego"));
		                
		// prueba de eliminar
		        ope.eliminar(6);
		        
		    }
		}
